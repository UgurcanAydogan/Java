package day08_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "arama sonucu 1434 kelimeye ulaşıldı";

        // arama sonucunda 100 den fazla ooldugunu test edin
        // 100 de fazla ise "Test passed"
        //100 den fazla değilse "Test failed" yazdırın

        str = str.replaceAll("\\D", ""); // 1434

        int sonucSayısı = Integer.parseInt(str);
        // parseInt () içinde sadece digit bulunana String i integer a dönüştrür

        if (sonucSayısı > 100) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        System.out.println(str);

    }
}
