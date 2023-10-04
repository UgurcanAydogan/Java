package day10_methotOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_MaximumSayıBulma {
    public static void main(String[] args) {

        // kullanıcıdan method içerisinde 3 sayı alın
        // bu 3 sayıda en büyük olanı yazdıran bir method oluşturun

    }

    public static void enBüyükSayıyazdır() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("en büyük sayıyı bulmak için, 3 adet sayı giriniz");

        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();
        double sayı3 = scanner.nextDouble();

        if (sayı1 > sayı2 && sayı1 > sayı3) System.out.println("En büyük sayı: " + sayı1);
        else if (sayı2 > sayı1 && sayı2 > sayı3) System.out.println("En büyük sayı: " + sayı2);
        else if (sayı3 > sayı1 && sayı3 > sayı2) System.out.println("En büyük sayı :" + sayı3);
        else System.out.println("En buyuk sayiyi bulamadim");

    }

}



