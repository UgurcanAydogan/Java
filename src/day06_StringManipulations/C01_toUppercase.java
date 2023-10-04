package day06_StringManipulations;

import java.util.Locale;

public class C01_toUppercase {
    public static void main(String[] args) {
        String str = "Java candir";

        System.out.println(str.toUpperCase());

        // string methodlaarı ile yapılan değişikler
        // stringi kalıcı değistirmez

        System.out.println(str); // Java candır

        //değişiklik yapmak istendiğinde atama yapmak zorundayız

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candır

        // büyük I yerine küçük har seçtiğimizde i gelir
        // I yerine tükçe karakter olarak ı gelmesini isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır

    }
}
