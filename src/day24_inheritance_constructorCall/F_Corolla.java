package day24_inheritance_constructorCall;

public class F_Corolla extends E_Toyota {

    String model = "Corolla";
    String uretimYeri = "Turkiye";
    String lastik = "Pirelli Sakarya";
    String aku = "Ince aku";

    String tekerCapi = "19 inc";
    String guvenlik = "Safe drive";
    String bagajHacmi = "200 litre";

    F_Corolla(){
        super(); // once parent deki parametresiz cons. calistir.
    }


    public static void main(String[] args) {

        F_Corolla corolla1 = new F_Corolla();

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.model); // Co Corolla
        System.out.println(corolla1.renk); // Co renk atanmamis
        System.out.println(corolla1.yakit); // Car yakıt tanimlamamis
        System.out.println(corolla1.uretimYeri); // Co Turkiye
        System.out.println(corolla1.sanziman); // T Otamatik veya Manuel
        System.out.println(corolla1.lastik); // Co Pirelli Sakarya
        System.out.println(corolla1.guvenlik); // Co Safe drive
        System.out.println(corolla1.aku); // Co Inci aku
        System.out.println(corolla1.tekerCapi); // Co 19 inc
        System.out.println(corolla1.bagajHacmi); // Co 200 litre


        /*
             bir obj kuruldugunda
             ilk deger ataması (initalization) icin MUTLAKA constructor calismali
             child class da olusturulan bir obj nin
             parent class lar daki ozellikleri de tasimasi icin
             parent class lar daki CONSTRUCTOR lar da CALIMALİDİR

             java bunun icin ozel konsept olusturmustur

             java nin olusturulan her class a
             obj olusturmasina izin vermek icin
             DEFOULT CONSTRUCTOR koydugu gibi

             AYNİ SEKİLDE
             exdent kulanan her clas da olusturulan
             HER CONSTRUCTOR ın ilk satirina super() koyar
         */


    }
}
