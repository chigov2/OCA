package HomeWork.Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student st1, Student st2){
        Student st3 = st1;
        st1 = st2;
        st2 = st3;
        System.out.println(st1.name);
    }
    public static void changeName (Student s1){
        s1.name = "Vasiliy";

    }

    public static void main(String[] args) {
        Student st1 = new Student("Mike", 5, 5.2);
        Student st2 = new Student("Lena", 4, 8.2);
//        swap(st1, st2);
//        System.out.println(st1.name);
//        System.out.println(st2.name);
        changeName(st1);
        System.out.println(st1.name);
    }
}
