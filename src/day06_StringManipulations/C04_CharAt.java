package day06_StringManipulations;

public class C04_CharAt {
    public static void main(String[] args) {

        String str = "java gün geçtikce güzelleşiyor";

        // ilk harfi yazdırın
        System.out.println(str.charAt(0)); // j

        System.out.println(str.charAt(4)); // space

        // str'da 31 karakter var
        // son karakter olan noktanın indeksi 30 olur

        // son karakteri yazdırın
        System.out.println(str.charAt(31 - 1)); // .

        // sondan beşinci karakteri yazdırın
        System.out.println(str.charAt(31 - 5)); // i

        // str da olmayan bir indeksi istersek ne olur

        // System.out.println(str.charAt(44)); // StringIndexOutOfBoundsException
    }
}
