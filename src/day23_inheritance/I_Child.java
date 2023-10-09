package day23_inheritance;

public class I_Child extends  H_Parent{

    public static void main(String[] args) {

        I_Child child1 = new I_Child();

        // child1.araba private
        System.out.println(kasa); // kasa bos

        kasa = "75";
        System.out.println(kasa); // 75

        // defoult normalde inheritace icin uygun degildir
        // ama cu class aynı package da oldugu icin kallanilabilir
        // parent baska bir package da olursa child class
        // parent class daki default acces modifier a sahip
        // class uyelerine ulasamaz
        child1.sayı= 34;
        System.out.println(child1.adres); // Yenimahalle
    }
}
