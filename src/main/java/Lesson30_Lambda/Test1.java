package Lesson30_Lambda;

import java.util.ArrayList;

public class Test1 {
}
class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name,char sex,int age, int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo{
    void printStudent(Student student){
        System.out.println("Student name: " + student.name + ", Student sex: " + student.sex + ", " +
                "age: " + student.age+ ", course: " + student.course + ", Average grade: " +student.avgGrade );
    }
    void printStudentsOverGrade(ArrayList<Student> studentArrayList, double avgGrade){
        for (Student s: studentArrayList){
            if (s.avgGrade > avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentsUnderGrade(ArrayList<Student> studentArrayList, double avgGrade){
        for (Student s: studentArrayList){
            if (s.avgGrade < avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> studentArrayList, int age){
        for (Student s: studentArrayList){
            if (s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentsOverAge(ArrayList<Student> studentArrayList, int age){
        for (Student s: studentArrayList){
            if (s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentsBySex(ArrayList<Student> studentArrayList, char sex){
        for (Student s: studentArrayList){
            if (s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentsMixedCondition(ArrayList<Student> studentArrayList, double avgGrade, int age, char sex){
        for (Student s: studentArrayList){
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student("Mike",'m',50,5,7.3);
        Student student2 = new Student("Lena",'f',35,3,8.3);
        Student student3 = new Student("Max",'m',18,2,6.3);
        Student student4 = new Student("Alex",'m',25,4,9.3);
        Student student5 = new Student("Ganna",'f',30,4,7.8);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        StudentInfo s1 = new StudentInfo();

        s1.printStudentsOverGrade(studentArrayList,8.2);
        System.out.println("--------------------------");
        s1.printStudentsBySex(studentArrayList,'m');
        System.out.println("--------------------------");
        s1.printStudentsOverAge(studentArrayList,20);
        System.out.println("--------------------------");
        s1.printStudentsMixedCondition(studentArrayList,6,25,'m');
    }
}

