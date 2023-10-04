package day06_StringManipulations;

import javax.security.auth.login.FailedLoginException;
import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        // kulanıcıdan bir harf isteyin
        // kullanıcı a harf yazarsa aile
        // i yazarsa iş yazdırın
        // bu harfler dısında karakter girerse
        // bu harfi bilmiyorum yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf girinizg");
        char girilenHarf = scanner.next().charAt(0);

        // kulanıcı küçük harf veya büyük harf girmiş olabilir
        // stringleri büyük kücük harf gözetmeksizin karsılastırabiliriz

        String harf = girilenHarf + "";

        if (harf.equals("a") || (harf.equals("A"))) {
            System.out.println("alie");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("ış");
        } else {
            System.out.println("bu harfi bilmiyorum");
        }

        // equalsIgnoreCase() kucuk veya büyük harf farketmekssizin metinlere bakar

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "Va";
        String str6 = "ja";
        String str7 = "vA";
        String str8 = str6 + str7;

        System.out.println(str1.equals(str2)); // Java java ==> false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.equals(str3)); // Java JAva ==> false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.equals(str4)); // JAVa java ==> false
        System.out.println(str1.equalsIgnoreCase(str4)); // true


    }
}
