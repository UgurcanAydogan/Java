package day32_maps;

import java.util.Arrays;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // bir ogrencinin bilgileri arada - olacak String bir variableye atanmistir
        // isim-spyisim-sinif-sube-bolum
        // bu formatta verilen bilgiden, subeyi yazdiran bir method olusturun

        String bilgi = "Ali Can-Yildiz-10-K-MF";

        subeYazdir(bilgi); // K

        // ogrencinin isim ve soyisimini yazdiran bir method olusturun

        isimSoyisimYazdir(bilgi); //  Ali Can Yildiz


    }

    public static void subeYazdir (String bilgi){

        String[] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, MF]

        System.out.println("Ogrenci sube : " + bilgilerArr[3]);


    }

    public static void isimSoyisimYazdir(String bilgi){

        String[] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, MF]
        System.out.println("Isim ve soyisim : " + bilgilerArr[0] + " "+ bilgilerArr[1]);

    }
}
