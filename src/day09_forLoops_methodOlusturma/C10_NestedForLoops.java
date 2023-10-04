package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C10_NestedForLoops {
    public static void main(String[] args) {
         /*
         kulanıcıdan satır ve sutun numarası sayısını alıp
         aşadaki gibi * lardan olusan bir şekil çizdirin

         *
         * *
         * * *
         * * * *

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satır

            for (int j = 1; j <= i; j++) { // her satırda satır numarası oldugu için
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
