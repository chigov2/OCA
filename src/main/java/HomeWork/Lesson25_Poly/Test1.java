package HomeWork.Lesson25_Poly;

public class Test1 {
    public static void main(String[] args) {
//        Driver[] drivers = {new Driver(),new Driver()};
//        Employee[] employees = {new Driver(),new Driver(),new Doctor(), new Teacher()};
//        Help_able[] helpAbles = {new Driver(),new Driver(),new Doctor(), new Teacher()};


        Employee teacher = new Teacher();
        Employee driver = new Driver();
        Employee doctor = new Doctor();

        Employee[] employees = {teacher,driver,doctor};
        for (Employee employee: employees){
            employee.work();
        }
        System.out.println(teacher instanceof Driver);
        System.out.println(null instanceof String);
//        teacher.work();
//        driver.work();
//        doctor.work();
//        Help_able teacher1 = new Teacher();
//        teacher1.help();
//        teacher.help();
//        driver.help();
//        doctor.help();
    }
}

abstract class Employee {
    void sleep(){
        System.out.println("Worker sleeps");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Teacher works");
    }
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}
class Driver extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}
class Doctor extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}
interface Help_able{
    void help();
}

