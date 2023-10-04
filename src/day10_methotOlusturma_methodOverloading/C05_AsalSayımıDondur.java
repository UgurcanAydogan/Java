package day10_methotOlusturma_methodOverloading;

public class C05_AsalSayımıDondur {
    public static void main(String[] args) {

        // verilen pozitif bir tam sayının
        // asal sayı olup olöadığını kontrol edip
        // asal ise true asal değilse false döndüren
        // bir method oluşturun

        aslaMıDondur(45); // false döndürüd ama biz kulanmadık

        aslaMıDondur(43); // true

    }

    public static boolean aslaMıDondur(int sayı) {

        boolean flag = true;

        for (int i = 2; i < sayı; i++) {

            if (sayı % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;

    }
}