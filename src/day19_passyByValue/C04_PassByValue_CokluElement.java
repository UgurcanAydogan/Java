package day19_passyByValue;

import java.util.Arrays;
import java.util.Random;

public class C04_PassByValue_CokluElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println("arr ilk hali : " + Arrays.toString(arr));

        elemanları2Artır(arr);

        System.out.println("eleman artır method call dan sonra arr : " + Arrays.toString(arr));

        arryiDegistir(arr);

        System.out.println("arry i dgistir method call dan sonra arr : " +Arrays.toString(arr));

    }


    public static void elemanları2Artır(int[] arr) {


        // array in tüm elemetlerinin 2 artırıp
        // yeni haline yazdırsın

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 2;
        }

        System.out.println("eleman artır metho unda degistirilen arr : " + Arrays.toString(arr));
    }

    public static void arryiDegistir(int[] arr) {

        // yeni uc elemanli yeni bir arry olusturup
        // icine rast gele yuzden kucuk sayilar koyun
        // arry e bu yeni degeri atayin
        // ve arryi yazdırın

        int[] yeniarr = new int[3];
        Random rnd = new Random();

        for (int i = 0; i < yeniarr.length ; i++) {

       yeniarr[i] = rnd.nextInt(100);

        }

        arr = yeniarr;

        System.out.println("Array i degistir method unda arr : " + Arrays.toString(arr));
    }

}
