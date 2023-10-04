package day20_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Mutable_ImmutableClasses {
    public static void main(String[] args) {

        String s = "Java";

        String str = new String("Java Candır");

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // JAVA CANDIR

        str.toLowerCase();

        // String method larının yaptıgı degisikler sadece o satır icin gercerli
        // kalıcı olması istersek atama yapmaliyiz


        List<String> isimler = new ArrayList<>();

        isimler.add("halil");
        isimler.add("uğurcan");
        isimler.add("sibel");

        System.out.println(isimler); // [halil, uğurcan, sibel]

        isimler.set(1,"elif");

        System.out.println(isimler); // [halil, elif, sibel]
    }
}
