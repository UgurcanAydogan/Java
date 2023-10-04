package day04_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ücgenın kenar uzunluklarını gitiniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        // java 2 li kenar karsılastırmaya kabul eder
        // daha fazla karsılastırma ihtiyacı varsa
        // mantıksal operator sartları ayrı ayrrı kabul edere

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar2 > 0) {
            System.out.println("verilen kenar uzunlukları es kenar ucgen olusturur");
        }


    }
}
