package day17_Constuctors;

import java.util.Random;

public class C01 {

    int sayı = 6;
    String str = "Java candır";

    public void rasgeleSayıUrt(){

        Random random = new Random();
        int rasgeleSayı = random.nextInt(1000);
        System.out.println("Bugunku sanslı sayı : " +rasgeleSayı);
    }

    public void bugunNePisireyim(){

        String[] yemekler = {"kuru fasulye", "pilav", "cacık", "makarna", " mercimek corbası"};

        Random random = new Random();
        int yemekNo = random.nextInt(yemekler.length);
        System.out.println("Bugunun yemek teklifi : " + yemekler[yemekNo]);
    }
}
