package day15_MultiDimensionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_KısaYoldanListOlusturma {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,9,0,8,5,7,1,2,1};

        // yukardaki elementlerin oldugu bir arry list olusturun

        List<Integer> sayılar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            sayılar.add(arr[i]);
        }

        System.out.println(sayılar); // [3, 4, 5, 6, 7, 9, 0, 8, 5, 7, 1, 2, 1]

    }
}
