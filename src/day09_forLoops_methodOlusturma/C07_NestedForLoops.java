package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C07_NestedForLoops {
    public static void main(String[] args) {
        /*

           kulanıcıdan satır ve sutun numarası sayısını alıp
           aşadaki gibi * lardan olusan bir şekil çizdirin

           * * * * *
           * * * * *
           * * * * *

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satır = scanner.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int sütün = scanner.nextInt();


        // satırr = 5 sütün = 9


        for (int i = 1; i <= satır; i++) { // satır
            for (int j = 1; j <= sütün; j++) { // sütün

                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
