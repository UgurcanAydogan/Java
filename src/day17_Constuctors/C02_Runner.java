package day17_Constuctors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {
    public static void main(String[] args) {

       /*
             Constructor bir class dan obje olusturmak istedğimizde
             o objeye olusturuldugu class daki variable ve methodlarla ilgili
             ilk atamayı (initialize) yapan yapıdır

         */


        C01 obj = new C01();
        System.out.println(obj.sayı); // 6

        // bana rasgele bir sayı laazım
        obj.rasgeleSayıUrt();

        // bugun ne yemek bişirsem
        obj.bugunNePisireyim();

        Scanner scanner = new Scanner(System.in);
        String str = new String("java candır");
        List<Integer> sayılar = new ArrayList<>();


             C01            obj2             =               new            C01()            ;
        // class adı      obje adı       otomatık atama    keyword        Constructor

    }
}
