package HomeWork;


public class Student2 {
    String name;
    int course;
    static int count;
    int a;

    Student2(String name1, int course1){
        name = name1;
        course = course1;
        count++;
        System.out.println("Student # " + count + "is created");

    }

    public static void showCount(){
        System.out.println("Students created: " + count);
    }
    public void showInfo(){
        System.out.println("Welcome to the Student class");
    }

    void abc(){
        a++;
    }
    static void abcd(){
        count++;
        Student2 st2 = new Student2("Mikee",5);
        st2.a++;
    }
    public static void main(String[] args) {
        abcd();
        Student2 st3 = new Student2("Lena",4);
        st3.abc();

    }

}

