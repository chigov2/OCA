package HomeWork.Lesson24_interface;

public class Test3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.fire();
    }
    }

class Employee {
    String name = "Mikee";
    String specialization;
    double salary = 100;
    int age;

    void eat() {
        System.out.println("eat");
    }

    void sleep() {
        System.out.println("sleep");
    }

}

class Teacher extends Employee implements Help_able,Swim_able{
    int countOfStudents;

    void teach() {
        System.out.println("teach");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }

    @Override
    public void fire() {
        System.out.println("Teacher puts out the fire");
    }

    @Override
    public void swim() {
        System.out.println("Teacher swim");
    }
}

class Driver extends Employee implements Swim_able{
    String cars;

    void drive() {
        System.out.println("drive");
    }

    @Override
    public void swim() {
        System.out.println("Driver can swim");
    }
}

interface Help_able {
    void help();
    void fire();
}

interface Swim_able {
    void swim();
}
