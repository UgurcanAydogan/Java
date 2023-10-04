package day13_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayı = 10;

        int[] arr = {4, 6, 1, 2};

        // Bu array in yazdıralım

        System.out.println(sayı); // 10

        System.out.println(arr); // [I@1d251891

        // Arrays ler direl yazdırılamaz yazdırmak istersek
        // array değil refaransını yazdırır

        // Array i yazdırmak istersek array class ından yazdırmalıyız

        System.out.println(Arrays.toString(arr)); // [4, 6, 1, 2]

        String[] kelimeler = {"Ali", ", okula", " gitti."};

        System.out.println(Arrays.toString(kelimeler)); // [Ali, , okula,  gitti.]


        // array in tüm elementlerini yazdırın
        System.out.println(arr[0]); // 4
        System.out.println(arr[1]); // 6
        System.out.println(arr[2]); // 1
        System.out.println(arr[3]); // 2

        System.out.println("====================");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " "); // 4 6 1 2
        }

        /*
            biz ne zaman array ın tüm elementi ile bir işlem yapmak istesek
            bir for loop oluşturup
             arr[i]
             üzerinden işlem yapabiliriz
         */




    }
}
