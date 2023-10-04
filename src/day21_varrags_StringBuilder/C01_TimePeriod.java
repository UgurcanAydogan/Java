package day21_varrags_StringBuilder;

import java.time.LocalDate;
import java.time.Period;

public class C01_TimePeriod {
    public static void main(String[] args) {

        LocalDate dogumTarihi =LocalDate.of(1998,8,11);
        LocalDate bugun = LocalDate.now();

        Period yasım = Period.between(dogumTarihi,bugun);

        System.out.println(yasım); // P25Y1M23D

        System.out.println(yasım.getYears()); // 25
    }
}
