package day31_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraySorusunuSetIlecozum {
    public static void main(String[] args) {

        // verilen arry den tekrar eden elementleri silip
        // arry i her bir elementi unique oldugu hali ile keydediin

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2};

        Set<Integer> tekrarsizSet = new TreeSet<>();

        // set uniqe elementlerden olsturdugu icin
        // arry deki elementleri set e eklesek
        // tekrar edenler yok olur

        for (Integer each: arr
             ) {
            tekrarsizSet.add(each);

        }
        System.out.println("Set : " + tekrarsizSet); // Set : [1, 2, 4, 5, 6, 7, 9]

        // Set index kullanmadigi icin for-loop kulanamayiz
        // for-each loop kullanmaliyiz

        arr = new int[tekrarsizSet.size()];

        // for,each ile yapacagimiz icin arr in index ini biz takip etmeliyiz

        int index = 0;
        for (Integer each : tekrarsizSet
             ) {
            arr[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr)); // Array'in son hali : [1, 2, 4, 5, 6, 7, 9]

    }
}

