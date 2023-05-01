package HomeWork.Lesson23;

public class Test3_Overriding {
    public static void main(String[] args) {
        Employee3 emp3 = new Employee3();
        Teacher4 t3 = new Teacher4();
        t3.eat();
        emp3.eat();
        System.out.println("-----");
        Employee3 emp4 = new Teacher4();
        emp4.eat();

    }
}

class Food{}
class Fruits extends Food{}

class Employee3 {
    String name;
    String experience;
    double salary = 100;
    int age;
    Food eat() {
        System.out.println("eat Employee");
        Food food = new Food();
        return food;
    }
    void sleep() {
        System.out.println("sleep");
    }
}

class Teacher4 extends Employee3 {
    int countOfStudents;

    void teach() {
        System.out.println("teach");
    }
    Food eat() {
//  Fruits eat() {
        System.out.println("eat Teacher");
        Fruits fruits = new Fruits();
        return fruits;
    }
}
