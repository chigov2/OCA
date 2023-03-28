package HomeWork.Lesson12;


import HomeWork.Lesson11.Student;

public class StudentTest {
    public static void method1(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.grade == st2.grade && st1.course == st2.course){
            System.out.println("Students are the same");
        } else{
            System.out.println("Students are not the same");
        }
    }
    public static void method2(Student st1, Student st2){
        if (st1.name.equals(st2.name)) {

            if (st1.course == st2.course) {

                if (st1.grade == st2.grade) {
                    System.out.println("Students are the same");
                } else {
                    System.out.println("grade are not equal");
                }
            } else {
                System.out.println("Course is not equal");
            }
        } else {
            System.out.println("Name not correct");
        }
    }



    public static void main(String[] args) {
        Student st1 = new Student("Mike",3,4.5);
        Student st2 = new Student("Mike",3,4.5);
//        method1(st1,st2);
        method2(st1,st2);
    }

}
