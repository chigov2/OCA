package HomeWork.Lesson22;

public class Test7_Constructor {
}

class Human1 {
//    Human1(){
//        super();
//    }

    Human1(String n){
        this(n,null);
    }
    Human1(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    private String name;
    private String lastName;
}

class Students extends Human1{
//    Students(){
//        super();
//    }
    public static void main(String[] args) {
        Students s2 = new Students();
    }
}
