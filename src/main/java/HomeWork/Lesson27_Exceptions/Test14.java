package HomeWork.Lesson27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test14 {
    //49 min
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("file test9 does exist and found");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Stream problem fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test9 not found");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception works");
        }
    }
}
