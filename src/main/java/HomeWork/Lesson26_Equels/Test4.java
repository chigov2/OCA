package HomeWork.Lesson26_Equels;

public class Test4 {
//    static void abc(String s){System.out.println("a");}
    static void abc(String s1, String s2){System.out.println("D");}
//    static void abc(String ...s){System.out.println("b");}
    static void abc(Object s){System.out.println("C");}

    public static void main(String[] args) {
        Test4 t = new Test4();
//        t.abc("one", "two","three");
        t.abc("one", "two");
//        t.abc(new StringBuilder("test"));
    }

}
