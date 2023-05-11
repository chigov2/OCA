package HomeWork.Lesson26_Equels;

class Test{
    Test(){System.out.println("super constructor");}
}

public class Test5_Initializer extends Test{
    {System.out.println("init block 1");}
    {System.out.println("init block 2");}
    {System.out.println("init block 3");}
    static {System.out.println("static block 1");}
    static {System.out.println("static block 2");}

    Test5_Initializer() {System.out.println("This is constructor1");}
    Test5_Initializer(int a) {
        this();
        System.out.println("This is constructor2");}

    public static void main(String[] args) {
//        Test5_Initializer t1 = new Test5_Initializer();
        Test5_Initializer t2 = new Test5_Initializer(5);
    }
}
