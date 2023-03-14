package HomeWork;

public class Homework3 {
    public static void main(String[] args) {
        int i1=5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        double result2 = 0;
        double w = 1.2;
        int e = 3;
        double result3 = 0;
        int result4 = 0;

        result  = i2/d1 + d2%i1 - l;
        result2 = d2%i1;
        result3 = w%e;
//        System.out.println(result3);
        int a = 5;
        result4 = a-- - --a + ++a + a++ + a;
        //        5   -   3 + 4   + 4  +5
        System.out.println(result4);

    }


}
