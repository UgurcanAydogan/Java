package day15_MultiDimensionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Uğurcan");
        isimler.add("Aybar");
        isimler.add("Sibel");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Buket");

        // remove (silinecekObject) calıstırınca
        // silinecekObject varsa siler ve bize true döndürür
        // silinecekObject yoksa silemez bizede false veriri

        System.out.println(isimler); // [Uğurcan, Aybar, Sibel, Halil, Elif, Buket]

        System.out.println(isimler.remove("Uğurcan"));// true

        System.out.println(isimler); // [Aybar, Sibel, Halil, Elif, Buket]

        System.out.println(isimler.remove("Ercan")); // false

        isimler.remove("Aybar");

        System.out.println(isimler); // [Sibel, Halil, Elif, Buket]


        // remove (silinecekObject) calıstırınca
        // silinecekObject varsa siler ve bize true döndürür
        // silinecekObject yoksa silemez bizede false veriri

        System.out.println(isimler.remove(1)); // Halil

        System.out.println(isimler); // [Sibel, Elif, Buket]

        // isimler.remove(5); // IndexOutOfBoundsException

        isimler.add("Uğurcan");
        isimler.add("Aybar");
        isimler.add("Halil");

        System.out.println(isimler); // [Sibel, Elif, Buket, İbrahim, Ercan]

        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Sibel");
        silinecekler.add("Buket");
        silinecekler.add("Elif");

        System.out.println(silinecekler); // [Sibel, Buket, Elif]

        System.out.println(isimler.removeAll(silinecekler)); // true
        System.out.println(isimler); // [Uğurcan, Aybar, Halil]


        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Aybar");
        silinecekler2.add("Halil");

        System.out.println(silinecekler2); // [Aybar, Halil]

        System.out.println(isimler.removeAll(silinecekler2)); // true
        System.out.println(isimler); // [Uğurcan]

        System.out.println(isimler.removeAll(silinecekler)); // false
        System.out.println(isimler); // [Uğurcan]








    }
}
