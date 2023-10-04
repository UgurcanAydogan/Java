package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_FibonacciSayıları {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan pozitif bir tamsayidan kucuk
        //        Fibonacci sayilarini bir liste olarak bize donduren
        //        bir method olusturun.

        System.out.println(fibonacciListesi(500)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]
        System.out.println(fibonacciListesi(1000)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987]
    }


    public static List<Integer> fibonacciListesi(int ustSınır) {

        List<Integer> fibonacciListesi = new ArrayList<>();

        if (ustSınır == 0) {

            fibonacciListesi.add(0);

        } else if (ustSınır == 1) {

            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

        } else { // üt sınır 1 den büyük

            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

            int yeniSayı;
            int index = 3;

            do {
                yeniSayı = fibonacciListesi.get(index - 2) + fibonacciListesi.get(index - 1);

                if (yeniSayı <= ustSınır) {
                    fibonacciListesi.add(yeniSayı);
                }
                index++;

            } while (yeniSayı <= ustSınır);

        }
        return fibonacciListesi;
    }
}
