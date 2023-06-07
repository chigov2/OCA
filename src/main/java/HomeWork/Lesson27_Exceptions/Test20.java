package HomeWork.Lesson27_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test20 {
    public static void main(String[] args) {
        Animal1 a = new Mouse();

    }
}

class Animal2 {
    Animal2() throws FileNotFoundException{}

}
class Mouse2 extends Animal2{

    Mouse2() throws Exception {
    }
}

class Human{
    String nmae;
    int age;
    Human(String name, int age) throws Exception {
        if (age < 0) throw new Exception("Incorrect age");
        this.age = age;
        this.nmae = name;
    }
}
