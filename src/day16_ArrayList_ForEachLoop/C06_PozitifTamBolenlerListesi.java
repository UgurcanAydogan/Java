package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {
    public static void main(String[] args) {

        //Soru 6- Verilen pozitif bir tamsayiyi,
        //        tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        System.out.println(tamBolenlerListesi(20));
        System.out.println(tamBolenlerListesi(50));
    }

    public static List<Integer> tamBolenlerListesi(int sayı){ // 30


        List<Integer> tamBolenlerListesi = new ArrayList<>();
        tamBolenlerListesi.add(1);

        for (int i = 2; i <= sayı ; i++) {

            if (sayı % i == 0){
                tamBolenlerListesi.add(i);
            }
        }

        return  tamBolenlerListesi;
    }
}
