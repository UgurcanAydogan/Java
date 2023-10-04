package day15_MultiDimensionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {
    public static void main(String[] args) {

        List<Integer> sayılar = new ArrayList<>();

        System.out.println(sayılar); // []

        System.out.println(sayılar.size()); // 0


        System.out.println("Liste bos mu : " + sayılar.isEmpty());


        sayılar.add(5);
        sayılar.add(0,7);

        System.out.println(sayılar); // [7, 5]

        System.out.println(sayılar.size()); // 2

        System.out.println("Liste bos mu : " + sayılar.isEmpty());


        System.out.println(sayılar.contains(5)); // true
        System.out.println(sayılar.contains(3)); // false

        sayılar.add(3);
        sayılar.add(2);
        sayılar.add(8);
        System.out.println(sayılar); // [7, 5, 3, 2, 8]

        List<Integer> rakamlar = new ArrayList<>();

        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);

        System.out.println(sayılar.containsAll(rakamlar)); // true

        rakamlar.add(9);
        System.out.println(rakamlar); // [3, 8, 5, 9]

        System.out.println(sayılar.containsAll(rakamlar)); // false



    }
}
