package Lesson9;

public class Student {
}

class StudentTeat{
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;

    }

}

class HomeWork9{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        student1 = null;
        student2 = null;
        student3 = null;
        student4 = null;
        student5 = null;
        student6 = null;
        System.out.println(student1);
        System.out.println(student7);
        System.out.println(student8);
    }
}

class Lesson9_1{
    int a =1;
    static int b =2;

    static void abc(final int a ){
        System.out.println(a);
        System.out.println(Lesson9_1.b);
    }

    public static void main(String[] args) {
        abc(8);
        abc(9);
    }
}

class Lesson9_3{
    int a =1;
    static int b =2;

    void abc(int a ){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Lesson9_3.b);
    }

    public static void main(String[] args) {
        Lesson9_3 t = new Lesson9_3();
        t.abc(4);
    }
}
class Lessonn9_4{
    public static void abc() {
        String s1 = new String("qq");
        String s2 = new String("tt");
        }

    public static void main(String[] args) {
        Lessonn9_4 q = new Lessonn9_4();
        abc();
        abc();
        String s1 = new String("test");
        abc();
    }
}