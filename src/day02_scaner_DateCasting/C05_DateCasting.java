package day02_scaner_DateCasting;

public class C05_DateCasting {
    public static void main(String[] args) {
        int sayıInt = 34;
        String str = "java candır";
        boolean bl = true;
        char chr = '%';
        double dbl = 4.5;
        byte byt = 10;
        short shrt = 23;

        // data casting : bir data turundeki variable baska data turunde deger atamaya denir

        // bl = sayıInt ;
        // bl = str;
        // bl = chr,

        // bollen data turu sadece boolen olan data türü kabul eder

        // str = sayıInt;
        // str = bl;
        // str = chr ;

        // sayısal degerler alan variableye baska sayısal data turlerindeki degerler atanabilir mi ?

        dbl = sayıInt;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        // sayıInt = dbl;
        sayıInt = shrt;
        sayıInt = byt;
        sayıInt = chr;

        //shrt = dbl;
        //shrt = sayıInt;
        shrt = byt;
        // shrt = chr;


    }
}
