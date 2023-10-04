package day17_Constuctors;

public class C04_HemsireRunner {
    public static void main(String[] args) {

        C03_Hemsire hemsire1 = new C03_Hemsire();

        hemsire1.hemsireAdı = "Aybar";

        hemsire1.hemsireAdresi = "Yenimahlle";


        C03_Hemsire hemsire2 = new C03_Hemsire();

        System.out.println(hemsire2.hemsireTel); // null


        System.out.println(new C03_Hemsire().hemsireAdresi); // null

        // son olusturdugumuz objeyi
        // atama yapmadıgımız icin bir daha kullanamayiz
        // bu tur objeler java daki Garbage Collector tarafından toplanıp yok edlilir

        C03_Hemsire hemsire3;
        // hemsire3.method1();
        // System.out.println(hemsire3.hemsireAdresi);
        // initialize yapılmadıgı için her hangi bir veriable degerini yazdıramaz


    }
}
