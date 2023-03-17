package HomeWork;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;

//    Employee(int employeeId,String employeeSurname,int employeeAge,float employeeSalary){
//        id = employeeId;
//        surname = employeeSurname;
//        age = employeeAge;
//        salary = employeeSalary;
//    }

    Employee(int id1){
        id =id1;
    }
    public Employee(String surname1){
        surname = surname1;
    }

    private Employee(float salary1){
        salary = salary1;
    }

    float doubleSalary(float salary){
        salary *=2;
        System.out.println(salary);
        return salary;
    }

    public void getId(){
        System.out.println("id = " + id);
    }

    public void getSurname(){
        System.out.println("Surname = " + surname);
    }
    public void getSalary(){
        System.out.println("Salary = " + salary);
    }
}
//class newEmployee{
//    public static void main(String[] args) {
//        Employee employee1 = new Employee(25,"Mikee2",48,4500f);
//        Employee employee2 = new Employee(28,"Mikee25",49,6500f);
//        employee1.doubleSalary(employee1.salary);
//        employee2.doubleSalary(employee2.salary);
//
//    }


//class NewEmployee{
//    public static void main(String[] args) {
//        Employee newEmployee = new Employee(2,"Mike",50,8000f);
//        newEmployee.getId();
//        newEmployee.getSurname();
//        newEmployee.getSalary();
//    }

