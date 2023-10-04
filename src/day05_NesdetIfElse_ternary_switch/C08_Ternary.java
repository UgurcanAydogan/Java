package day05_NesdetIfElse_ternary_switch;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        /*
        büyük olmayan demekle kücük olmayan demek farklıdır
        cünkü 9 ve 9 verildiginde büyük olmayan 9
        9 ve 9 verildiğinde kücük olan yoktur
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();

        System.out.println(sayı1 > sayı2 ? sayı2 : sayı1);
    }
}
