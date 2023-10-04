package day20_immutableClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C05_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-10-03  T  13:32:33.240691200

        // kulanıcıya zamı 3 ekim  2023 salı seklinde yazdırın

        System.out.println(ldt.getDayOfMonth() + " "
                            + ldt.getMonth() + " "
                            + ldt.getYear() + " "
                            + ldt.getDayOfWeek());
        // 3 OCTOBER 2023 TUESDAY
        // 03 Ock 203 Tue


    }
}
