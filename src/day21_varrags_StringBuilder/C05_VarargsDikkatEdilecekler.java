package day21_varrags_StringBuilder;

public class C05_VarargsDikkatEdilecekler {

    // istenen kadar int parametre alip
    // ilk sayi disindaki tum sayilari toplayip
    // bulunan toplami ilk sayi ile carpipi yazdiran
    // bir method olusturun

    public static void main(String[] args) {

        islem(1, 2, 3, 4, 5, 6); // 20   1 * 20 = 20
        islem(2, 3, 0); // 6    2 * 3
        islem(0, 3);// 0     0 * 3
        islem(1); // 0    1 * 0   burada geriye kalanlar [] olur, 0 method da toplama bizim atatigimiz ilk deger


        // istenen kadar int parametre alip
        // son sayı disindaki tum sayilari toplayip
        // bulunan toplami son sayı ile carpipi yazdiran
        // bir method olusturun


    }

    /*
    public static void islemYapSon(int... toplanacakSayilar, int sonSayı){
        // Vararg parameter must be the last in the list

    }

    varargs alacagı elemet sayısı konusunda sınır tanımadıgından
    tüm elementleri almak ister

    bundan dolayı bir method da paramatre olarak varrargs  yazılacaksa
    en son parametre olarak yazılmalıdır

    bu sebeple bir method da iki varargs parametrede kulanılamaz
     */

    public static void islem(int ilkSayı, int... geriyeKalanar) {

        int toplam = 0;

        for (int each : geriyeKalanar) {

            toplam += each;
        }
        System.out.println(ilkSayı * toplam);
    }
}
