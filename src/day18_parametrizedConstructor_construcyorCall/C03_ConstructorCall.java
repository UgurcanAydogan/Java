package day18_parametrizedConstructor_construcyorCall;

public class C03_ConstructorCall {

    C03_ConstructorCall() {
        this("Java");
        //  this(5); // Call to 'this()' must be first statement in constructor body
        System.out.println("Parametresiz constructor calıstı");
    }

    C03_ConstructorCall(int sayı) {

        System.out.println("int parametreli constructor calıstı");
    }

    C03_ConstructorCall(String metin) {
        // C03_ConstructorCall(); // method coll syntax i oldugundan java bu isimdde method arar
        this(6); // constructor call syntax i
                     // constructor adını degil this (istenmeyen paramatre) yazarız
        System.out.println("String parametreli constructor calıstı");

    }

    public static void main(String[] args) {

        // C03_ConstructorCall obj = new C03_ConstructorCall("A");
        // int parametreli constructor calıstı
        // String parametreli constructor calıstı

        C03_ConstructorCall obj2 = new C03_ConstructorCall();
    }
}