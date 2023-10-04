package day03_WrapperClases_Matamatıkselslemler;

public class C01_WrapperClasess {
    public static void main(String[] args) {

        int sayı = 20;

        String str = "java";

        Integer sayı2 = 30;

        sayı = sayı2;

        sayı2 = sayı;

        char chr1 = 'j';

        Character chr2 = chr1;

        Boolean bl = true;

        Short shr = 3;

        Double dbl = 2.5;

        Float fl = 2.4f;

        // primitive data türü ile o türün wrapper clası geçiş mümkündür

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);

        String str1 = "34"; //-2147483648
        String str2 = "45"; //-32768

        // str1 ve str2 nın degerlerinin matamaatıksel olarak toplayın

        System.out.println(str1 + str2); // 3445

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); // 79

        str1 = "34a";
        str2 = "23";

        // System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2)));
        // NumberFormatException

        chr1 = 'a';
        System.out.println(Character.isDigit(chr1)); // false
        System.out.println(Character.isLetter(chr1)); // true
        System.out.println(Character.toUpperCase(chr1)); // A


        // int olarak verilen bir sayiyi, String'e nasil ceviririz ?

        String metin = 23 + "";
        System.out.println(metin);


    }
}
