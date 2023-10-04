package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ındexOf {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Uğurcan");
        isimler.add("Aybar");
        isimler.add("Sibel");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Buket");
        isimler.add("Uğurcan");
        System.out.println(isimler); // [Uğurcan, Aybar, Sibel, Halil, Elif, Buket, Uğurcan]

        System.out.println(isimler.indexOf("Uğurcan")); // 0
        System.out.println(isimler.lastIndexOf("Uğurcan")); // 6

        System.out.println(isimler.indexOf("Enes")); // -1
        System.out.println(isimler.indexOf("Oğuz")); // -1
        System.out.println(isimler.lastIndexOf("Mert")); // -1

    }
}
