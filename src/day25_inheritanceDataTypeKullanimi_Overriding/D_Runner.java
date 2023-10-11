package day25_inheritanceDataTypeKullanimi_Overriding;

public class D_Runner {

    public static void main(String[] args) {


      /*
           bir obje olustururken
           data turu ve constructor ayni class da ise
           variable larin hangi degeri alacagini bulmak icin
           ilgili class a gidip aramaya baslarız
           parent class lara dogru aramaya devam ederiz
           ilk buldumuz deger yani en guncel olan deger
           gecerli deger olur

           java bir obje nin data turu olarak
           constructor ın oldugu class
           veya parent class ları kabul eder

           Eger data turu constructar ın parent i ise
           aramaya data turu nin oldugu class dan baslanir
           parent class lara dogru aramaya devam edilir
           ilk bulunan deger kullanilir
       */


        C_AvciKuslar kartal1= new C_AvciKuslar();

        System.out.println(kartal1.hareket); // C ucarlar
        System.out.println(kartal1.solunum); // B Akcigerle nefes alirlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.cogalma); // B Yumurta ile cogalirlar
        System.out.println(kartal1.omur); // A yasar ve olurler
        System.out.println(kartal1.kanat); // B Kanatlidirlar
        System.out.println(kartal1.gaga); // C sivri gagali
        System.out.println(kartal1.pence); // C penceleridir


        B_Kuslar kartal2= new C_AvciKuslar();

        System.out.println(kartal2.hareket); // A haraket ederler
        System.out.println(kartal2.solunum); // B Akcigerle nefes alirlar
        System.out.println(kartal2.beslenme); // A Beslenirler
        System.out.println(kartal2.cogalma); // B Yumurta ile cogalirlar
        System.out.println(kartal2.omur); // A yasar ve olurler
        System.out.println(kartal2.kanat); // B Kanatlidirlar
        System.out.println(kartal2.gaga); // B gagalari vardir
        // System.out.println(kartal2.pence); // CTE


        A_Hayvanlar kartal3 = new C_AvciKuslar();

        System.out.println(kartal3.hareket); //  A haraket ederler
        System.out.println(kartal3.solunum); // A nefes alirlar
        System.out.println(kartal3.beslenme); // A beslenirler
        System.out.println(kartal3.cogalma); // A cogalirlar
        System.out.println(kartal3.omur); // A yasar ve olurler
        // System.out.println(kartal3.kanat); // CTE
        // System.out.println(kartal3.gaga); // CTE
        // System.out.println(kartal3.pence); // CTE


    }
}
