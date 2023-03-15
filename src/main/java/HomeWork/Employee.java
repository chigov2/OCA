package HomeWork;

public class Employee {
    int id;
    String surname;
    int age;
    float salary;

    Employee(int employeeId,String employeeSurname,int employeeAge,float employeeSalary){
        id = employeeId;
        surname = employeeSurname;
        age = employeeAge;
        salary = employeeSalary;
    }

    float doubleSalary(float salary){
        salary *=2;
        System.out.println(salary);
        return salary;
    }
}
class newEmployee{
    public static void main(String[] args) {
        Employee employee1 = new Employee(25,"Mikee2",48,4500f);
        Employee employee2 = new Employee(28,"Mikee25",49,6500f);
        employee1.doubleSalary(employee1.salary);
        employee2.doubleSalary(employee2.salary);

    }

}
