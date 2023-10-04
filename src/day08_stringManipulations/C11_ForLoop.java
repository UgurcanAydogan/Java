package day08_stringManipulations;

import java.util.Scanner;

public class C11_ForLoop {
    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tam sayı degeri isteyin
        // o sayıya kadar olan tüm pozitif tamsayılarını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı giriniz ");
        int sayı = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayı; i++) {

            toplam += i;
        }

        System.out.println(sayı + "ye kadar olan pozitif tam sayıların toplamı : " + toplam);

    }
}
