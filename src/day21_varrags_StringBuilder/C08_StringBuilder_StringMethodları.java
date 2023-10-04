package day21_varrags_StringBuilder;

public class C08_StringBuilder_StringMethodları {

    public static void main(String[] args) {

        /*

            StringBuilder ile bazı String methodları da kullanılabilir
            bize Strin veya char donduren methodlar
            kalıcı degisikler yapmazlar

            bazi Strin methodları ise String Builder da yoktur
            kulanmak istersek
            sb.toString() ile once Stringe cevirir sonra istenen String methodu kullanılabilir
            boyle yapılan degisikler sb kalıcı degisikler YAPMAZ

         */


        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.substring(2)); // va

        System.out.println(sb); // Java

        System.out.println(sb.charAt(2)); // v

        System.out.println(sb); // Java

        // void olan setCharAt() kalıcı degisiklik yapar
        sb.setCharAt(0, 'H');
        System.out.println(sb); // Hava

        // sb "a" iceriyor mu
        System.out.println(sb.toString().contains("a")); // true

    }
}
