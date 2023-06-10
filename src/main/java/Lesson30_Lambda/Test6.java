package Lesson30_Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
}
class Student2{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student2(String name,char sex,int age, int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
//interface StudentChecks2{
//    boolean testStudent(Student2 s);
//}
class StudentInfo2 {
    void printStudent(Student2 student) {
        System.out.println("Student name: " + student.name + ", Student sex: " + student.sex + ", " +
                "age: " + student.age + ", course: " + student.course + ", Average grade: " + student.avgGrade);
    }
    public void testStudents2 (ArrayList<Student2> studentArrayList2, Predicate<Student2> t) {
        for (Student2 student : studentArrayList2){
            if (t.test(student)){
                printStudent(student);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student2> studentArrayList2 = new ArrayList<>();

        Student2 student1 = new Student2("Mike", 'm', 50, 5, 7.3);
        Student2 student2 = new Student2("Lena", 'f', 35, 3, 8.3);
        Student2 student3 = new Student2("Max", 'm', 18, 2, 6.3);
        Student2 student4 = new Student2("Alex", 'm', 25, 4, 9.3);
        Student2 student5 = new Student2("Ganna", 'f', 30, 4, 7.8);
        studentArrayList2.add(student1);
        studentArrayList2.add(student2);
        studentArrayList2.add(student3);
        studentArrayList2.add(student4);
        studentArrayList2.add(student5);

        StudentInfo2 s1 = new StudentInfo2();

        System.out.println("--------lambda------------------");
        s1.testStudents2(studentArrayList2,(Student2 st) -> {return st.avgGrade > 7.5;});
        System.out.println("--------boolean------------------");
        s1.testStudents2(studentArrayList2,(Student2 st) -> {return st.age > 25;});
        System.out.println("--------boolean------------------");
        s1.testStudents2(studentArrayList2,(Student2 st) -> {return st.age > 25 && st.sex =='m';});
        System.out.println("--------boolean------------------");
        s1.testStudents2(studentArrayList2,(Student2 st) -> {return st.name.equals("Alex");});
        System.out.println("--------boolean------------------");

        System.out.println("--------predicate remove if 1------------------");
        for (Student2 s : studentArrayList2){
            System.out.println(s.name);
        }
        System.out.println("--------predicate remove if delete------------------");
        studentArrayList2.removeIf(student -> student.name.endsWith("a"));
        System.out.println("--------predicate remove if delete adter deleting------------------");
        for (Student2 s : studentArrayList2){
            System.out.println(s.name);
        }

    }
}
