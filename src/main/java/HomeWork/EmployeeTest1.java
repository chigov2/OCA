package HomeWork;

public class EmployeeTest1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(6);
        Employee emp2 = new Employee("Stoba1");
        //Employee emp3 = new Employee(5000.5);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);
        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();
        emp2.getId();
        emp2.getSurname();
        emp2.getSalary();

    }

}
