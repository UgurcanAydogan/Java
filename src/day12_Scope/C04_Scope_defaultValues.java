package day12_Scope;

public class C04_Scope_defaultValues {

    String str = "Java;";
    String str2;
    int sayı = 23;
    int sayı2;

    static boolean bl = true;
    static boolean bl2;
    static char chr = 'a';
    static char chr2;

    public static void main(String[] args) {

        String metin;

        // System.out.println(metin);

        // System.out.println(str);
        // System.out.println(sayı);

        System.out.println(bl); // true
        System.out.println(bl2); // false
        System.out.println(chr); // a
        System.out.println(chr2); // hiclik

        // staticOlmayanMethod();
        // Non-static method 'staticOlmayanMethod()' cannot be referenced from a static context
        // static olan main method içerisinden static olmayan bir method direk çağırılamaz

        //static method lar içerisinden
        // static olamayan class uzerinden üyelerine ulaşmak istersek
        // obje olusturmamız gerek

        C04_Scope_defaultValues obj = new C04_Scope_defaultValues();
        obj.staticOlmayanMethod();

    }

    /*
         local variablelre deger atamadan oluşturulamaz
         ANCAK deger atanmadn KYLLANILMAZ

         Class level variableler ise ister static olsun istter static olmasın
         deger atamadan oluşturabilir
         VE deger atamadan KULANILABİLİR

         class level variable lara biz deger ATAMASAK
         java default olarak belirlediği degerleri atar


         Default Java degeri

         char ==> hiclik
         boolean ==> false
         saısal primitivler ==> 0
         non-primitiveler ==> null

   */


    public void staticOlmayanMethod() {

        System.out.println(str); // Java
        System.out.println(str2); // null
        System.out.println(sayı); // 23
        System.out.println(sayı2); // 0
    }


}
