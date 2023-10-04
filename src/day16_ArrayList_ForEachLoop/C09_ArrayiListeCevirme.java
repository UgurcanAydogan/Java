package day16_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C09_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {3,4,5,6,7,9,0,8,5,7,1,2,1};
        /*
            uzun bir array i liste cevirmenin
            en kılanıslı yolu
            bir for-loop ile elementleri tasımaktır

            arrys class ında asList() method u arry i listede cevirir
            ANCAK 2 büyük problemi vardır

            1- array'den cevirdigimiz list'e ekleme cikarma gibi
               size'i degistiren islemler yapamazsiniz
            2- bu method array ve cevirdigi list'i eslestirir
               array'de yaptiginiz degisiklik list'e
               list'te yaptiginiz degisiklik array'e islenir
         */

        List<Integer> sayılar = Arrays.asList(arr);

        System.out.println("Sayılar listesi : " + sayılar);
        // Sayılar listesi : [3, 4, 5, 6, 7, 9, 0, 8, 5, 7, 1, 2, 1]

        // sayılar.add(10); // UnsupportedOperationException
        // sayılar.add(3); // UnsupportedOperationException

        System.out.println("Array : " + Arrays.toString(arr));
        // Array : [3, 4, 5, 6, 7, 9, 0, 8, 5, 7, 1, 2, 1]

        // Array'in 0.index'indeki sayiyi 33 yapin
        arr[0] = 33;
        System.out.println("Array : "+Arrays.toString(arr));
        // Array : [33, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]
        System.out.println("array'i degistirdikten sonra Sayilar Listesi : " + sayılar);




    }
}
