package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListeddenElemanSilme {
    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun

        /*
            listenin elemanlarını index ile kontrol edip
            silmemiz isteniyorsa
            silme işlemi yaptıgımızda aradan birelemet çıkarılacıgı için
            index bir elemanı atlar


             bunu engelemek için
             - silme yapınca i bir azaltıla bilir
             - verilen listede silme yapılmaz yeni bir liste olusturulup
             - silinmeyecek elemanlar yeni listeye eklene bilir
         */


        List<String> isimler = new ArrayList<>();

        isimler.add("Uğurcan");
        isimler.add("Aybar");
        isimler.add("Sibel");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Buket");

        String silinecekHarf = "a";

        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));

    }
    public static List<String> istenmeyenleriSil(List<String> isimler, String silinecekHarf ){
        List<String> silinmeyeceklerListesi = new ArrayList<>();
        for (int i = 0; i < isimler.size() ; i++) {
            /*
            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                isimler.remove(isimler.get(i));
                i--;
            }
             */

            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                silinmeyeceklerListesi.add(isimler.get(i));
            }
        }
        return silinmeyeceklerListesi;


    }
}
