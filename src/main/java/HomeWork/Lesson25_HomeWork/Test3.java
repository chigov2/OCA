package HomeWork.Lesson25_HomeWork;

public class Test3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Driver driver = new Driver();
        teacher.fire(" Water");
        driver.fire(" Extinguisher");
        Help_able h = new Driver();
        Swim_able s = new Driver();
        System.out.println(h.helpFinal);
        h.fire("wood");
        h.help();
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
class Driver extends Employee implements Swim_able,Help_able{
    String cars;
    void drive() {
        System.out.println("drive");
    }
    @Override
    public void swim() {
        System.out.println("Driver can swim");
    }

    @Override
    public void help() {  System.out.println("Driver helps");
    }
    @Override
    public void fire(String predmet) {
        System.out.println("Driver puts out the fire " + predmet);
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
    public void fire(String predmet) {
        System.out.println("Teacher puts out the fire" + predmet);
    }
    @Override
    public void swim() {
        System.out.println("Teacher swim");
    }
}

interface Help_able {
    int helpFinal =10;
    void help();
    void fire(String predmet);
}

interface Swim_able {
    void swim();
}
