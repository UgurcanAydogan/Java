package day09_forLoops_methodOlusturma;

public class C12_methodOlusturma {
    public static void main(String[] args) {

        String str = " Sevim bak kim gelmiş ? ";

        str.toUpperCase();

        // method bize bir sonuc döndürüyorsa 2 şekilde o sonucu kullanabiliriz

        // sadece o satırda sonucu görmek istiyorsaız kalıcı bir değişiklik yapmayacaksanız
        // direk yazdırabiliriz
        System.out.println(str.toLowerCase()); // sevim bak kim gelmiş

        // veya değişikliğin kalıcı olmasını istiyorsak
        // yeni halini kayıt edebiliriz

        String strBuyukharf = str.toUpperCase();

        System.out.println(str); // sevim bak kim gelmiş ?
        System.out.println(strBuyukharf); // SEVİM BAK KİM GELMİŞ ?

        // Google == google bu bir bug dur
    }
}
