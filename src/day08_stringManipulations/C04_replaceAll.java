package day08_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        // kullanıcıdan isim soy isim ve kart numarası alın
        // assadaki şekilde yazdırın
        // İsim Soyisim : U**** A****
        // Kart No : 1234 **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen İsminizi giriniz");
        String isim = scanner.next();

        System.out.println("lütfen Soyisminizi giriniz");
        String soyisim = scanner.next();

        System.out.println("lütfen kart numaranızı giriniz");
        String kartNo = scanner.next();

        String yıldızlıİsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\w", "*");


        String yıldızlıSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\w", "*");

        String yıldızlıkartNo = kartNo.substring(0, 4) + "**** **** ****";


        System.out.println("İsim soyisim : " + yıldızlıİsim + " " + yıldızlıSoyisim);
        System.out.println("Kart No : " + yıldızlıkartNo);


    }
}
