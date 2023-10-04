package day10_methotOlusturma_methodOverloading;

public class C03_AsalSayıBulma {

    public static void main(String[] args) {

        // verilen bir pozitif bir tam sayıının
        // asal olup olmadığını kontrol edip
        // asal ise treu asal değil ise folse yazdıran bir method oluşturun

        asalMıyazdır(45); //false
        asalMıyazdır(9876542); // false
        asalMıyazdır(5); // true
        asalMıyazdır(97); // true


    }

    public static void asalMıyazdır(int sayı) {

        boolean flag = true;

        for (int i = 2; i < sayı; i++) {

            if (sayı % i == 0) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);

    }


}
