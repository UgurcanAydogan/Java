package day07_StringManipulation;

import java.util.Scanner;

public class C05_LastIndexOf {
    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 2 kere kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = cümle.indexOf(metin); // -1 veya index
        int sonIndex = cümle.lastIndexOf(metin); // -1 veya index

        if (ilkIndex == -1) {
            System.out.println("Cumle aranan metni icermiyor");
        } else if (ilkIndex == sonIndex) {
            System.out.println("cumlede aranan metin sadece 1 kere kullanilmis");
        } else {
            System.out.println("Cumlede aranan metin sadece 2 kere kullanilmis");
        }


    }
}
