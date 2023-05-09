package HomeWork.Lesson25_HomeWork;

public class Test5 {
    public static void main(String[] args) {
        L2 l2 = new L2();
        l2.abc();
        l2.def();
    }
}
interface I1{
    void abc();
    default void def(){
        System.out.println("This is DEF");
    }
}
interface I4{
    static  void abc(){
        System.out.println("static abc");
    }
}
class L2 implements I1,I4{

    @Override
    public void abc() {
        System.out.println("abc");
    }

    public static void main(String[] args) {
        L2 l2 = new L2();
        l2.abc();
        l2.def();
        I4.abc();
    }
}
