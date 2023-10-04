package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C02_FactoryelYazdırma {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //          Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 20 den küçük pozitif bir tam sayı giriniz");
        int sayı = scanner.nextInt();

        long faktoryelSonucu = 1;

        System.out.print(sayı + "! = "); //6

        for (int i = sayı; i >= 1; i--) {

            faktoryelSonucu *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.println(faktoryelSonucu);
    }
}
