package day12_Scope;

public class C06_InstaceVeStaticVariableKullanımı {

    // okul uygulaması yaptıgımızı düşünelim

    static String okulIsmi = "yıldız koleji";

    static String mudur = "Uğurcan AYDOĞAN";
    static String okulAdresi = "Cankaya";

    String ogretmenIsmi = "Isım atamadı";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTel = "Tel girilmedi";

    public static void main(String[] args) {

        C06_InstaceVeStaticVariableKullanımı ogr1 = new C06_InstaceVeStaticVariableKullanımı();

        System.out.println(ogr1.ogretmenAdresi); // "Adres girilmedi"
        ogr1.ogretmenIsmi = "ömer";
        ogr1.ogretmenAdresi = "Kızılay";
        System.out.println(ogr1.mudur); // Uğurcan AYDOĞAN


        C06_InstaceVeStaticVariableKullanımı ogr2 = new C06_InstaceVeStaticVariableKullanımı();

        System.out.println(ogr2.ogretmenIsmi); // "Isım atamadı"
        ogr2.ogretmenIsmi = "Aybar";

        C06_InstaceVeStaticVariableKullanımı ogr3 = new C06_InstaceVeStaticVariableKullanımı();


        System.out.println("========");
        System.out.println(ogr1.ogretmenIsmi); // ömer
        System.out.println(ogr2.ogretmenIsmi); // Aybar
        System.out.println(ogr3.ogretmenIsmi); // isim atanmadı

        System.out.println(ogr1.okulIsmi); // yıldız koleji
        System.out.println(ogr2.okulIsmi); // yıldız koleji
        System.out.println(ogr3.okulIsmi); // yıldız koleji

        ogr1.ogretmenAdresi = "Yenimahalle";

        System.out.println(okulAdresi); // Yenimahalle
        System.out.println(ogr2.okulAdresi); // Yenimahalle
        System.out.println(ogr3.okulAdresi); // Yenimahalle
    }
}
