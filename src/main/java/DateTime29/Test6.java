package DateTime29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.SEPTEMBER,1);
        LocalDateTime ldt2 = LocalDateTime.of(2025, Month.APRIL,25,15,25);
        LocalTime lt1 = LocalTime.of(20,23,36);
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortFormat3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("d MMMM, yyyy г. hh:mm");
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate data1 = LocalDate.parse("01 02 2023", f1);


        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt2.getDayOfWeek());
        System.out.println(ldt2.getDayOfMonth());
        System.out.println(ldt2.getDayOfYear());
        System.out.println(ldt2.getMonthValue());
        System.out.println("--------------");
        System.out.println(lt1.getHour());
        System.out.println(lt1.getMinute());
        System.out.println(lt1.getSecond());
        System.out.println("--------------");
        DateTimeFormatter d1 = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(ld.format(d1));
        System.out.println("--------------");
        System.out.println(ld.format(shortFormat));
        System.out.println(ldt2.format(shortFormat));
        System.out.println(lt1.format(shortFormat2));
        System.out.println(ldt2.format(shortFormat3));
        System.out.println(shortFormat3.format(ldt2));
        System.out.println("--------------");
        System.out.println(ldt2);
        System.out.println(ldt2.format(f));
        System.out.println("--------------");
        System.out.println(data1);



    }
}
