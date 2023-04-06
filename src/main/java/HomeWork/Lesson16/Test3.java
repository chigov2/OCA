package HomeWork.Lesson16;

public class Test3 {
//    public static void main(String[] args) {
//       int a = 5;
//        String s = "Hello";
//        String s2 = a+8;
//    }
}

class Employee{
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.isManager = isManager;
        this.salary = salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(90.5,true);
        System.out.println(emp1.isManager + " " + emp1.salary);
    }
}

