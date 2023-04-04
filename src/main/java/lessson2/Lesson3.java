package lessson2;

public class Lesson3 {
    public static void main(String[] args) {
        int a =11;
        int b = 3;
        double c = 5.5;
        double d = 2.6;

        double full1 = c/d;
        double ostatok1 = c%d;


        int full = a/b;
        int ostatok = a%b;

        System.out.println(full);
        System.out.println(ostatok);
        System.out.println(full1);
        System.out.println(ostatok1);
        System.out.println("");
        System.out.printf("%.2f", full1);
        System.out.println("");
        System.out.printf("%.2f",ostatok1);
        System.out.println("");

        int x= 5;
        int y = 3;
        int c1 = x - ++y;

        System.out.println(c1);
        System.out.println(y);

    }
}
