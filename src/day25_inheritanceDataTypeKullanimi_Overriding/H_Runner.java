package day25_inheritanceDataTypeKullanimi_Overriding;

public class H_Runner {

    /*
           Ozellikler method olarak olusturulmussa

            - constructor ve data turui ayni ise
              o class dan aramaya baslayip parent class lara dogru aramaya devam ederi
              ilk buldugumuz method calistirir


            - constructor ve data turui ayni degil ise
              data turu olan class dan aramaya baslayıp parent class lara dogru aramaya devam ederiz
              eger method bulunursa hemen calistirilmaz
              o method un constructor olan class a kadar daha gunceli var mi kontrol eder
              daha gunceli varsa olan calısır

              aramaya basladıgımız class da ve parenr class larına method bulunamazsa
              child class lara donulmez guncel var mi bakılmaz
              CTE ulusur

         */

    public static void main(String[] args) {


        G_AvciKuslar kartal4 = new G_AvciKuslar();

        kartal4.hareket(); // G Ucarlar
        kartal4.solunum(); // F akcigerle nefes alirlar
        kartal4.beslenme(); // G et yerler
        kartal4.cogalma(); // F yumurtayla cogalirlar
        kartal4.omur(); // E yasar ve olurler
        kartal4.kanat(); // F kanatlidirlar
        kartal4.gaga(); // G sivri gagali
        kartal4.pence(); // G pencelidir


        F_Kuslar kartal5 = new G_AvciKuslar();

        kartal5.hareket(); // G Ucarlar
        kartal5.solunum(); // F akcigerle nefes alirlar
        kartal5.beslenme(); // G et yerler
        kartal5.cogalma(); // F yumurtayla cogalirlar
        kartal5.omur(); // E yasar ve olurler
        kartal5.kanat(); // F kanatlidirlar
        kartal5.gaga(); // G sivri gagali
        // kartal5.pence(); // CTE


        E_Hayvanlar kartal6 = new G_AvciKuslar();

        kartal6.hareket(); // G Ucarlar
        kartal6.solunum(); // F akcigerle nefes alirlar
        kartal6.beslenme(); // G et yerler
        kartal6.cogalma(); // F yumurtayla cogalirlar
        kartal6.omur(); // E yasar ve olurler
        // kartal6.kanat(); // CTE
        // kartal6.gaga(); // CTE
        // kartal6.pence(); // CTE


        F_Kuslar kus1 = new F_Kuslar();
        // constructor ve data turu ayni
        // kuslara gidip ilk buldugunu kullaniriz

        kus1.hareket(); // E hareket ederler
        kus1.solunum(); // F akcigerle nefes alirlar
        kus1.beslenme(); // E beslenirler
        kus1.cogalma(); // F yumurtayla cogalirlar
        kus1.omur(); // E yasar ve olurler
        kus1.kanat(); // F kanatlidirlar
        kus1.gaga(); // F gagalari vardir
        // kus1.pence(); // CTE


        E_Hayvanlar kus2 = new F_Kuslar();

        kus2.hareket(); // E hareket ederler
        kus2.solunum(); // F akcigerle nefes alirlar
        kus2.beslenme(); // E beslenirler
        kus2.cogalma(); // F yumurtayla cogalirlar
        kus2.omur(); // E yasar ve olurler
        // kus2.kanat(); // CTE
        // kus2.gaga(); // CTE
        // kus2.pence(); // CTE


        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();

        hayvanlar1.hareket(); // E hareket ederler
        hayvanlar1.solunum(); // E nefes alirlar
        hayvanlar1.beslenme(); // E beslenirler
        hayvanlar1.cogalma(); // E cogalirlar
        hayvanlar1.omur(); // E yasar ve olurler
        // hayvanlar1.kanat(); // CTE
        // hayvanlar1.gaga(); // CTE
        // hayvanlar1.pence(); // CTE



    }
}
