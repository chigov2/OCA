package Lesson30_Lambda.Homework_Lmbda;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ", Department: " +
                department + ", Salary: " + salary;
    }
}

class TestEmployee{
    void printEmployee(Employee employee){
        System.out.println("Employee name: " + employee.name + ", Department: " + employee.department + ", Salary: " + employee.salary);
    }
void employeeFiltration(ArrayList<Employee> employeeArrayList, Predicate<Employee> p){
    for (Employee employee : employeeArrayList){
        if (p.test(employee)){
          printEmployee(employee);
        }
    }
}


    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee employee1 = new Employee("Mike","IT", 1600);
        Employee employee2 = new Employee("Alex","HR", 450);
        Employee employee3 = new Employee("Lena","IT", 210);
        Employee employee4 = new Employee("Max","HR", 190);
        Employee employee5 = new Employee("Trading","Trading", 240);
        Employee employee6 = new Employee("Vova","IT", 800);
        Employee employee7 = new Employee("Valery","Trading", 500);
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);
        employeeArrayList.add(employee6);
        employeeArrayList.add(employee7);

//        for (Employee e: employeeArrayList){
//            System.out.println(e);
//        }
        TestEmployee employee = new TestEmployee();
        employee.employeeFiltration(employeeArrayList,(Employee e)->{return e.salary > 200 && e.department =="IT";});
        System.out.println("----------------");
        employee.employeeFiltration(employeeArrayList,(Employee e)->{return e.name.startsWith("M") && e.salary !=450;});
        System.out.println("----------------");
        employee.employeeFiltration(employeeArrayList,(Employee e)->{return e.name ==e.department;});
        System.out.println("----------------");
        System.out.println("----------------");
    }
}
