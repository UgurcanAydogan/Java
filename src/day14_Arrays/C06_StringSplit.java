package day14_Arrays;

import java.util.Arrays;

public class C06_StringSplit {
    public static void main(String[] args) {

        String str = "Yaklaşık 145.000.000 sonuç bulundu (0,30 saniye";

        // arama sonuc sayısını 1 milyondan çok oldugunu test edin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Yaklaşık, 145.000.000, sonuç, bulundu, (0,30, saniye)]

        int sonucSayısı = Integer.parseInt(kelimeler[1].replaceAll("\\D", ""));

        System.out.println(sonucSayısı); // 145000000

        String[] ayırace = str.split("e");

        System.out.println(Arrays.toString(ayırace)); // [Yaklaşık 145.000.000 sonuç bulundu (0,30 saniy ) ]

        String[] ayıracHiclik = str.split("");
        System.out.println(Arrays.toString(ayıracHiclik));
        // [Y, a, k, l, a, ş, ı, k,  , 1, 4, 5, ., 0, 0, 0, ., 0, 0, 0,  , s, o, n, u, ç,  , b, u, l, u, n, d, u,  , (, 0, ,, 3, 0,  , s, a, n, i, y, e]


        String[] ayiracNokta = str.split(",");
        System.out.println(Arrays.toString(ayiracNokta));
        // [About 197.000.000 results (0, 43 seconds) ]
    }
}
