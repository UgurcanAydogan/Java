package day04_IfStatements;

import java.util.Scanner;

public class C03_Ifstatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("sınıfı gectın");
        }

        if (not < 50) {
            System.out.println("malesef kalddınız");
        }

        if (not >= 50) {
            System.out.println("sınııfı geçtin");
        } else {
            System.out.println("malesef kaldınız");
        }


    }
}
