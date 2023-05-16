package HomeWork.Lesson26_Equels;

public class Test6 {
    int a=2;
    Test6(){
        a = 4;
    }
    { a = 5;}
//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A{
    final static int b;
    static{b=10;}
}

class B{
    static int c;
    final static int d;
    final static int e = 1;
    final static int f;
    static {
        c = 5;
        d = 3;
//        e = 2;
        f = 7;
    }
}
class C{
    String s = "OK";
    {System.out.println(s);}
    static int i = 0;
    static {System.out.println(i);}
    //static before
    {i = i+1; System.out.println(i);}
    C(){
        System.out.println("This is constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        C c = new C();
    }
}

class D{//1.18
    static{abc(2);}
    static void abc(int a){System.out.println(a + " b");}
    D(){abc(5);}
    static {abc(4);}
    {abc(6);}
    static {new D();}
    {abc(8);}
    public static void main(String[] args) { }

}
