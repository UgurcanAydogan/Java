package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C09_NEstedForLoops {
    public static void main(String[] args) {
     /*
         kulanıcıdan satır ve sutun numarası sayısını alıp
         aşadaki gibi * lardan olusan bir şekil çizdirin

         1
         1 2
         1 2 3
         1 2 3 4

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        // ucgen şekiller içinde nested for loop kulanılır
        // diktörgenden farklı sutun no suna ihtiyacımız yoktur
        // her satırdaki sutun o satırın nosu ile aynıdır

        for (int i = 1; i <= satir; i++) { // satır

            for (int j = 1; j <= i; j++) { // her satırda satır numarası oldugu için
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
