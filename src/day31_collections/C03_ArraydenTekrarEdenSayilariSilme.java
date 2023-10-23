package day31_collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {

        // verilen arry den tekrar eden elementleri silip
        // arry i her bir elementi unique oldugu hali ile keydediin

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 7, 9]

        // 1. yontem- once bir forloop ile kac tane silinecek sayi var bulup
        //            sonra bos bir array olusturup uygun olan elementleri ona tasiya biliriz

        // 2. yontem- bir loop ile elemanlari gozden gecirip
        //            bir oncdekine esit olan  element varsa olusturacagım ayri bir methodla
        //            o elementi silip arrayi ile degistirim

        int silinecekElemansayisi = 0;
        for (int i = 0; i <arr.length - 1 ; i++) {

            if (arr[i] == arr[i+1]){
                silinecekElemansayisi++;
            }
        }
        int[] yeniArr = new int[arr.length - silinecekElemansayisi]; // 13 - 6 = 7 [0,0,0,0,0,0,0]

        int konulacakIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]){
                yeniArr[konulacakIndex] = arr[i];
                konulacakIndex++;
            }
        }
        if (arr[arr.length - 1] != yeniArr[yeniArr.length - 1]) {
            yeniArr[yeniArr.length - 1] = arr[arr.length - 1];
        }

        arr = yeniArr;
        System.out.println(Arrays.toString(arr));

    }
}
