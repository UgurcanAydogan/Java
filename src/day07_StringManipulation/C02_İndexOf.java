package day07_StringManipulation;

public class C02_İndexOf {
    public static void main(String[] args) {
        String str = "java candır selenium heycan ";

        // str selunium içeriyormu

        System.out.println(str.contains("selenium")); // true

        // str selenium ilemi bitiyor

        System.out.println(str.endsWith("selenium")); // false

        // str selanium ile mi baslıyor

        System.out.println(str.startsWith("selenium")); // false

        // peki bu selenium nerede

        System.out.println(str.indexOf("selenium")); // 13

        // olmayan bir metin aratılırsa

        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.indexOf('q')); // -1
        System.out.println(str.indexOf("a")); // 1

        // contains() kulanmadan str ın java içerip içermediğini yazdırın

        if (str.indexOf("java") == -1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        // str daki ilk a harfinin index ini yazdırın
        System.out.println(str.indexOf("a")); // 1

        // str daki ilkinci a haarfinin index ini yazdırın

        System.out.println(str.indexOf("a", 2)); // 3

        // str 3 . a harfinin index yazdırın

        System.out.println(str.indexOf("a", 4)); // 6


        // str 4.a varsa index ini yazdırın
        // yoksa str sadece 3 tane a içeriyor yaazdırın

        if (str.indexOf("a", 7) == -1) {
            System.out.println("str 3 tane a içeriri");
        } else {
            System.out.println("4. a nın indexi :" + str.indexOf("a", 7));
        }  // 27


        // str 5.a varsa index ini yazdırın
        // yoksa str sadece 4 tane a içeriyor yaazdırın

        if (str.indexOf("a", 28) == -1) {
            System.out.println("str 4 tane a içerir");
        } else {
            System.out.println("5. a nın indexi :" + str.indexOf("a", 28));
        }


    }
}
