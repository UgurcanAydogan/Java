package day04_IfStatements;

public class C01_BagımsızIfCumleleri {
    public static void main(String[] args) {

        /*
        bagımsız ıf cumleri kodun geriye kalanları ile ilgilenmez
        sadece kendı sartına odaklanır


        birden fazla bagımsız if cumlesi varsa
        bütun if badileri calıstıran durumlar olabilecegi gibi

         a=230 b=45

         hiçbir if badisinin calısmayacagı durumlar da olabilir

         a=23 b=44
         */


        int a = 23;
        int b = 42;

        // a b den büyükmü
        if (a > b) {
            System.out.println("a b' den büyük");
        }

        // a cif sayımı
        if (a % 2 == 0) {
            System.out.println("a cift sayı");
        }

        // b 5 ile tam bölünür mü
        if (b % 5 == 0) {
            System.out.println("b 5 ile tam bölünür");
        }

        // a sayısı 3 basamaklı mı
        if (a >= 100 && a <= 999) {
            System.out.println("a sayısı 3 basamaklı");
        }

        //a ile b nin toplamı 100 den büyük mü
        boolean sart = a + b > 100;
        System.out.println(sart); // false

        if (sart) {
            System.out.println("a ile b nin toplamı 100 den büyük");
        }

        if (true) {
            System.out.println("bu if bad si herzaman çalışır");
        }

        if (false) {
            System.out.println("Bu if body hicbir zaman calismaz");
        }


    }
}
