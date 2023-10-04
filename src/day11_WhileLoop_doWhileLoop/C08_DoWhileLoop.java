package day11_WhileLoop_doWhileLoop;

public class C08_DoWhileLoop {
    public static void main(String[] args) {

    /*
         While loop kulanıcıdan deer almadan
         ve / veya tekrar sayısı olmayan durumlarda kullanmaya tercih ediyoruz

         while loop un 2 tane negatif yonü vardır
         1- loop öncesinde baslangıc degeri loop içinde alırız
            eğer ilk deger atamasına dikkat edilmezse
            hatalı bir deger atanabilir ve bu durumda loop çalışmayabilir

        2- kontrol işlemi basta yapılır, body sonradan çalıştırgı için kontrol işlemi hep bir fazla yapılır

     */

        int sayı = 5;

        // verilen sayı ile 3 (haric) arasındaki sayıları yazdırın

        while (sayı > 3) {
            System.out.println(sayı + " ");
            sayı--;
        }

        // Java özellikle kullanıcıdan deger alırken
        // ilk degeri yanlış atamamamız için
        // bir alternatif olaraka do-while loop u olusturmusur
        // do-while loop da once işlem yapılır sonra kontrool edilir


        sayı = 5;

        // verilen sayı ile 3 (haric) arasındaki sayıları yazdırın

        do {
            System.out.println(sayı + " ");
            sayı--;
        }while (sayı > 3);
    }
}
