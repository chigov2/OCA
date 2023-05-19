package HomeWork.Lesson27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    FileInputStream fis1,fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test91.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file test10 not found fis2 ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test9 not found fis1 ");
        } finally {
            System.out.println("finally external fis1 test9.txt");
            try {
                fis1.close();
                fis2.close();//nullPointerException
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("catch to close fis1 fis2");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
