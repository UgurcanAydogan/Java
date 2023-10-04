package day13_Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // VErilen String bir array de
        // isteilen harfi iceren elementler yazdırın

        String [] isimler = { "Uğurcan","Aybar","Elif","Buket","Sibel","Halil"};
        String istenilenHarf = "a";

        for (int i = 0; i <isimler.length ; i++) {


            if (isimler[i].contains(istenilenHarf)){
                System.out.println(isimler[i] + " ");
            }
        }





    }
}
