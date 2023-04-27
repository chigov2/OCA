package HomeWork.Lesson22;

public class Test6_Human {
    public Test6_Human(String name) {
        this.name = name;
    }
    public Test6_Human(){}

    private String name = "Mikee";
    public static int salary = 500;
    public void work(){
        System.out.println("Work");
    }
    public static void rest(){
        System.out.println("Rest");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Student extends Test6_Human{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lenchik");
        System.out.println(student.getName());
        System.out.println(Student.salary);
        student.work();
        Student.rest();
    }
}
