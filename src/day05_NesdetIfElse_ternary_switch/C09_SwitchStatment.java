package day05_NesdetIfElse_ternary_switch;

import java.util.Scanner;

public class C09_SwitchStatment {
    public static void main(String[] args) {
        // kulanıcın girdigi gün numarasına göre
        // gün isimlerini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün numarası giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("yanlış gün numarası");


        }
    }
}
