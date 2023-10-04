package day09_forLoops_methodOlusturma;

public class C06_NestedForLoops {
    public static void main(String[] args) {

        // 1 2 3 4 yazdırın
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // 2 4 6 8 yazdırın
        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("");
        // 3 6 9 12
        for (int i = 1; i <= 4; i++) {
            System.out.print(3 * i + " ");
        }


        /*
         bu tür tekrar eden işlemleri NESRED () iç içe For-Loop ile yapabiliriz
         yukarıda 3 kez loop u çalıştırdık (satır sayısı kadar)

         1 2 3 4
         2 4 6 8
         3 6 9 12

         aralarındaki tek fark 1*i, 2*i, 3*i
         */

        System.out.println("=================");

        for (int i = 1; i <= 3; i++) { // outer (dış) loop satırları kontrol eder

            for (int j = 1; j <= 4; j++) { // inner (iç) loop sutunlarına konrol eder

                System.out.print(i * j + "");
            }

            System.out.println("");
        }

    }
}
