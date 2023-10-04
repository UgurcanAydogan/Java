package day06_StringManipulations;

public class C06_Substring {
    public static void main(String[] args) {

        String str = "java en güzel programlama dili";

        System.out.println(str.substring(5)); // en güzel programlama dili

        System.out.println(str.substring(0)); // java en güzel programlama dili

        System.out.println(str.substring(1)); // ava en güzel programlama dili

        // son 4 karaktri yazdırın

        System.out.println(str.substring(str.length() - 4)); // dili


        // metinden sadece javayı yaazdırın

        System.out.println(str.substring(0, 4)); // java

        // 0.index den basla 4 karakter yazdır
        // veya 0 index (dahil) ile 4. index (haric) arası

        // cumledeki 2.space in index i 7 ise
        // 2.space den sonraki 5 harfi yazdırın

        System.out.println(str.substring(8, 13)); // güzel

        System.out.println(str.substring(0, 1)); // j 0.inci indexi karakter
        System.out.println(str.substring(3, 4)); // a 3.index deki karakter

        // 6 inci indexdeki string olarak kaydedin

        String index6dakiHarf = str.substring(6, 7);
        System.out.println(index6dakiHarf); // n


        System.out.println("baslangıc indexi ve bitiş indexi aynı olursa:" + str.substring(5, 5) + "----"); // ""

        // System.out.println(str.substring(5,2)); // StringIndexOutOfBoundsException geriye doğru gidemez.


    }
}
