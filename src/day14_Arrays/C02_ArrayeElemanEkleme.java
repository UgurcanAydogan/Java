package day14_Arrays;

import java.util.Arrays;

public class C02_ArrayeElemanEkleme {
    public static void main(String[] args) {

        //Soru 7- Verilen bir array’e
        //        istenen bir elemani ekleyip bize donduren bir method yazin,
        //        eski array’e yeni degeri atayin

        int[] arr1 = {4, 5, 6, 7};

        // bu array e 5 element olarak 8 i atayın

        // arr1[4] = 8; ==> çalıştıgımda hata veriri

        int[] yeniArr = {4, 5, 6, 7, 8};

        arr1 = yeniArr;

        System.out.println("arr1 in son hali : " + Arrays.toString(arr1)); // [4, 5, 6, 7, 8]

        arr1 = arryeElemanEkle(arr1, 10);

        System.out.println("arr1 in 1.method call dan son hali : " + Arrays.toString(arr1)); // [4, 5, 6, 7, 8, 10]

        arr1 = arryeElemanEkle(arr1, 12);

        System.out.println("arr1 in 2.method call dan son hali : " + Arrays.toString(arr1)); // [4, 5, 6, 7, 8, 10, 12]


    }

    public static int[] arryeElemanEkle(int[] arr, int eklenecekEleman) {

        int[] yeniArr = new int[arr.length + 1]; // [ 0, 0, 0,....]

        // eski array deki tüm elementi yeni arry e atayalım

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        }

        // yeni arry in son elementi olarak istenen sayıyı atayalım

        yeniArr[yeniArr.length - 1] = eklenecekEleman;

        return yeniArr;
    }
}
