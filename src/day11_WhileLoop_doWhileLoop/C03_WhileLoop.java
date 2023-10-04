package day11_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {

        // kulanıcıdan toplamak üzere sayılar isteyin
        // kullanıcı 0' a basıncaya kadar işlemi tekrar ettirin
        // kulanıcıc 0' a bastıgında girilen sayıların toplamını yaazdırım

        // döngünün kaç kere çalışacagı belli olmayan işlemlerde While loop tercih edilir

        Scanner scanner = new Scanner(System.in);
        double sayı = 44;
        double toplam = 0;
        /*

        kulanıcıdan alacagımız sayı 0 olmadı sürece çalışcak
        loop dan once bu sayı oluşturmamız gerekirki
        while () icinde kullanabilielim

        NOT : ilk deger ataması yaparken
        loop un ilk çalıştırması engellemeye bir deger atamaya
        DİKKAT EDİLMELİDİR
         */

        while (sayı != 0){ // kulanıcı 0'a basıncaya kadar

            System.out.println("Toplanmak üzere sayılar giriniz \nBitirmek için 0' a basınız");

            sayı = scanner.nextDouble();

            toplam += sayı;
       }
        System.out.println("Girilen sayıların toplamı : " + toplam);

    }
}
