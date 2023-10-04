package day21_varrags_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {


        topla(3, 5); // Toplam : 8
        topla(3, 5, 7); // Toplam : 15


        /*
             method call sırasında istedigim kadar argument yazabilmek istiyorum

             java variety of arguments ==> varrargs ile hizmetimizde

             varargs array alt yapısını kulanarak
             istedigimiz kadar argument yazmamıza imkan tanır
         */
        topla(2); // 2
        topla(2, 5, 6, 7, 8, 8, 9, 0, 1, 4); // 50
        topla(1, 2, 3, 4, 5); // 15
        topla(1, 2, 4, 6, 8, 7, 9); // 37
        topla(3, 4, 5, 6, 7); // 25
    }

    public static void topla(int... sayı) {

        int toplam = 0;
        for (int each : sayı
        ) {
            toplam += each;
        }
        System.out.println(toplam);
    }

    public static void topla(int sayı1, int sayı2) {
        System.out.println("Toplam : " + (sayı1 + sayı2));

    }

    public static void topla(int sayı1, int sayı2, int sayı3) {
        System.out.println("Toplam : " + (sayı1 + sayı2 + sayı3));
    }
}