package day02_scaner_DateCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // soru 5 - kulanıcıdan ismini soyismini ve yasını alıp asadakı formata yazdırın
        //          girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        char ilkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lütfen Soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yasınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + ilkHarf + " " + soyisim + ", " + yas);

    }

    public static class CO2_Scanner {
        public static void main(String[] args) {
            // soru4- kulanıcıdan bir dikdortgen 2 kenar uzunluıgu alıp
            //        dıktorgen alanı yazdırın

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen dikdörtgenın kenar uzunlugunu giriniz");

            double kenar1 = scanner.nextDouble();
            double kenar2 = scanner.nextDouble();
            System.out.println("dikdortgenin alanı : " + kenar1 * kenar2);

        }
    }
}
