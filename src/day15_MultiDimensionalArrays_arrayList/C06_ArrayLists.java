package day15_MultiDimensionalArrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayLists {
    public static void main(String[] args) {

        List<Integer> sayılar = new ArrayList<>();

        System.out.println(sayılar); // []

        sayılar.add(5);
        sayılar.add(8);
        sayılar.add(3);

        System.out.println(sayılar); // [5, 8, 3]

        sayılar.add(6);
        sayılar.add(9);

        System.out.println(sayılar); // [5, 8, 3, 6, 9]

        sayılar.add(2,11);
        // var olan elemaentleri degistirmez
        // istenen elemeti istenen index e yerleştirir
        // ve kalan elemanları geriye oteler

        System.out.println(sayılar); // [5, 8, 11, 3, 6, 9]

        List<Integer> rakamlar = new ArrayList<>();

        rakamlar.add(1);
        rakamlar.add(2);

        System.out.println(rakamlar); // [1, 2]

        rakamlar.addAll(sayılar);

        System.out.println(rakamlar); // [1, 2, 5, 8, 11, 3, 6, 9]


        rakamlar.addAll(1,sayılar);

        System.out.println(rakamlar); // [1, 5, 8, 11, 3, 6, 9, 2, 5, 8, 11, 3, 6, 9]






    }
}
