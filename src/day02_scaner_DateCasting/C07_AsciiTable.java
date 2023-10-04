package day02_scaner_DateCasting;

import java.util.Scanner;

public class C07_AsciiTable {
    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); // 97 + 98 = 195

        char chr3 = '1';
        char chr4 = '2';
        System.out.println(chr3 + chr4); // 49 + 50 = 99


        int sayı1 = chr1;
        /*
        char data turu özel bir duruma sahiptır
        eger char data turunddeki bir degeri
        matamatiksel islem yaparsanız
        veya sayısal bir data turundekine atama yaparsanız
        ascii table dakı değeri işleme girer
         */

        System.out.println("char 'a' nın int karsılıgı : " + sayı1);
        // char 'a' nın int karsılıgı : 97

        // kulanıcıdan bir char alıp
        // ascıı table da o karakterden sonra gelen 3 karakteri yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ascii table den bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonrası ki karakter : " + (char) (krk + 1));
        System.out.println("girilen karakterden 1 sonrası ki karakter : " + (char) (krk + 2));
        System.out.println("girilen karakterden 1 sonrası ki karakter : " + (char) (krk + 3));
    }
}
