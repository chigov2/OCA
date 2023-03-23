package HomeWork.Lesson10.p4;

import HomeWork.Lesson10.p1.*;
import HomeWork.Lesson10.p1.p2.*;
import HomeWork.Lesson10.p1.p2.p3.*;
import HomeWork.Lesson10.p4.p5.*;
import static HomeWork.Lesson10.p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        C c1 = new C();
        System.out.println(c1.c_class);

        A a1 = new A();
        a1.showInfoA1();

        E e1 = new E();
        e1.showInfoE();
        System.out.println(e1.e_class);

        B b1 = new B();
        b1.showInfoB();
    }
}
