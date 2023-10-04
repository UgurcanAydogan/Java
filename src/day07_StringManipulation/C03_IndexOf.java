package day07_StringManipulation;

import java.util.Scanner;

public class C03_IndexOf {
    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 2 kere kullanilmis
        // - Cumlede aranan metin 2'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = 0;
        int ikinciIndex = 0;
        int ucuncuIndex = 0;

        ilkIndex = cümle.indexOf(metin); // -1 veya kullanınan index

        if (ilkIndex == -1) {
            System.out.println("Cumle aranan metni icermiyor");
        } else if ((ilkIndex = cümle.indexOf(metin, ilkIndex + 1)) == -1) { // mutlaka kulanılmış ama kaç defa kullanılıdığını bilmiyoruz
            // ilk index -1 değil ikici index -1
            System.out.println(" Cumlede aranan metin sadece 1 kere kullanilmis");

        } else {
            // ilk index -1 değil ikinci index -1 değil
            // şimdiki sorumuz sadece 2 taenemi var yoksa 2 den fazlamı ?


            ucuncuIndex = cümle.indexOf(metin, ilkIndex + 1);
            //ucuncu index == -1 olabilir veya var olan vbir index olabilir

            if (ucuncuIndex == -1) {
                //ilkindex -1 değil ikiciindex -1 ama ucuncuindex -1 değil
                System.out.println(" Cumlede aranan metin 2'den kullanilmis");
            } else {
                System.out.println(" Cumlede aranan metin 2'den fazla kullanilmis");
            }

        }


    }
}
