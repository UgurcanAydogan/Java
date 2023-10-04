package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5};

        // kulanıcıdan bir deger alıp arra e ekleyin

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen arry e eklemek için bir tam sayı giriniz");

        int eklenecekSayı = scanner.nextInt();

        arr = C02_ArrayeElemanEkleme.arryeElemanEkle(arr, eklenecekSayı);

        System.out.println("Array ın yeni hali : " + Arrays.toString(arr));
    }
}
