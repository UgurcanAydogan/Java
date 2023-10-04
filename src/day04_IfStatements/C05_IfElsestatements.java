package day04_IfStatements;

import java.util.Scanner;

public class C05_IfElsestatements {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char krk = scanner.next().charAt(0);

        if (krk >= 'A' && krk <= 'Z') {
            System.out.println("girilen karakter büyük harf");
        } else {
            System.out.println("girilen karakter büyük harf degil");
        }


    }
}
