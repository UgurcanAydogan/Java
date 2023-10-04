package day11_WhileLoop_doWhileLoop;

public class C01_MethodOverloading {
    public static void main(String[] args) {
        /*
            bir clas da ismi aynı ama signaturre farkılı
            methodlar olusturmaya Method OVERLODİNG denir

            mthod overlodıng amacı aynı işlevi
            farklı sakılerde kulanabilmekti

            overloding de isimleri aynı oldugunda
            aybı clas da birden fazla overloding method yazabilmek icin signature değiştirmemiz gerekir

            signature = method adı + parametrelerin data türleri
            toplama int int
            toplama int
            toplama int int int

            toplama double int
            toplama int double
            toplama float int
            toplama float doubl

           java hangi methodu kulanacagına
            method call saırasında yazacagıjmız argument lere göre karar verir


            1- argument sayısı == paramater sayısı
            2- argument sata türleri ve sıralanışı == parametre data turleri ve sıralanması
            3- argunmet leri ile paramatre %100 uyumlu olmazsa
               castıng ile çalıştırılabilir method var mı ? diye sorar
               casting ile calıştırabilecek birden fazla method varsa
               en az castıng yaparak kullanabileceğini tercih eder

         */

        String str = "Java Candır";
        System.out.println(str.substring(3)); // a Candır
        System.out.println(str.substring(3,6)); // a C

        System.out.println(str.replace('a','b')); // Jbvb Cbndir
        System.out.println(str.replace("Can","Guzel")); // Java Güzeldir


    }
}
