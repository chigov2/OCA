package HomeWork.Lesson22;

public class Test8_super {
}

class Human8 {
    String name;
    String lastName;
    Human8(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

class Student8 extends Human8{
int i;
    Student8(String name, String lastname, int i){
        super(name,lastname);
        this.i = i;

    }

    public static void main(String[] args) {
        Student8 s8 = new Student8("Mike","Stoba",5);
        System.out.println(s8.i + " " + s8.name + " " + s8.lastName);
    }
}
