package day11_WhileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // 1 den 10 kadar olan sayıları yzdırın
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + " ");
        }


        // soruyu while loop ile nasıl yaparız
        // while loop da
        //       - loop içinde kulanılacak variable,
        //       - bitiş şartı.
        //       _ artış azalış yöntemini bizim yazmamız gerekir

        int sayı = 1;
        while (sayı <=10){
            System.out.print(sayı + " ");
            sayı++;
        }

        // for loop ile yapılabilecek bir işlemi
        // for loop ile yapmak tercih edilir


    }
}
