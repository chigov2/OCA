package DateTime29;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Test5_Duration {
    public static void main(String[] args) {
        LocalDate begin = LocalDate.of(2022, Month.SEPTEMBER,1);
        //does not work

        LocalTime lt1 = LocalTime.of(20,23,36);
        Duration d = Duration.ofHours(2);
//        System.out.println(begin.plus(d));//not working
        System.out.println(lt1.plus(d));
    }
}
