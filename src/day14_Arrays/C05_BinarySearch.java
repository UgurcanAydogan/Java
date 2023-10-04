package day14_Arrays;

import day13_Arrays.C06_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 8, 2, 9, 12, -1, 4, 3};

        // arr de 5 in olup olmadıgını ve varsa kaç tane oldugunu yazdırın
        C06_Arrays.elemanSayısıYazdır(arr, 5);


        // arr de 3 in olup olmadıgını ve varsa kaç tane oldugunu yazdırın
        C06_Arrays.elemanSayısıYazdır(arr, 3);

        System.out.println("==========");
        System.out.println(Arrays.binarySearch(arr, 8)); // -11
        System.out.println(Arrays.binarySearch(arr, 9)); // -11
        System.out.println(Arrays.binarySearch(arr, 2)); // 4 ==> doğru buldu
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        // binarySearch() kullanmadan once sort() kullanmazsanız
        // sonucu ne olacak BİLMEYİZ
        // doğru da olabilir yanlış da olabilir

        String[] isimler = {"Uğurcan", "Aybar", "Hüseyin", "Ömer", "Azim" };
        // isimler aybar ın olup olmadıgını döndüren bir method oluştrun


        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Uğurcan, Aybar, Hüseyin, Ömer, Azim]


        // Array de arama yapmadan once sort YAPILMALIDIR
        // aradığımız element varsa ilk kullandıgımız index e döndürür
        System.out.println(Arrays.binarySearch(isimler, "Aybar")); // 0
        System.out.println(Arrays.binarySearch(isimler, "Uğurcan")); // 3
        System.out.println(Arrays.binarySearch(isimler, "Ömer")); // 4


        // eleman yoksa olsaydı hangi sırada olacagını eksi işareti ile döndürür
        System.out.println(Arrays.binarySearch(isimler, "Ayca")); // -2
        System.out.println(Arrays.binarySearch(isimler, "Deniz")); // -3

    }
}
