package HomeWork.Lesson23;

public class Test5_Employee {

    public Object abc(){
        return new int[]{2,3,6};
    }

    public static void main(String[] args) {

        Employee emp1 = new Doctor();
        System.out.println(emp1.age);
        System.out.println(emp1.name);
        System.out.println(emp1.experience);

        emp1.sleep();
    }
}
class Employee {
    String name;
    String experience;
    double salary = 100;
    int age;


    void sleep() {
        System.out.println("sleep");
    }
}

class Doctor extends Employee {
    int experience;

    public void heel() {
        System.out.println("heel");
    }
}

class Teacher extends Employee {
    int countOfStudents;

    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee {
    String cars;
    void drive(){        System.out.println("drive");    }

}




