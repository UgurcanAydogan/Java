package day05_NesdetIfElse_ternary_switch;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {
        // kulanıcıdan bir tam sayı alın
        // sayı pozitifse 100 den büyük veya kücük oldugunu yazdırın
        // sayı negatifse tek veya cift oldugunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tm sayı giriniz");
        int sayı = scanner.nextInt();

        System.out.println(
                sayı > 0
                        ?
                        //sayi 0'dan buyukse yazdirilacak kisim
                        sayı > 100 ? "sayi buyuk" : "sayi kucuk"
                        :
                        // sayi negatifse
                        sayı % 2 == 0 ? "Sayi cift" : "Sayi tek"
        );
        /*
        System.out.println(
                sayi > 0 ? sayi>100 ? "sayi buyuk" : "sayi kucuk" : sayi %2 == 0 ? "Sayi cift" : "Sayi tek");
         */


    }
}
