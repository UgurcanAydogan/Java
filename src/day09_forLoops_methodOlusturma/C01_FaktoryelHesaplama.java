package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C01_FaktoryelHesaplama {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         5! = 5*4*3*2*1


        Scanner scanner = new Scanner(System.in);
        System.out.println("20 den kücük pozitif bir tam sayı giriniz");
        int sayı = scanner.nextInt();

        int faktoryelSonuc = 1;

        for (int i = sayı; i >= 1; i--) {

            faktoryelSonuc *= i;
        }
        System.out.println("verilen sayının faktoryel degeri : " + faktoryelSonuc);

    }
}
