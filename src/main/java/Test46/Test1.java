package Test46;

public class Test1 {
}
class A{
    public int a = 10;
    public void abc(){System.out.println("base non static"); }
    public static void abc2(){
        System.out.println("base static");
    }
}
class B extends A{
    public int a = 20;
    @Override
    public void abc() {System.out.println("child non static");}
    public static void abc2() {System.out.println("child static");}

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(((A)b).a);
        b.abc();
        System.out.println("---");
        ((A)b).abc();
        b.abc2();
        ((A)b).abc2();
    }
}
