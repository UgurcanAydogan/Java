package day10_methotOlusturma_methodOverloading;

public class C08_MethodOverloading {
    public static void main(String[] args) {

        /*

          bir method kol yapıldıgında
          Java hangi methodu çalışacağına karar vermek için aşadakileri yapar

          1- isim
          2- argument sayısı ile parametre sayısı
          3- argument olarak yazılan DEGER leri ile PARAMETRE lerin data turlerine uyumlu olması

          DEVAMI C10 daki CLAS da

         */


        toplama(5,7 ); // iki int sayının toplama : 12

        toplama('a','b'); // iki int sayının toplammı : 195

        // toplama(4.5,6.5);

        // toplama(4,6.7);

    }

    // verilen iki integer sayıyı toplayıp yazdırıan bir method oluşturun
    public static void toplama(int sayı, int sayı2){
        System.out.println("iki int sayıyı toplamı : " + (sayı+sayı2));
    }

}
