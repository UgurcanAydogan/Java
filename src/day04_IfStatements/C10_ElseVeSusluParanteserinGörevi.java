package day04_IfStatements;

import java.util.Scanner;

public class C10_ElseVeSusluParanteserinGörevi {
    public static void main(String[] args) {
        // musteriden satın aldıgı urun adedini isteyin
        // adet 100 den fazla ise % 20 indirim kazandınız
        // adet 50 den fazla ise %10 indirim yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen satın aldıgınız urun adedini giriniz");
        int adet = scanner.nextInt();

        if (adet > 100) {
            System.out.println("%20 indirim kazandınız");
            System.out.println("bizi tercih ettiginiz icin tessekür ederiz");
            System.out.println("kapmpanyalarımız hakkında detay icin web sitemize bakınız");
        } else if (adet > 50) {
            System.out.println("%10 indirim kazandınız");
            System.out.println("bizi tercih ettiginiz icin tessekür ederiz");
            System.out.println("kapmpanyalarımız hakkında detay icin web sitemize bakınız");
        }

        /*
        if else-if... cumleleri else ile bitmek zorunda degildir
        AMMA eger else ile bitmezse bazı degerlerin kapsam dışında kalacagını bilmemiz gerekir

        EGER if veya else if lerde sonra { } kullanılmazsa
        java ilk ; kadar olan kısmı bady olarak kabul eder

        geriye kalan kodları if else if statment ile ilgisiz kabul eder

        NOT : eger if veya else bady niz sadece 1 satır ise
              { } kullanmadan kod yazabilirsiniz
              ANCAK body'ye yazmaniz gereken satir sayisi 1'den fazla ise
              MUTLAKA { } kullanmalisiniz
         */


    }
}
