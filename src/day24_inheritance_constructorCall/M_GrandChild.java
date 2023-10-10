package day24_inheritance_constructorCall;

public class M_GrandChild extends K_Child{

     int sayı = 100;
     int yas = 25;
     String arkadas = "Enes";

     String mahalle = "4.levet";
     String memleket = "istanbul";


    public  void method1(){
        System.out.println("GC method1");
    }
    public  void method3(){
        System.out.println("GC method3");
    }
    public  void method4(){
        System.out.println("GC method4");
    }
    public void runnerMethod(){
        int yas = 25;
        int sansliSayi = 88;
        System.out.println(yas); // 5
        System.out.println(this.sayı); // 100
        System.out.println(super.sayi); // 20

        System.out.println(sinif); // 8
        System.out.println(isim); // uğurcan
        System.out.println(yas); // 25
        System.out.println(tel); // 5554446556

        System.out.println(this.sinif); // 8
        System.out.println(this.mahalle); // 4.levet
        System.out.println(this.adres); // Yenimahalle

        this.method1(); // GC method1

        System.out.println(super.sinif); // 8
        System.out.println(super.isim); // uğurcan
        System.out.println(super.memleket); // Ankara

        System.out.println(sansliSayi); // 88
        // System.out.println(this.sansliSayi);
        // System.out.println(super.sansliSayi);

        System.out.println(arkadas); // Enes
        System.out.println(this.arkadas); // Enes
        // System.out.println(super.arkadas);

        method2(); // Parent method2
        this.method2(); // Parent method2
        super.method2(); // Parent method2

        method3(); // GC method3
        this.method3(); // GC method3
        super.method3(); // Child method3


    }

    public static void main(String[] args) {

       /*
           java bir variable degerini bulmak icin
           sırasiyle
           1- icinde oldugumuz scope
           2- icinde oldugumuz class ın class levelin
           3- parent lerine bakar

           ama bizz siralamaya uymadan
           direek class level daki degerlere ulasmak istersek
           this.
        */

        M_GrandChild obj = new M_GrandChild();
        obj.runnerMethod();
    }
}

