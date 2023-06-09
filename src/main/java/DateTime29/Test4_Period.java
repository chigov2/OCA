package DateTime29;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4_Period {
//    static void Learning(LocalDate begin, LocalDate stop){
//        LocalDate data = begin;
//        while(data.isBefore(stop))
//        {
//            System.out.println("Наступила дата "+ data+". Пора менять дежурного");
//            data = data.plusMonths(1);
//        }
//    }

    static void Learning(LocalDate begin, LocalDate stop, Period p){
        LocalDate data = begin;
        while(data.isBefore(stop))
        {
            System.out.println("Наступила дата "+ data+". Пора менять дежурного");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate begin = LocalDate.of(2022, Month.SEPTEMBER,1);
        LocalDate stop = LocalDate.of(2023, Month.MAY,31);
//        Period p = Period.ofWeeks(1);
        Period p = Period.ofDays(15);
        Learning(begin,stop,p);
    }
}
