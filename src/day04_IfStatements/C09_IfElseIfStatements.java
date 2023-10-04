package day04_IfStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi
        //    - 30’dan buyukse obez,
        //    - 25-30 arasi ise kilolu,
        //    - 20-25 arasi ise normal,
        //    - 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kg olarak kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("lütfen cm olarak boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke = (kilo * 10000 / (boy * boy));
        System.out.println("vicut kitle endeksiniz : " + vke);

        if (kilo < 20 || kilo > 200 || boy < 30 || boy > 200 || vke < 10 || vke > 50) {
            System.out.println("lütfen girilen degerleri kontrol edınız");
        } else if (vke > 30) {
            System.out.println("vicut kitle endeksiniz :" + vke + "sonuc : obez");
        } else if (vke > 25) {
            System.out.println("vicut kitle endeksiniz :" + vke + "sonuc : kilolusunuz");
        } else if (vke > 20) {
            System.out.println("vicut kitle endeksiniz :" + vke + "sonuc : kilonuz normal sınırlar içerisinde");
        } else {
            System.out.println("vicut kitle endeksiniz :" + vke + "sonuc : zayıfsınız");
        }


    }
}
