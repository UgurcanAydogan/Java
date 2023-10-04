package day10_methotOlusturma_methodOverloading;

public class C04_ToplaDöndür {

    public static void main(String[] args) {

        // verilen 3 sayının toplamını döndüren bir method oluşturun

        toplaDöndür(5, 6, 7); // bir sonuc döndüren methodlar call edildiğinde
                              // sonucu call edilen yere getirir
                              // bundan sonra yapılacak sey kod yazan kişiye baglıdır
                              // 1- return edilen sonucu direk yazdırabilir
                              // 2- ya da daha sonra kullanılmak uzere bir variable atayabilir

        System.out.println(toplaDöndür(2, 3, 4)); //9.0

        double topla = toplaDöndür(6, 9, 1); // 16 döndürecek ve bu deger toplam variableye kayıtedilecek

    }

    public static double toplaDöndür(double sayı1, double sayı2, double sayı3) {

        double toplam = sayı1 + sayı2 + sayı3;
        return toplam;
    }
}
