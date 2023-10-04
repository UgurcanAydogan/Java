package day12_Scope;

public class C03_Scope_ClassVariables {

    String str = "Java;";
    int sayı = 23;

    static boolean bl = true;
    static char chr = 'a';


    public static void main(String[] args) {
        // static int a = 23;
        //System.out.println(str);
        //System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }


    public static void staticMethod() {
        // static String s = "tava;";
        //System.out.println(str);
        //System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }


    public void staticOlmayanMethodla() {
        System.out.println(str);
        System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }

   /*
        class level variable class ın içerisinide kod blokları dişında olusturulur
        sonradan clasa bakıldıgında ulaşulmas kolay olsun diye classın basında olusturlar

        class level da olusturulan variable ları scope BUTUN CLLAS dır
        ama class level variable de
        erişimi belirleyen sadece scope değildir
        static KEYWORD de erişimde belirleyici bir role sahiptir

        static keyword e sahip olan variable ler tüm class içinden direk kullanılabiliri

        static keyword kullanmayan variablel ler
        sadece static keyword kullanmayan methodlarda direk kullanılabilir
    */

}
