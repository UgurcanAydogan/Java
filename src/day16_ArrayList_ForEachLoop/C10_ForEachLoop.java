package day16_ArrayList_ForEachLoop;

public class C10_ForEachLoop {
    public static void main(String[] args) {

        /*

              for-each loop
              birden fazla eleaman bulunduran
              arry ve list gibi yapılarla calışmak üzere hazırlanmıstır

              1'den 100 e kadar olan sayıları toplama
              sayı 50 den kucuk oldugu muddetce .... yapma
              gibi islem icin uygun degildir.

              for each loop
              birden fazla eleman barındıran yapılardakı elementleri
              hic bir sıralama sartı olmadan ve index kullanmadan
              BİZE GETİRİR

              for-each loop da 3 seyi yazmalıyız
              1) çalısacagımız elemetlerin data türü
              2) loop icinde gelen elemanları hangi isimle kulanıcaz (arry de arr[i])
              3) üzerinde islem yapacagımız çok elementli obje


         */


        int[] arr = {2,5,7,9,0};


        // array in tüm elementleri yazdırın

        for (int each:arr
             ) {
            System.out.print(each + " ");
        }

        System.out.println("");


        // arry deki tüm elemanları toplayın

        int toplam = 0;

        for (int w : arr
             ) {

            toplam += w;
        }
        System.out.println("Elelmentlerin toplamı : " + toplam); // Elelmentlerin toplamı : 23



        // arry deki cift sayıları carpımını yazdırın

        int carpım = 1;

        for (int each : arr
             ) {

            if (each % 2 == 0){
                carpım *= each;
            }
        }
        System.out.println("Carpim sonucu : " + carpım); // Carpim sonucu : 0

    }
}
