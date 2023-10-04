package day18_parametrizedConstructor_construcyorCall;

import day17_Constuctors.C01;
import day17_Constuctors.C07_Car;

public class C02_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println("Car1 " + car1);
        // Car1 C07_Car Ozelliklermarka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yıl :1900, fiat :0

        car1.marka = "BMW";
        car1.model = "116";
        car1.yıl = 2010;
        car1.fiat = 70000;
        System.out.println("Car1 " + car1);
        // Car1 C07_Car Ozelliklermarka :'BMW', model :'116', renk :'Renk atanmamış', yıl :2010, fiat :70000

        // marka, model, ve renk degerlerini parametresiz olarak
        // yollayabilecegimiz bir constructor olusturalım

        C01_Car car2 = new C01_Car("Nissan","Micra","Mavi");
        System.out.println("Car2 " + car2);
        // Car2 C07_Car Ozelliklermarka :'Nissan', model :'Micra', renk :'Mavi', yıl :1900, fiat :0

        C01_Car car3 = new C01_Car("Opel", "Corsa", "Beyaz");
        System.out.println("Car3 " + car3);
        // Car3 C07_Car Ozelliklermarka :'Opel', model :'Corsa', renk :'Beyaz', yıl :1900, fiat :0

        // marka, model, renk ve fiat parametreleri olan
        // bir constructor olusturun

        C01_Car car4 = new C01_Car("Peugeot", "206", "Turuncu",50000);
        System.out.println("Car4 " + car4);
        // Car4 C07_Car Ozelliklermarka :'Peugeot', model :'206', renk :'Turuncu', yıl :1900, fiat :50000
    }
}
