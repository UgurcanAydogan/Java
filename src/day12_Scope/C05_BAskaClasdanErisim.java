package day12_Scope;

public class C05_BAskaClasdanErisim {
  /*
       class içerisinde olusturduğumuz class üyelerinini
       static olup olmaması
       baska classlardan erişimide etkiler

       baska class dan birr static class üyesine ulaşmak için  clasIsmi.staticClassUyesiIsmi kullanılır
       baska clasdan static olamayan class uyesine ulasmak için önce o clasdan bir obje olusturup sonra objeIsmi.staticOlmayanClassUyesi kullanılır

       peki static bir class üyesine obj üzerinden ulaşabilirmiyiz
       java obj isimini yazıp nokta koyunca static üyeleri otomatik olarak getirmez
       AMA niz mauel olaarak obj.staticClassUyesiIsmı yazarsak
       java istediğimiz static uyesi getirir
       bu durumda intellij bu kulanımı sarıya boyer
       static bir class uyesine static olmayan yolla erişiyorsun
       diye bizi uyarır ama calışmaya engel olmaz
   */

    public static void main(String[] args) {

        System.out.println(C03_Scope_ClassVariables.bl); // true
        System.out.println(C03_Scope_ClassVariables.chr); // a
        C03_Scope_ClassVariables.staticMethod();

        C03_Scope_ClassVariables obj = new C03_Scope_ClassVariables();
        System.out.println(obj.sayı); // 23
        System.out.println(obj.str); // Java
        obj.staticOlmayanMethodla();

        System.out.println(obj.bl); // true
        System.out.println(obj.chr); // a


    }
}
