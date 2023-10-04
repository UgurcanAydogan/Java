package day21_varrags_StringBuilder;

public class C03_Varargs {

    // 1 int ve istenen kadar String paramatre alıp
    // String parrametre sayisi ile int sayisini carpimi yazdiran bir method olusturun


    public static void main(String[] args) {

        islemYap(5, "a", "b", "c"); // 5 * 3 = 15
        islemYap(2, "a"); // 2 * 1 = 2
        islemYap(5); // 5 * 0 = 0
        islemYap(3, "", "", "", "", ""); // 3 * 5 = 15
    }

    public static void islemYap(int sayı, String... stringstr){

        System.out.println(sayı * stringstr.length);
    }
}
