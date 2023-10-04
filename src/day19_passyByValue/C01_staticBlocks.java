package day19_passyByValue;

public class C01_staticBlocks {

    C01_staticBlocks(){
        System.out.println("consturctor calıstı");
    }

    static {
        System.out.println("static blok calıstı");

        /*
             Eger clas calismya baslamadan
             belirli ayarlari yapmak isterseniz
             static blok olustura bilirsiniz

             static bloklar clas daki herseyden
             hatta main methodan bile önce calısırlar

             birden fazla staticc blok varsa
             kendi iclerinde once usteki calisir
         */
    }

    {
        System.out.println("static olmayann method");

        /*
            obje olusturmadan once
            yapilmasi gereken on ayarlar varsa kullanilir
         */
    }


    public static void main(String[] args) {

        System.out.println("main method calıstı");

        C01_staticBlocks obj = new C01_staticBlocks();

    }

    static {
        System.out.println("altaki static blok calisti");
    }
}
