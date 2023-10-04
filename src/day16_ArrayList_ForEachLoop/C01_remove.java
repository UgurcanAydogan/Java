package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Uğurcan");
        isimler.add("Aybar");
        isimler.add("Sibel");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Buket");

        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Uğurcan");
        silinecekler2.add("Enes");

        System.out.println(isimler.remove(2)); // Sibel
        System.out.println(isimler); // [Uğurcan, Aybar, Halil, Elif, Buket]

        System.out.println(isimler.remove("Elif")); // true
        System.out.println(isimler); // [Uğurcan, Aybar, Halil, Buket]

        System.out.println(isimler.removeAll(silinecekler2)); // isimlerde degişiklik olursa true
        System.out.println(isimler); // [Aybar, Halil, Buket]


        List<Integer> sayılar = new ArrayList<>();

        sayılar.add(3);
        sayılar.add(2);
        sayılar.add(8);

        System.out.println(sayılar); // [3, 2, 8]

        // eger list sayılardan olusuyorsa
        // remove(2) yazdırdıgımızda 2 nin element mi yoksa index mi olacagını netlestirmek gerekir
        // Java bu durumu netlestirmek icin
        // sayılardan olusan list lerde yazılan sayiyi INDEX olaarak kabul eder

        System.out.println(sayılar.remove(2)); // 8
        System.out.println(sayılar); // [3, 2]

        // illa da obje olan ikiyi silmek istiyorsak ve index ini bilmiyorsak
        // Once silmek istedigimiz elementi bir obje yani (non-primitive) olarak tanimlamayiz

        Integer silinecekSayı = 2 ;
        System.out.println(sayılar.remove(silinecekSayı)); // true
        System.out.println(sayılar); // [3]

        sayılar.clear();
        System.out.println(sayılar); // []


    }
}
