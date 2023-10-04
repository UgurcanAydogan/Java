package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C05_StringTerseCevirme {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve
        //                      String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen terse cevirmek icin bir metin yazın");
        String girilenMetin = scanner.nextLine();

        // Ali topu at
        // ta upot ilA

        // tersMetin = ""; +t+a" "+u+p.....+A
        String tersMetin = "";
        for (int i = girilenMetin.length() - 1; i >= 0; i--) {
            tersMetin += girilenMetin.charAt(i);
        }
        System.out.println("girilen metnin ters hali : " + tersMetin);

        // tersi ile düzden yazılışı aynı olan metinlere palidronme denir
        // girilen metnin palidronme olup olmadığını yazdıralım

        if (girilenMetin.equalsIgnoreCase(tersMetin)) {
            System.out.println("Girilen metin polidrome");
        } else {
            System.out.println("Girilen metin polidreme değildir");
        }


    }
}
