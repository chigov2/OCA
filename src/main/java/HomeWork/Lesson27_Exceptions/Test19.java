package HomeWork.Lesson27_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        Animal1 a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception found");
        }
    }
}

class Animal1{
    void run() throws IOException {
        System.out.println("Animal runs");
    }
    void run(int a) throws Exception {
        System.out.println("Animal runs");
    }
}
class Mouse extends Animal1{
    @Override
    void run() throws IndexOutOfBoundsException, NullPointerException{
        System.out.println("Mouse runs");
    }
}
