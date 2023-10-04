package day12_Scope;

public class C02_Scope_LocalVariables {


    public static void main(String[] args) {

        int sayı = 20;
        // System.out.println(str);
        // System.out.println(bl);

        String s = "Hava";

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            String str = "Java";
            str += i;
            s += i;

        }

        // System.out.println(str);
        // System.out.println(i);
        System.out.println(s);


    }


    public static void staticMethod() {
        //System.out.println(sayı);
        String str = "Java";
        boolean bl = true;


    }


    public void staticOlmayanMethod() {
        // System.out.println(saı);
        // str ="tava";
        // boolean bl ="true";


    }


}
