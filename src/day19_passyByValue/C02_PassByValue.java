package day19_passyByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayı = 20;

        System.out.println("method call oncesi sayı : " + sayı); // 20

        System.out.println("method return degeri "+sayıDegistirme(sayı)); // 25

        System.out.println("method call sonrası sayı : " + sayı); // 20


        sayı = sayıDegistirme(sayı);


        System.out.println("atama call sonrası sayı : " + sayı); // 25
    }

    public static int sayıDegistirme(int sayı) {

        sayı += 5;

        System.out.println("method icinde sayı : " + sayı);

        return sayı;
    }

}