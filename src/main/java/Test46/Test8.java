package Test46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    static int abc(){
        try {
            FileInputStream fs = new FileInputStream("Test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Program continue");
        return 18;
    }

    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);
    }
}

