package day07_StringManipulation;

public class C04_LastIndexOf {
    public static void main(String[] args) {

        String str = " java candır selenium heycandır";

        // str a ile mi baslar
        System.out.println(str.startsWith("a")); // false

        // a nın ilk kulandıgı indexi yazdırın
        System.out.println(str.indexOf("a")); // 1

        // str a ilemi biter
        System.out.println(str.endsWith("a")); // false

        //a nın son kulanımın indexi ni yazdırın
        System.out.println(str.lastIndexOf("a")); // 27

        // can kelimesinin ilk index ini bulun
        System.out.println(str.indexOf("can")); // 5

        // can kelimesinin son kulanımının index ini yazdırın
        System.out.println(str.lastIndexOf("can")); // 25

        // selenium kelimesinin ilk kulanım ve son kulanım indexini yazdırın
        System.out.println(str.indexOf("selenium")); // 13
        System.out.println(str.lastIndexOf("selenium")); // 13

        //
    }
}
