package day21_varrags_StringBuilder;

public class C06_StringBuilder_lengt_capacity {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // icinde hic bir yazi yok, length ==> 0,
        System.out.println("sb1 length : " +sb1.length()); // 0
        System.out.println("sb1 capacity : " +sb1.capacity()); // 16


        StringBuilder sb2 = new StringBuilder("Uğur Can");
        // icinde uğur can var length ==> 8
        System.out.println("sb2 length : " +sb2.length()); // 8
        System.out.println("sb2 capacity : " +sb2.capacity()); // 16 + 8 = 24


        StringBuilder sb3 = new StringBuilder(11);
        // icinde hic bir yaz yok length ==> 0
        System.out.println("sb3 length : " +sb3.length()); // 0
        System.out.println("sb3 capacity : " +sb3.capacity()); // 11


        // Eger String Builder a ekleme yaparsanız
        // java eklenecek metine de alabilmesi icin
        // sb in kapasastesi 2 * eksi kapasitesi + 2 seklinde artırı
        sb2.append(" okula gitmek istiyor.");
        System.out.println("sb2 : " + sb2); // Uğur Can okula gitmek istiyor.
        System.out.println("sb2 length : " +sb2.length()); // 8
        System.out.println("sb2 capacity : " +sb2.capacity()); // 16 + 8 = 24

        // Eger kapasite ve length i esitlemekisterseniz

        sb2.trimToSize();
        System.out.println("sb2 length : " +sb2.length()); // 8
        System.out.println("sb2 capacity : " +sb2.capacity()); // 16 + 8 = 24
    }
}
