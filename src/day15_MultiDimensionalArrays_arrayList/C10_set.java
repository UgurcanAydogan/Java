package day15_MultiDimensionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Uğurcan");
        isimler.add("Aybar");
        isimler.add("Sibel");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Buket");

        System.out.println(isimler); // [Uğurcan, Aybar, Sibel, Halil, Elif, Buket]

        System.out.println(isimler.get(1)); // Aybar
        //System.out.println(isimler.get(8)); // IndexOutOfBoundsException

        isimler.add(3,"Enes");

        System.out.println(isimler); // [Uğurcan, Aybar, Sibel, Enes, Halil, Elif, Buket]

        //set() u bir elementi UPDATE etmek (yani deger atamak) icin kullanılır

        isimler.set(3,"Oğuz");

        System.out.println(isimler); // [Uğurcan, Aybar, Sibel, Oğuz, Halil, Elif, Buket]

        // methodların yaptıgı iş ile bize döndürdüğü sonuc FARKLİ OLABİLİR
        System.out.println( isimler.set(2,"Mert")); // Sibel

        System.out.println(isimler); // [Uğurcan, Aybar, Mert, Oğuz, Halil, Elif, Buket]

        isimler.set(0,"Ayca");

        System.out.println(isimler); // [Ayca, Aybar, Mert, Oğuz, Halil, Elif, Buket]



    }
}
