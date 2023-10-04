package day21_varrags_StringBuilder;

public class C07_StringBuilder_EklemeSilme {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candır");

        sb.append(".");

        System.out.println(sb); // Java candır.

        String str = "Hava cok guzel";

        sb.append(str,5,8);

        System.out.println(sb); // Java candır.cok

        sb.insert(5,"cok ");

        System.out.println(sb); // Java cok candır.cok

        sb.insert(19,str,8,14);
        // bizim sb nin 19 index ine yukardakı str in 9 indexine ile 14 index arasına ekle

        System.out.println(sb); // Java cok candır.cok guzel

        sb.delete(16,25);
        System.out.println(sb); // Java cok candır.

        // sondaki karakteri silin
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb); // Java cok candır

        // index saymadan "cok" boslugu silin

        int indexCok = sb.indexOf("cok");
        sb.delete(indexCok,indexCok+4);
        System.out.println(sb); // Java candır



    }
}
