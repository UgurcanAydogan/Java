package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //         rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int girilenSayı = scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        for (int i = girilenSayı; i > 0; i /= 10) {

            rakam = i % 10;
            rakamlarToplamı += rakam;

        }
        System.out.println(girilenSayı + " Girilen sayısının rakamlar toplamı : " + rakamlarToplamı);


        // aynı soruyu basamak sayısı kadar tekrar ederek çözelim.

        rakamlarToplamı = 0;
        rakam = 0;
        int basamakSayısı = (girilenSayı + "").length();
        int sayı = girilenSayı;


        //1234 basamak sayısı : 4
        for (int i = 1; i <= basamakSayısı; i++) { // basamak sayısına göre loop oluşturalaım
            rakam = sayı % 10;
            rakamlarToplamı += rakam;
            sayı /= 10;
        }
        System.out.println(girilenSayı + " Girilen sayısının rakamlar toplamı : " + rakamlarToplamı);

    }
}
