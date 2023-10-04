package day05_NesdetIfElse_ternary_switch;

import java.util.Scanner;

public class C10_SwitchStatment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün numarası giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("yanlış gün numarası");
        }

        /*
        gün isminin bas harfinin alın s S
        case s || S : olmaz
        case s,S : olmaz


        case s :
        case S :
         */


    }
}