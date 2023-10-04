package day04_IfStatements;

import java.util.Scanner;

public class C06_IfElSestatments {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char krk = scanner.next().charAt(0);

        if (krk >= 'a' && krk <= 'z') {
            System.out.println(Character.toUpperCase(krk));
        } else {
            System.out.println(krk);
        }


    }
}
