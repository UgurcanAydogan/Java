package day19_passyByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        //Main method’da verilen fiyat degerine %10, %20 ve %30 indirim yaparak,
        // indirimli fiyati bize döndüren 3 method olusturun.
        //Main method’dan bu 3 method’u arka arkaya cagirip,
        // return edilen fiyatlari yazdirin.

        double fiat = 100;

        System.out.println("%10 indirimli fiat :"+ indirim10(fiat));
        System.out.println("%20 indirimli fiat :"+ indirim20(fiat));
        System.out.println("%30 indirimli fiat :"+ indirim30(fiat));

        System.out.println("indirimli fiatlar yazdırdıktan sonra fiat : " + fiat);

    }

    public  static double indirim10(double fiat){

        fiat = fiat * 90/100;

        return fiat;
    }

    public  static double indirim20(double fiat) {

        fiat = fiat * 80 / 100;

        return fiat;

    }

    public  static double indirim30(double fiat) {

        fiat = fiat * 70 / 100;

        return fiat;

    }
}
