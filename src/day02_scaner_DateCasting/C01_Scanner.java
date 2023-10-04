package day02_scaner_DateCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // soru: kulanıcıdan uc farklı data turunde deger alınız
        //       girilen degerleri acıklamalarıyla yazınız


        // adım 1 - scaner objesi olusturun

        Scanner scanner = new Scanner(System.in);


        // adım 2 - kulanıcıdan ne istedigini söyleyin

        System.out.println("lütfen isminizi giriniz");


        // adım 3 - girilen bilgiyi uygun bir variableye olusturunp
        //            data turunu uygun nest...() ile bilgiyi alıp kaydedin

        String girilenIsım = scanner.nextLine(); // sadece ilk isim alır


        System.out.println("Girilen isim : " + girilenIsım);


        // ikinci olarak bir tam sayı isteyin mesela yasını isteyin

        System.out.println("lütfen yasınızı giriniz");

        int yas = scanner.nextInt();

        System.out.println("Yasınız : " + yas);


        // emekli misiniz ? true / false
        System.out.println("Emekli misiniz ? true veya false giriniz");
        boolean emekliMi = scanner.hasNextBoolean();


        System.out.println("girilen isim : " + girilenIsım);
        System.out.println("yasınız : " + yas);
        System.out.println("emeli misiniz : " + emekliMi);

    }
}
