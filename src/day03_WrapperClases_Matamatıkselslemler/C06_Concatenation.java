package day03_WrapperClases_Matamatıkselslemler;

public class C06_Concatenation {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "kolaydır";
        String s3 = " ";
        String s4 = "";

        int a = 4;
        int b = 3;

        // sadece verilen variableri kulanarak asadaki isteneleri yazdırın

        // java kolaydır 12

        System.out.println(s1 + s3 + s2 + s3 + a * b);

        // java7kolaydır

        System.out.println(s1 + (a + b) + s2); // java7kolaydır

        // 43java
        System.out.println(s4 + a + b + s1); // 43java


    }
}
