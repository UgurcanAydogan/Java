package day05_NesdetIfElse_ternary_switch;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        // kulanıcıdan bir pozitif tam sayı alın
        // sayının çift veya tek oldugu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı girin");
        int sayı = scanner.nextInt();

        // sorunun if else ile çözümü

        if (sayı % 2 == 0) {
            System.out.println("sayıcift");
        } else {
            System.out.println("sayı tek");
        }


        // ternary ile çözümü

        System.out.println(sayı % 2 == 0 ? "sayı çift" : "sayı tek");

        // Sayı 100 den büyük ise sayıyı 2 katına çıkarın
        // 100 den büyük degil ise degerini 10


        sayı = sayı > 100 ? 2 * sayı : sayı + 10;

        System.out.println("rernary den sonra sayı : " + sayı);


        // sayının yeni hali 100 den büyük ise "sayı zaten büyük" yazdırın
        // yeni hali 100 den büyük değil ise sayı 2 katını çıkarın


        System.out.println(sayı > 100 ? "sayı zaten büyük" : 2 * sayı);
        // sadece yazdırmaveya sadece atama olan sayılarda trnary kulanılabilir
        // ama 2 si farklı ıslemler oldugunda kullanıcı islemler olmaz
        // bu soruda 2 katını yazdırdı ama soruda atama istiyordu yapmadı


    }
}
