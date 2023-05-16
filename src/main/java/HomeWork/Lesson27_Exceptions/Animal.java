package HomeWork.Lesson27_Exceptions;

public class Animal {
    int a = 5;
    static int b =10;
    void abc(){System.out.println("Non static method class animal");}
    static void def(){System.out.println("Static method from class animal");}
}

class Tiger extends Animal{
    int a = 15;
    static int b =20;
    void abc(){System.out.println("Non static method class tiger");}
    static void def(){System.out.println("Static method from class tiger");}
}

class Test1{
    public static void main(String[] args) {
        Animal animal = new Tiger();
        System.out.println(animal.a);
        System.out.println(animal.b);
        animal.abc();
        animal.def();
    }
}
