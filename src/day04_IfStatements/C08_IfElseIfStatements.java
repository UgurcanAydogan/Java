package day04_IfStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // ogrenciden notu alıp geçtın veya kaldın yazdıralım
        // öğrencı 0 kücük veya 100 büyük not girerse
        // gecersiz not yazdıralım

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not > 100 || not < 0) {
            System.out.println("gecersiz not");
        } else if (not >= 50) {
            System.out.println("sınıfı geçtiniz");
        } else {
            System.out.println("malesef kaldınız");
        }


    }
}
