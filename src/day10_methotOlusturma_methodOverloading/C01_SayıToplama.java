package day10_methotOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_SayıToplama {

    public static void main(String[] args) {

        // verilen 2 yasıyı toplayıp sonucu yazdırıan bir method oluşturun


        toplaYazdır(5, 6.4); // Verilen iki sayının toplamı : 11.4
        toplaYazdır(7, 6); // Verilen iki sayının toplamı : 13.0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplamak üzere iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();

        toplaYazdır(sayı1, sayı2);


    } // maain method sonu


    public static void toplaYazdır(double sayı1, double sayı2) {
        System.out.println("Verilen iki sayının toplamı : " + (sayı1 + sayı2));
    }


}// clas sonu
