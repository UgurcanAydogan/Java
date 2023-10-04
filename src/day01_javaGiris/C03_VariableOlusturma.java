package day01_javaGiris;

public class C03_VariableOlusturma {
    public static void main(String[] args) {

        int sayı = 20;
        System.out.println(sayı);
        System.out.println("sayı");

        int sayı2;
        sayı2 = 30;

        /*
        java'da = işareti atama islemidir
        ='in solunda sadece variable olur

        ='in sagında ise deger olur

        java = isareti görunce once sag taraftakini hesaplar
        buldugu sonucu deger olarak variable ataar
         */

        int a = 10;
        a = a + 20;
        a = 2 * a + 1;

        float sayıfl = 3.4f;
        // küçük veya büyük f koymak zorunlu float'da

        float sayı3 = 20f;
        float sayı4 = 6f;

        System.out.println(sayı3 / sayı4); // 3.3333333

        double sayı5 = 20;
        double sayı6 = 3;

        System.out.println(sayı5 / sayı6); // 6.666666666666667


    }
}
