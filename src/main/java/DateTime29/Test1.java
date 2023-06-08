package DateTime29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2023,06,07);
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.of(20,23,36);
        System.out.println(lt1);
        LocalDateTime ldt1 = LocalDateTime.of(ld1,lt1);
        System.out.println(ldt1);
    }
}
