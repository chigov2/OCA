package HomeWork.Lesson21;

public class Test4 {
    public void abc(String t){
        System.out.println(t);
    }

    public StringBuilder abc(StringBuilder s){
        System.out.println(s);
        return new StringBuilder("StringBuilder");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("StringBuilderr");
    }
}
