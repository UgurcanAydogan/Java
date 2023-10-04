package day06_StringManipulations;

public class C08_StartsWith {
    public static void main(String[] args) {

        String str = "java candır.";

        System.out.println(str.contains("a")); // true
        System.out.println(str.startsWith("a")); // false
        System.out.println(str.endsWith("a")); // false

        System.out.println(str.startsWith("java candır.")); // true
        System.out.println(str.endsWith("java candır.")); // true

        System.out.println(str.endsWith("candır")); // false
        System.out.println(str.startsWith("")); // true
        System.out.println(str.endsWith("")); // true

        System.out.println(str.startsWith("Java")); // false
    }
}
