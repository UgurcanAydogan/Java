package day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "java candır";

        System.out.println(str.replace('a', 'q')); // jqvq cqndır

        System.out.println(str.replace("java", "tava")); // tava candır

        System.out.println(str.replace("java", "x")); // x candır

        System.out.println(str.replace("x", "y")); // java candır

        System.out.println(str.replace("a", "e").replace("i", "a")); // jeve cendir

        System.out.println(str.replace("i", "a").replace("a", "e")); // jeve cender


        // değişecek metin sadece ilk değer için değişsin diyorsak
        // replace() yerine replacefirst() kulanılır

        System.out.println(str.replaceFirst("a", "x")); // jxva candır

        // regex : regular expressions : bilirlenmiş kısatmalar

        // ilk harfi * yapalım
        System.out.println(str.replaceFirst("\\w", "*")); // *ava candır


        str = "java 44candır";

        // varsa string içindeki ilk rakamı + yapalım
        System.out.println(str.replaceFirst("\\d", "+")); // java +candır


    }
}
