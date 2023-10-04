package day14_Arrays;

import java.util.Arrays;

public class C04_ArraysSort {
    public static void main(String[] args) {

        int[] arr1 = {3, 9, 1, 0, 12, 87, 4, 6};

        System.out.println(Arrays.toString(arr1)); // [3, 9, 1, 0, 12, 87, 4, 6]

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1)); // [0, 1, 3, 4, 6, 9, 12, 87]

        String[] arr2 = {"İbrahim", "Hüseyin", "İsmail", "İsa", "İsrafil" };

        System.out.println(Arrays.toString(arr2)); // [İbrahim, Hüseyin, İsmail, İsa, İsrafil ]
        // ascii deerleri sebebi ile kücük harfler sıralamada büyük harflerden sonra gelir

        // String lerde sadece method calısınca yapılan değişikler kalıcı olmaz
        // değişikligin kalıcı olması için atama yapmalıyız
        // bu durum sadece string den kaynaklanan ozel bir durumdur (immutable class)

        String isim = "Ali";
        isim.toString();
        System.out.println(isim); // ali

    }
}
