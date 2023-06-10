package Lesson30_Lambda;

import java.util.ArrayList;

public class Test3_Lambda {
}

class Student1{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student1(String name,char sex,int age, int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
interface StudentChecks{
    boolean testStudent(Student1 s);
}
class StudentInfo1 {
    void printStudent(Student1 student) {
        System.out.println("Student name: " + student.name + ", Student sex: " + student.sex + ", " +
                "age: " + student.age + ", course: " + student.course + ", Average grade: " + student.avgGrade);
    }
    public void testStudents (ArrayList<Student1> studentArrayList, StudentChecks studentChecks) {
        for (Student1 student : studentArrayList){
            if (studentChecks.testStudent(student)){
                printStudent(student);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student1> studentArrayList1 = new ArrayList<>();

        Student1 student1 = new Student1("Mike", 'm', 50, 5, 7.3);
        Student1 student2 = new Student1("Lena", 'f', 35, 3, 8.3);
        Student1 student3 = new Student1("Max", 'm', 18, 2, 6.3);
        Student1 student4 = new Student1("Alex", 'm', 25, 4, 9.3);
        Student1 student5 = new Student1("Ganna", 'f', 30, 4, 7.8);
        studentArrayList1.add(student1);
        studentArrayList1.add(student2);
        studentArrayList1.add(student3);
        studentArrayList1.add(student4);
        studentArrayList1.add(student5);

        StudentInfo1 s1 = new StudentInfo1();

        System.out.println("--------lambda------------------");
        s1.testStudents(studentArrayList1,(Student1 st) -> {return st.avgGrade > 7.5;});
        System.out.println("--------boolean------------------");
        s1.testStudents(studentArrayList1,(Student1 st) -> {return st.age > 25;});
        System.out.println("--------boolean------------------");
        s1.testStudents(studentArrayList1,(Student1 st) -> {return st.age > 25 && st.sex =='m';});
        System.out.println("--------boolean------------------");
        s1.testStudents(studentArrayList1,(Student1 st) -> {return st.name.equals("Alex");});
        System.out.println("--------boolean------------------");


    }
}



