package DateTime29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test2 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2023,06,07);
        System.out.println(ld1);

        LocalDate ld2 = ld1.plusDays(3);
        ld1 = ld1.plusDays(25);
        ld1 = ld1.plusWeeks(3);
        System.out.println(ld1);
        System.out.println("------------");

        LocalTime lt1 = LocalTime.of(20,23,36);
        System.out.println(lt1);
        lt1 = lt1.plusHours(4);
        System.out.println(lt1);

        LocalDateTime ldt1 = LocalDateTime.now();
        ldt1 = ldt1.plusDays(3).plusHours(5).plusWeeks(2);
        System.out.println(ldt1);
    }
}
