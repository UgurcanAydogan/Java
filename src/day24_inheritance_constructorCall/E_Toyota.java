package day24_inheritance_constructorCall;

public class E_Toyota extends D_Car {

    E_Toyota(){
        super(); // once parent deki parametresiz cons. calistir.
    }

    String marka = "Toyota";
    String uretimYeri = "Japonya ve Turkiye";

    String sanziman = "Otamatik veya Manuel";
    String lastik = "Pirelli";
    String guvenlik = "Toyota araclar ekstra guvenlik donanima sahiptir";
    String aku = "Aku atanmadı";

}
