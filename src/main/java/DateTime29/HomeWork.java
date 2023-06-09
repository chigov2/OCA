package DateTime29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeWork {
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void shift(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d){
        LocalDateTime data = ldt1;
        while (data.isBefore(ldt2) || data.isEqual(ldt2)){
            System.out.println("Работаем с: " + data.format(dtf1));
            data = data.plus(p);
            System.out.println("До " + data.format(dtf1));
            System.out.println("Отдыхаес с: " + data.format(dtf2));
            data = data.plus(d);
            System.out.println("До " + data.format(dtf2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2023, Month.JUNE,3,15,00);
        LocalDateTime end = LocalDateTime.of(2023, Month.JUNE,15,15,00);
        Period p = Period.ofDays(3);
        Duration d = Duration.ofHours(8);

        HomeWork life = new HomeWork();
        life.shift(start,end,p,d);

    }
}
