package day17_Constuctors;

public class C07_Car {


    String marka = "Marka atanmamış";
    String model = "Model atanmamış";
    String renk = "Renk atanmamış";
    int yıl = 1900;
    int fiat;

    C07_Car(){

        // bir class'da asagidaki gibi gorunur bir constructor olusturdugumuzda
        // Java default constructor'i siler
        // Bu durumda proje kapsamindaki baska class'larda
        // bu class'in default constructor'ini kullanarak olusturulmus olan objeler
        // CTE verir
        // Bu durumun onune gecmek icin
        // bir class'da gorunur bir parametreli constructor olusturuldugunda
        // DEFAULT constructor yerine de parametresiz ve bos bir cons. olusturulur
    }

    C07_Car(String mrk, String mdl){
        marka = mrk;
        model = mdl;
    }

    C07_Car(String mrk, String mdl, int yl, int fyt){
        marka = mrk;
        model = mdl;
        yıl = yl;
        fiat = fyt;
    }



    public String toString() {
        return "C07_Car Ozellikler" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yıl :" + yıl +
                ", fiat :" + fiat ;
    }
}
