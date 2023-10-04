package day10_methotOlusturma_methodOverloading;

public class C06_AsalSayılarıBulma {
    public static void main(String[] args) {

        // bir önceki class da oluşturan methodu kullanarak
        // 3 basamaklı sayılrdan asal olanı yazdırın

        for (int i = 100; i < 1000; i++) {

            if (C05_AsalSayımıDondur.aslaMıDondur(i)) {
                System.out.print(i + " ");
            }
        }

        // 4 basamaklı kaç tane asal sayı var ?
        System.out.println("");
        int sayac = 0;

        for (int i = 1000; i < 10000; i++) {

            if (C05_AsalSayımıDondur.aslaMıDondur(i)) {
                sayac++;
            }
        }

        System.out.println("4 basamaklı sayılarda asal sayı adeti : " + sayac);

    }
}
