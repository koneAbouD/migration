import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class numerotation {
    public static void main(String[] args) {
        List<String> mtn = List.of("04", "05", "06", "44", "45", "46", "54", "55", "56", "64", "65", "66", "74", "75", "76", "84", "85", "86", "94", "95", "96");
        List<String> orange = List.of("07", "08", "09", "47", "48", "49", "57", "58", "59", "67", "68", "69", "77", "78", "79", "87", "88", "89", "97", "98");
        List<String> moov = List.of("01", "02", "03", "40", "41", "42", "43", "50", "51", "52", "53", "70", "71", "72", "73");

        List<String> phone = List.of("22571540916", "+22549105043", "022545672390", "0022503342917", "67291634");

        for (String numero : phone) {
            if (numero.length() >= 8) {
                String prefixe = numero.substring(numero.length() - 8, numero.length() - 6);
                System.out.println("Numero : "+numero);
                System.out.println("le prefixe est " + prefixe);

                Iterator<String> mtnPrefix = mtn.iterator();
                Iterator<String> orangePrefix = orange.iterator();
                Iterator<String> moovPrefix = moov.iterator();

                StringBuffer numeroTransforme = new StringBuffer(numero.substring(numero.length() - 8));

                while (mtnPrefix.hasNext()) {
                    if (mtnPrefix.next().equals(prefixe)) {
                        System.out.println("le numero appartient au reseau MTN");
                        System.out.println("le numero de téléphone transformé est " + numeroTransforme.insert(0, "05"));
                        System.out.println();
                    }
                }
                while (orangePrefix.hasNext()) {
                    if (orangePrefix.next().equals(prefixe)) {
                        System.out.println("le numero appartient au reseau Orange");
                        System.out.println("le numero de téléphone transformé est " + numeroTransforme.insert(0, "07"));
                        System.out.println();
                    }
                }
                while (moovPrefix.hasNext()) {
                    if (moovPrefix.next().equals(prefixe)) {
                        System.out.println("le numero appartient au reseau Moov");
                        System.out.println("le numero de téléphone transformé est " + numeroTransforme.insert(0, "01"));
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Le numero n'est pas correcte");
            }
        }
    }
}
