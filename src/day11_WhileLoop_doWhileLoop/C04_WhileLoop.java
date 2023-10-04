package day11_WhileLoop_doWhileLoop;

import day10_methotOlusturma_methodOverloading.C05_AsalSayımıDondur;
import day10_methotOlusturma_methodOverloading.C06_AsalSayılarıBulma;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        // kullaıcıdan bir asal sayı girmesini isteyin
        // kullanıcı asal sayı girmezse "Bu asal degil tekrar dene yazdırın"
        // kulanıcı asal sayı girdiğinde "işlem başarılı olarak tamamlandı" yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayı = 6;


        while (!C05_AsalSayımıDondur.aslaMıDondur(sayı)){ // while loop buluen sart false oldugu sürece çalışır

            System.out.println("Lütfen asal bir sayı giriniz");
            sayı = scanner.nextInt();

            if (C05_AsalSayımıDondur.aslaMıDondur(sayı)){
                System.out.println("işlem basarılı olarak tamamladı");
            }else {
                System.out.println("Bu asal değil tekrar dene");
            }

        }

    }
}
