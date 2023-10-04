package day18_parametrizedConstructor_construcyorCall;

public class C01_Car {

    String marka = "Marka atanmamış";
    String model = "Model atanmamış";
    String renk = "Renk atanmamış";
    int yıl = 1900;
    int fiat;

    public C01_Car(){

        // renk = "Kırmızı";

        /*
        defoult construcyor ile parametresiz constructorun en büyük farkı
        default cons. in bodysi bos iken
        paramaetresiz cons. lara kod yazdırılabilir
        bu durumda yapılan tüm araclar icin standart renk kırmızı olur
         */
    }

    public C01_Car(String mrk, String mdl, String rnk){

        marka = mrk;
        model = mdl;
        renk = rnk;
    }

    C01_Car(String marka, String model, String renk, int fiat){

        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiat = fiat;

    }

    // tüm instance lar icin parametre alan bir cons olusturalım
        public C01_Car (String marka, String model, String renk, int yıl,int fiat) {
            this.marka = marka;
            this.model = model;
            this.renk = renk;
            this.fiat = fiat;
        }

     // model ve yıl parametresi olsun
    // biz hep toyota satıyoruz ve renkleri hep mavi
    public C01_Car(String model, int yıl){
        this.model = model;
        this.yıl = yıl;
        marka = "Toyota";
        renk = "Mavi";

    }



    public String toString() {
        return "C07_Car Ozellikler" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yıl :" + yıl +
                ", fiat :" + fiat;
    }
}