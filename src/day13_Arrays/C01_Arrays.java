package day13_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr = new int[5];

        /*
           bir erray olustururken 2 sey mutlaka deklare edilmelidir
           1- icine konulacak elementler data turu
           2- array ın icine konulacak element sayısı (length)


           eger arrayi yukardaki gibi olustursak
           biz hic bir deger ataması yapmadığıgımız icin
           java bize default olarak belirlediği degeerleri atayacak

           Array olusturulduktan sonra olmayan index
           kullanılarak yeni deger ataması/eklemesi MÜMKÜN değildir

           yani 4 elemanlı bir array e 5 inci elementi atayamazsınız
           aynı şekilde 4 elemanı olan arrayden bir elamanı silip eleman sayısını 3 e düşürmeliyiz

         */

        int[] arr2 = {4, 1, 7, 5}; // length = 4

        System.out.println(arr2[1]); // 1
        System.out.println(arr2[3]); // 5

        System.out.println(arr2[args.length - 1]); // son elementi yazdırmak istersek 5 verir bize


        // ilk arryde deger ataması yapmadık

        System.out.println(arr[0]); // 0
        System.out.println(arr[arr.length - 1]); // son elementi yazdırır 0

        // olmayan bir indexdeki bir elemente ulasmak istersek
        // System.out.println(arr2[5]); // ArrayIndexOutOfBoundsException


        // olmayan bir indexe atama yapabilirmiyiz ?
        arr2[4] = 8; // ArrayIndexOutOfBoundsException

        arr = new int[10];

        arr = new int[20];

    }
}
