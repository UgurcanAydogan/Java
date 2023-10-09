package day23_inheritance;

public class G_Auris extends E_Toyota {


    public static void main(String[] args) {

       /*
           Bir class baska bir class extend ile child olursa
           o class ve o class ın parent class daki tum ozelliklere
           OTOMATİK olarak sahip olur

           child class
           isterse parent class lardaki ozellikleri sahiplenir
           isterse o bilgileri gunceler
           isterse de parent class larda olan o ozelliklere ilave olarak
           kendi spesifik ozllekleri ekleyebilir

           child class ne kadar guncelleme yaparsa
           ozellikleri o kadar kendisine uyarlamıs olur

           ozelleikleri kkendisine uyarlamasa
           parent cllasın butun child class ları kapsayan
           DAHA GENEL ozelliklerini sahiplenmiss olur

        */

        G_Auris auris1 = new G_Auris();

        System.out.println(auris1.marka); // T Toyota
        System.out.println(auris1.model); // Car Model atanmamis
        System.out.println(auris1.renk); // Car Atanmamis
        System.out.println(auris1.yakit); // Car Yakit atanmamis
        System.out.println(auris1.uretimYeri); // T Japonya ve Turkiye
        System.out.println(auris1.sanziman); // T Otamatik veya Manuel
        System.out.println(auris1.lastik); // T Pirelli
        System.out.println(auris1.guvenlik); // T Toyota araclar ekstra guvenlik donanima sahiptir
        System.out.println(auris1.aku); //  T Aku atanmadı





    }
}
