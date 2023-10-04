package day08_stringManipulations;

import java.util.Scanner;

public class C07_StringManipulations {
    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip,
        //          asagidaki sartlari kontrol edin ve
        //          kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //            - ilk harf kucuk harf olmali
        //            - son karakter rakam olmali
        //            - sifre bosluk icermemeli
        //            - uzunlugu en az 10 karakter olmali


        //  flag kullanalım
        int flag = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        // ilk harf kücük harf olmalı
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk harf büyük küçük harf olmalı");
            flag = 11;
        }


        // son karakter rakam olmalı
        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("son karakter rakam olmalı");
            flag = 11;
        }


        // sifre boşluk içermemeli

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk içermememli");
            flag = 11;
        }


        // uzunlugu en az 10 karakter olmalı

        if (!(sifre.length() >= 10)) { // sifte.length() olmalı
            System.out.println("sifrenin uzunlugu en az 10 karakter olmalı");
            flag = 11;
        }


        // bagımsız if cümlerlerden sonra
        // flag ya 10 degrinde olacak yada 11

        if (flag == 10) {
            System.out.println("sifreniz basarıyla kayıt edildi");
        }


    }
}
