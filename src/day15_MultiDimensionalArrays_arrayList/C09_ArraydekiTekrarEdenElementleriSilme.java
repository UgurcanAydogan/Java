package day15_MultiDimensionalArrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenElementleriSilme {
    public static void main(String[] args) {

        // verilen bir int bir arry den
        // tekrar eden elementleri silip
        // arrayi her elementi unique oldugu bir hale getirin

        int[] arr = {3, 2, 5, 6, 7, 9, 0, 8, 5, 7, 1, 2, 1};

        // bir list olusturalım
        List<Integer>uniquelsit =new ArrayList<>();

        // arry in tüm elemanlarını tek tek ele alalım
        // liste de olup olmadıgını bakalım listede yoksa ekleyelim
        for (int i = 0; i < arr.length ; i++) {

            if (!uniquelsit.contains(arr[i])){
                uniquelsit.add(arr[i]);
            }
        }
        System.out.println("unique list : " + uniquelsit); // unique list : [3, 2, 5, 6, 7, 9, 0, 8, 1]

        // yeni bir arry olusturaım
        int[] yeniArr = new int[uniquelsit.size()];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0]

        // listedeki elementleri yeni arrry e atayalım

        for (int i = 0; i <yeniArr.length ; i++) {

            yeniArr[i] = uniquelsit.get(i);
        }


        // yeni arry de eski arry e deger olarak atayalım

        arr = yeniArr;

        Arrays.sort(arr);
        System.out.println("Array in son hali : " + Arrays.toString(arr)); // Array in son hali : [0, 1, 2, 3, 5, 6, 7, 8, 9]

    }
}
