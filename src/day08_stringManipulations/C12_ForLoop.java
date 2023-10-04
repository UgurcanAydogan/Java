package day08_stringManipulations;

import java.util.Scanner;

public class C12_ForLoop {
    public static void main(String[] args) {
        //  Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //          sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //          Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangıc degerı giriniz");
        int bas = scanner.nextInt();


        System.out.println("bitis degerı giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < bas) {
            System.out.println("bitiş degeri baslangıc degerinden kücük olamaz");
        } else { // bu durum toplam hesaplayacagımız durumdur

            for (int i = bas; i <= bitis; i++) {

                toplam += i;
            }

            System.out.println("girilen aralıktaki sayıların toplamı : " + toplam);
        }


    }
}
