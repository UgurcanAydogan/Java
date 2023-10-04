package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_equals {
    public static void main(String[] args) {

        List<Integer> sayılar1 = new ArrayList<>(); // []

        List<Integer> sayılar2 = new ArrayList<>(); // []

        System.out.println(sayılar1.equals(sayılar2)); // true

        sayılar1.add(1);
        sayılar2.add(2);

        System.out.println(sayılar1.equals(sayılar2)); // false

        sayılar1.add(0,2); // [2, 1]
        sayılar2.add(1); // [2, 1]

        System.out.println(sayılar1.equals(sayılar2)); // true

        sayılar1.add(0,3); // [3, 2, 1]
        sayılar2.add(3); // [2, 1 3]
        System.out.println(sayılar1.equals(sayılar2)); // false

        Collections.sort(sayılar1); // [1, 2, 3]
        Collections.sort(sayılar2); // [1, 2, 3]

        System.out.println(sayılar1.equals(sayılar2)); // true






    }
}
