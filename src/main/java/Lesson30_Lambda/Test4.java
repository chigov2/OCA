package Lesson30_Lambda;

public class Test4 {
    static void def(Test5 t){
        System.out.println(t.abc("Hello","Good bye"));
    }

    public static void main(String[] args) {
        def((t,y) -> t.length());//        def(t -> t.length());
    }
}
interface  Test5{
    int abc(String s1, String s2);
}
