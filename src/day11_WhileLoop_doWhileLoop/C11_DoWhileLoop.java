package day11_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C11_DoWhileLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //        sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise degeri tam kara değilse uyarı yazdırın
        //        Ornek : input : 16, output: 4
        //                input : 23, output: tamkare degil

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen tam kare olmasını kontrol etmek için bir tam sayı giriniz");
        int girilenSayı = scanner.nextInt();
        int karekök = 1;


        do {

            if (karekök * karekök == girilenSayı){
                System.out.println("Girilen sayı bir tamkare. karekök değeri : " + karekök);
            }
            karekök++;
        }while (karekök * karekök <= girilenSayı);

    }
}
