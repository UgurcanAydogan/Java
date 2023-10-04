package day20_immutableClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeFormatter {
    public static void main(String[] args) {

        /*
             yazdıgımız kodlarda zaman veya tarih ile ilgili islemlerde
             tarih veya zamanı istedigimiz formata tutabilmek icin
             DateTimeFormatter clası kulanabiliriz
         */

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-10-03T13:41:06.946923

        // 03 Oct 203 Tue
        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("dd MMM yyyy EEE");

        System.out.println(ldt.format(istenenFormat)); // 03 Eki 2023 Sal

        // saati 09:55 AM olarak yazdırın

        DateTimeFormatter istenenSaatFormatı1 = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(ldt.format(istenenSaatFormatı1)); // 10:58 ÖÖ

        // saat 9:55 24 saat göre

        DateTimeFormatter istenenSaatFormat2 = DateTimeFormatter.ofPattern("H:mm");

        System.out.println(ldt.format(istenenSaatFormat2)); // 11:00


        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini

         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar
         */

    }
}
