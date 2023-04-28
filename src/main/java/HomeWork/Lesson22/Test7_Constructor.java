package HomeWork.Lesson22;

public class Test7_Constructor {
}

class Human1 {
    private String name;
    private String lastName;
    Human1(String n){
        this(n,null);
    }
    Human1(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

}
//01-17-40
class Students extends Human1{
    Students(){
        this(5);
        System.out.println("Hello");
    }
    Students(int i){
        super("Mikee");

    }

    public static void main(String[] args) {
        Students s2 = new Students();
    }
}
