package day11_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C09_DoWhileLoop {
    public static void main(String[] args) {

        // kulanıcıdan toplamak üzere sayılar isteyin
        // kullanıcı 0' a basıncaya kadar işlemi tekrar ettirin
        // kulanıcıc 0' a bastıgında girilen sayıların toplamını yaazdırım

        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        int sayı= 0;

        do {
            System.out.println("Lütfen toplanmak üzere bir sayı giriniz\nişlemi bitirmek için 0' a basınız");
            sayı = scanner.nextInt();

            toplam += sayı;
        }while (sayı != 0);

        System.out.println("Girilen sayıların toplamı : " + toplam);
    }
}
