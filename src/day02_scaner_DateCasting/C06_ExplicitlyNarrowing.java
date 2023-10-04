package day02_scaner_DateCasting;

public class C06_ExplicitlyNarrowing {
    public static void main(String[] args) {

        int sayı = 20;

        byte byt = (byte) sayı;
        System.out.println("20 nın byte karşılıgı : " + byt);
        // 20 nin karşılıgı 20 dir

        sayı = 130;
        byt = (byte) sayı;
        System.out.println("130 un byte olarak karşılıgı :" + byt);
        // 130 un byte olarak karşılıgı : -126 olur


        sayı = 256;
        byt = (byte) sayı;
        System.out.println("257 un byte olarak karşılıgı :" + byt);
        // 257 in byte olarak karşılıgı : 0 olur


        sayı = 567;
        byt = (byte) sayı;
        System.out.println("567 nin byte olarak karşılıgı :" + byt);
        // 567 nin byte olarak karşılıgı : 55 olur


        sayı = 640;
        byt = (byte) sayı;
        System.out.println("640 ın byte olarak karşılıgı :" + byt);
        // 640 un byte olarak karşılıgı : -128 olur


        double dbl = 34.7;
        sayı = (int) dbl;
        System.out.println("34.7 nin int olarak degeri : " + sayı);
        // 34.7 nin int olarak degeri : 34

        /*
        String str = (String)sayı;

        explice casting her data turu calısmaz
        biz simdilik sayısal primitivee data turleride
        genis deger dar kapsamlı varibleler atamak icin kullanılıyor

        Non-primitive data turlerinde de olur
        ancak parent child class lar arasında gecerlıdır
         */


    }
}
