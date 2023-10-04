package day08_stringManipulations;

import java.util.Scanner;

public class C05_StringManipulations {
    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, “home home sweet home” yazdirin
        // - cumlede is geciyorsa, “calismak guzeldir”
        // - ikisini de iceriyorsa “Hem ev lazim hem is”
        // - hicbirini icermiyorsa “cok calisman lazim” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        String büyükCümle = cümle.toUpperCase();

        if (büyükCümle.contains("EV") && büyükCümle.contains("İŞ")) {
            System.out.println("Hem ev lazim hem is");
        } else if (büyükCümle.contains("EV")) {
            System.out.println("home home sweet home");
        } else if (büyükCümle.contains("İŞ")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }


    }
}
