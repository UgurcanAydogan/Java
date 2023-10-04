package day02_scaner_DateCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {
        // soru 7 - (ıntervion) kulanıcıdan ilk sayı alıp
        //                      ikisinde degerleriini degistirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tamsayı giriniz");
        int sayı1 = scanner.nextInt();

        System.out.println("Lütfen ikinci tamsayı giriniz");
        int sayı2 = scanner.nextInt();

        System.out.println("Girdiginiz degerler : sayı1 = " + sayı1 + ", sayı2 = " + sayı2);

        int bosKova = 0;

        bosKova = sayı2;

        sayı2 = sayı1;

        sayı1 = bosKova;


        System.out.println("Girdiginiz degerler : sayı1 = " + sayı1 + ", sayı2 = " + sayı2);

    }

    public static class C05_DateCasting {
    }
}
