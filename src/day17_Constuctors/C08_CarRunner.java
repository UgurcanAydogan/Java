package day17_Constuctors;

public class C08_CarRunner {
    public static void main(String[] args) {

        C07_Car car1 = new C07_Car();

        System.out.println(car1.marka); // Marka atanmamış
        System.out.println(car1.model); // Model atanmamış

        System.out.println(car1); // day17_Constuctors.C07_Car@48140564
        System.out.println(car1.toString()); // day17_Constuctors.C07_Car@48140564

        // eğer bir class dan obje olusturdumuzda
        // objenin tüm ozeliklerinin tek bir sout ile yazdırmak isterseniz
        // o classa toString() olusturmalısınız

        System.out.println(car1);
        // C07_Car{marka='Marka atanmamış', model='Model atanmamış', renk='Renk atanmamış', yıl=1900, fiat=0}
        // C07_Car Ozelliklermarka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yıl :1900, fiat :0

        C07_Car car2 = new C07_Car();

        car2.marka = "Toyota";
        car2.model = "Corolla";
        car2.renk = "Kırmızı";
        car2.yıl = 2015;
        car2.fiat = 10000;

        System.out.println(car2);
        // C07_Car Ozelliklermarka :'Toyota', model :'Corolla', renk :'Kırmızı', yıl :2015, fiat :10000

        C07_Car car3 = new C07_Car();

        car2.marka = "Mercedes";
        car2.model = "E200";
        car2.renk = "Siyah";
        car2.yıl = 2015;
        car2.fiat = 15000;

        System.out.println(car2);
        // C07_Car Ozelliklermarka :'Mercedes', model :'E200', renk :'Siyah', yıl :2015, fiat :15000

        // eger atamayı her seferinde tek tek yapmak istemezseniz
        // atama islemini constructor da yapabiliriz

        C07_Car car4 = new C07_Car("Porsche","Carrera");
        System.out.println(car4);
        // C07_Car Ozelliklermarka :'Porsche', model :'Carrera', renk :'Renk atanmamış', yıl :1900, fiat :0


        C07_Car car5 = new C07_Car("Citroen","C3");
        System.out.println("car5: " +car5);
        // car5 : C07_Car Ozelliklermarka :'Citroen', model :'C3', renk :'Renk atanmamış', yıl :1900, fiat :0


        // marka, model, yıl, fiat olan araclar üretmek istiyoruz
        C07_Car car6 = new C07_Car("Honda","Jazz",2016,7000);
        System.out.println("car6 : " + car6);
        // car6 : C07_Car Ozelliklermarka :'Honda', model :'Jazz', renk :'Renk atanmamış', yıl :2016, fiat :7000


        C07_Car car7 = new C07_Car("Audi","A4",2015,15000);
        System.out.println("car7 : " + car7);
        // car7 : C07_Car Ozelliklermarka :'Audi', model :'A4', renk :'Renk atanmamış', yıl :2015, fiat :15000
    }
}
