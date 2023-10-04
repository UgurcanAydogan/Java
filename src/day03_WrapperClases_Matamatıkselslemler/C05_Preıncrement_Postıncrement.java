package day03_WrapperClases_Matamatıkselslemler;

public class C05_Preıncrement_Postıncrement {
    public static void main(String[] args) {

        int a = 20;

        // a nın degerini yazdırın
        // sonra a nın deegerinin 1 artırıp olusturacagınız b variablenin yeni degerini yazdırınız


        System.out.println("a :" + a);

        a += 1;
        int b = a;

        System.out.println("islem sonun da a :" + a + ",b :" + b);


        a = 20;

        // a nın degerini b ye atayıp
        // sonra a nın degerinin 1 artırın

        b = a;
        a += 1;

        System.out.println("islem sonun da a :" + a + ",b :" + b);


        System.out.println("=================================");


        // bu anlatılan sadece ++ veya -- şeklinde kulanım içindir

        a = 20;
        b = a++;

        System.out.println("islem sonun da a :" + a + ",b :" + b);

        a = 20;
        b = ++a;

        System.out.println("islem sonun da a :" + a + ",b :" + b);


        int c = 40;

        System.out.println(" c++ ile yazdırınca :" + c++);
        System.out.println(" c++ ile bir alt satırda c nin degeri :" + c);


        c = 40;

        System.out.println(" ++c ile yazdırınca :" + ++c);
        System.out.println(" ++c ile bir alt satırda c nin degeri :" + c);


    }
}
