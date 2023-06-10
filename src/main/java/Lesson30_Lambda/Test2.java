package Lesson30_Lambda;

import java.util.ArrayList;

public class Test2 {
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
class StudentInfo1 {
    void printStudent(Student student) {
        System.out.println("Student name: " + student.name + ", Student sex: " + student.sex + ", " +
                "age: " + student.age + ", course: " + student.course + ", Average grade: " + student.avgGrade);
    }

    public void testStudents(ArrayList<Student> studentArrayList, StudentChecks studentChecks){
        for (Student student : studentArrayList){
            if (studentChecks.testStudent(student)){
                printStudent(student);
            }
        }
    }



    public static void main(String[] args) {
        ArrayList<Student> studentArrayList1 = new ArrayList<>();

        Student student1 = new Student("Mike", 'm', 50, 5, 7.3);
        Student student2 = new Student("Lena", 'f', 35, 3, 8.3);
        Student student3 = new Student("Max", 'm', 18, 2, 6.3);
        Student student4 = new Student("Alex", 'm', 25, 4, 9.3);
        Student student5 = new Student("Ganna", 'f', 30, 4, 7.8);
        studentArrayList1.add(student1);
        studentArrayList1.add(student2);
        studentArrayList1.add(student3);
        studentArrayList1.add(student4);
        studentArrayList1.add(student5);

        StudentInfo1 s1 = new StudentInfo1();

        System.out.println("--------boolean------------------");

        FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
        FindStudentsUnderGrade findStudentsUnderGrade = new FindStudentsUnderGrade();

        s1.testStudents(studentArrayList1,findStudentsOverGrade);
        System.out.println("--------over under------------------");
        s1.testStudents(studentArrayList1,findStudentsUnderGrade);
    }
}

interface StudentChecks{
    boolean testStudent(Student s);
}

class FindStudentsOverGrade implements StudentChecks{
    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade >7.5;
    }
}
class FindStudentsUnderGrade implements StudentChecks{
    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade <7.5;
    }
}
