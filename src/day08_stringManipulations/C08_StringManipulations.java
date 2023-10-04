package day08_stringManipulations;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {

        //  Soru 6 : Kullanicidan alinan bir String alin,
        //           String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //           String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :disappointed: yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girlenMetin = scanner.nextLine();

        int uzunluk = girlenMetin.length();
        String yeniHal = "";

        if (uzunluk % 2 == 0) { // uzunluk çift ise

            yeniHal = girlenMetin.substring(0, uzunluk / 2) +
                    ":)" +
                    girlenMetin.substring(uzunluk / 2);

        } else { // uzunluk tek ise
            yeniHal = girlenMetin.substring(0, uzunluk / 2) +
                    ":(" +
                    girlenMetin.substring((uzunluk + 1) / 2);
        }

        System.out.println(girlenMetin + " yazdınız ve ben onu değiştirdim : " + yeniHal);

    }
}
