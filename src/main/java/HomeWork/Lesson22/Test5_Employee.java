package HomeWork.Lesson22;

public class Test5_Employee {
    void encreeseZP(Employee employee){
        employee.salary = employee.salary + 100;
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.age = 32;
        doctor.name = "Mike";
        System.out.print(doctor.age + " " + doctor.name  + " ");
        doctor.heel();

        Teacher teacher = new Teacher();
        teacher.age = 35;

        Dantist dantist = new Dantist();
        dantist.age = 50;
        dantist.borMashina = "AAA";
        dantist.tooth();

    }
}
class Employee{
    String name;
    String specialization;
    double salary;
    int age;
    void eat(){        System.out.println("eat");    }
    void sleep(){      System.out.println("sleep");    }
}

class Doctor extends Employee{
    int experience;
    void heel(){       System.out.println("heel");    }
}

class Teacher extends Employee{
    int countOfStudents;
    void teach(){        System.out.println("teach");    }
}

class Driver extends Employee{
    String cars;
    void drive(){        System.out.println("drive");    }

}

class Hirurg extends Doctor{
    String scalpel;
    void operaziya(){}
}
class Dantist extends Doctor{
    String borMashina;
    void tooth(){
        System.out.println("tooth");
    }
}
