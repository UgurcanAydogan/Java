package day20_immutableClasses;

public class C02_StringPool {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6 + str7;
        // equels() sadece metne bakar
        // == ise hem metne hem de referansa bakar


        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str5); // true
        System.out.println(str1 == str8); // false
        System.out.println(str1 == "Java");// true

        /*
             basit sekilde olusturulan String objeler için
             Java oncelikle String pool u kontrol eder
             eger pool da aynı degere sahip bir String varsa
             yeni obje ile eski objenin referansını ve degerini eşleştirir

         */
    }
}