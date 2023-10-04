package day08_stringManipulations;

public class C10_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // eğer baslangıc degeri ve degisim yöntemi
        // bitiş şartını hiç salamayacak sekilde ilerlerse
        // SONSUZ LOOP oluşur

       /*


          for (int i = 10; i >0 ; i++) {

          System.out.print(i+" ");
        }


        */

        // eğer ilk deger için bile bittiş koşulu false veriyorsa
        // LOOP BODY Sİ hiç devreye girmez

        for (int i = 10; i < 5; i++) {

            System.out.println(i);
        }


    }
}
