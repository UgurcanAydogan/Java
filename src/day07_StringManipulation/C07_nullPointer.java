package day07_StringManipulation;

public class C07_nullPointer {

    public static void main(String[] args) {

        String str;

        // System.out.println(str);
        // javada main method acısından deger atamadan bir variable olusturabiliriz
        // ancak deger atamadan kulanamayız

        String str2 = "";
        System.out.println(str2); // hiclik yazdırır
        // str2 yi kulanabilmek için hiçlik degr atayabiliz
        // ancak hiçlik degeri atanan variable ları
        // java deger atanması olarak sınıflandırmaz
        // deger atananlar gurubuna koyar

        /*

        java degr atanmamıs variable ları işaretlemek için özel bir
        null keyword unu oluşturmuştur

        asadaki örenekler
        str4 e hiçlik degri atanmıstır
        str5 tava degeri atanmıştır
        str3 e ise null olaarak İSARETLENMİŞTİR

        null bir deger değil işaretcidir
        srt3 oluşturdugunu ve bir deger atana kadar bu şekilde kullanılmak istendiğinde java ya syöyler

        null olarak işaretlenen bir string yazdıralabilirsiniz ancak methodlarda kulannamazsınız

         */

        // String str3 = true ;
        //String str3 = 45;
        //String str3 = 'f';
        String str3 = null;
        String str4 = "";
        String str5 = "tava";

        System.out.println(str3); // null

        // System.out.println(str3.isBlank()); // NullPointerException
        // System.out.println(str3.substring(0,1)); // NullPointerException
        // System.out.println(str3.charAt(0)); // NullPointerException
        // System.out.println(str3.isEmpty()); // NullPointerException

        System.out.println(str3 == null); // true


    }
}
