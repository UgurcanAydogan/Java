package day20_immutableClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C04_LocalTime {
    public static void main(String[] args) {

        /*
             local time objesi canlı bir kronemetrre deği
             olusturuldugu anda sistemin saat bilgisini kayıt eden bir variable dir
         */

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 13:05:47.902438900

        LocalTime turkiyeSaati = LocalTime.now(ZoneId.of("Europe/Paris")).plusHours(1);

        System.out.println(turkiyeSaati); // 13:09:27.612259800

        LocalTime jopanyaSaati = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(jopanyaSaati); // 19:11:16.959968400

        System.out.println(localTime.toNanoOfDay()); // 47555674271900


        // yuzbin ile 1 milyon arasıdaki sayıların toplamını
        // ve toplama isleminin kac nanao saniye sürdügünü yazdırın


        System.out.println("loop basında locatime : " + localTime); // loop basında locatime : 13:25:27.557524300


        LocalTime baslangıc = LocalTime.now();
        System.out.println("Baslangıc : " + baslangıc); // Baslangıc : 13:25:27.572956700
        System.out.println("Baslangıcta nano saniye : " + baslangıc.toNanoOfDay()); // Baslangıcta nano saniye : 48327572956700


        long toplam = 0;

        for (int i = 10000; i <1000000 ; i++) {
            toplam +=i;
        }
        System.out.println("toplam : " + localTime); // toplam : 13:25:27.557524300
        System.out.println("loop sonunda local time : " + localTime); // loop sonunda local time : 13:25:27.557524300
        LocalTime bitis = LocalTime.now();
        System.out.println("Bitis : " + bitis); // Bitis : 13:25:27.584988
        System.out.println("Bitis de nano saniye : " + bitis.toNanoOfDay()); // Bitis de nano saniye : 48327584988000


        System.out.println("Islem süresi " + (bitis.toNanoOfDay() - baslangıc.toNanoOfDay())); // Islem süresi 12031300





    }
}
