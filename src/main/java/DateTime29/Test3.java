package DateTime29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(20,23,36);
        System.out.println(lt1);

        LocalDate ld1 = LocalDate.of(2023,06,07);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2025,04,15);
        System.out.println(ld2);

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2025, Month.APRIL,25,15,25);
        ldt1 = ldt1.plusDays(3).plusHours(5).plusWeeks(2);

        System.out.println(ldt1.isBefore(ldt2));
    }
}
