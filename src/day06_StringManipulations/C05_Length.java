package day06_StringManipulations;

public class C05_Length {
    public static void main(String[] args) {

        String str = "java öğrenen işsiz kalmaz";

        System.out.println(str.length()); // 26

        // sondan ikici karakteri yazdırın

        // System.out.println(str.charAt(26-2)); // z

        str = "java";
        System.out.println(str.charAt(str.length() - 2)); // v


        // kodlamada dinamik kod yazmaak onemlidir
        // dinamık kod ınput dan bilgileri alıp
        // ınpud değişse bile çalımaya devam eden ko demektir


        // metnini son karaktrini yazdırın
        System.out.println(str.charAt(str.length() - 1)); // a

        str = "java güzeldir.";
        System.out.println(str.charAt(str.length() - 1)); // .


    }
}
