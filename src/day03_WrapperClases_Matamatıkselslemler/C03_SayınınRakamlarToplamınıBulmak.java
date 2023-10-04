package day03_WrapperClases_Matamatıkselslemler;

import java.util.Scanner;

public class C03_SayınınRakamlarToplamınıBulmak {
    public static void main(String[] args) {

        // kulanıcıdan 3 bassamaklı pozitif bir tam sayı alıp
        // sayının rakamlar toplamını yazdırın


        Scanner scaner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz");

        int girlenSayı = scaner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        // girilen sayi : 257 , rakam : 0 , rakamlar toplami = 0

        rakam = girlenSayı % 10; // 7
        rakamlarToplamı = rakamlarToplamı + rakam; // 0 + 7 = 7
        girlenSayı = girlenSayı / 10; //  257 / 10 ==> 25,7 ==> 25

        // girilen sayi : 25 , rakam : 7 , rakamlar toplami = 7

        rakam = girlenSayı % 10; // 25 % 10 ==> 5
        rakamlarToplamı = rakamlarToplamı + rakam; // 7 + 5 ==> 12
        girlenSayı = girlenSayı / 10; // 25 / 10 ==> 2

        // girilen sayi : 2 , rakam : 5 , rakamlar toplami = 12

        rakam = girlenSayı % 10; // 2 % 10 ==> 2
        rakamlarToplamı = rakamlarToplamı + rakam; // 12 + 2 ==> 14
        girlenSayı = girlenSayı / 10; // 2 / 10 ==> 0.2 ==>0


        System.out.println("Girilen sayinin rakamlari toplami : " + rakamlarToplamı);


    }
}
