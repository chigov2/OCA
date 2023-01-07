package HomeWork;

public class Lesson2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xc;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        short s1 = -1300;
        short s2 = 0b11111111111111111111101011101100;
        short s3 = 037777775354;
        short s4 = 0xFFFFFAEC;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0;
        int i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

        long l1 = 123456789;
        long l2 = 0b0111010110111100110100010101;
        long l3 = 0726746425;
        long l4 = 0x75BCD15;

        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

        float f1 = 123.5f;
        float f2 = 124.5f;
        System.out.println(f1 + " " + f2);
        double d1 = 32.5;
        double d2 = 62.5;
        System.out.println(d1 + " " + d2);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 + " " + bool2);

        char c1 = 't';
        char c2 = 'T';
        char c3 = 1000;
        char c4 = '\u03E8';
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);



    }


}
