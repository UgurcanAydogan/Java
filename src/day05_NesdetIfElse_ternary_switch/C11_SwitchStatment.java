package day05_NesdetIfElse_ternary_switch;

import java.util.Scanner;

public class C11_SwitchStatment {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden
        // anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen anlamını ogrenmek istediginiz harfi giriniz");
        char harf = scanner.next().charAt(0);

        switch (harf) {
            case 'I':
            case 'i':
                System.out.println("International");
            case 's':
            case 'S':
                System.out.println("Softwarw");
            case 'T':
            case 't':
                System.out.println("Testing");
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
            case 'B':
            case 'b':
                System.out.println("Bord");
            default:
                System.out.println("lütfen ISTQB kisaltmasindaki harflerden birini yaziniz\")");
        }
    }
}
