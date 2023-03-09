package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
//        System.out.println(!a);

        int c=5;
        int d = 10;
        int t = 16;
        int g = 15;
        boolean e = !(c<d);
//        System.out.println(e);

        boolean v = t>g | ++c>d;
        boolean m = t>g & ++c>d;
        System.out.println(v);
        System.out.println(c);
        System.out.println(m);
        System.out.println(c);


    }
}
