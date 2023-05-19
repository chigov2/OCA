package HomeWork.Lesson27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7_finally {

    static int abc (){
        try {
            File f = new File("test101.txt");
            FileInputStream fis = new FileInputStream(f);
            return  5;

        } catch (FileNotFoundException e) {
            System.out.println("exception " + e.getMessage());
            return 6;
        }finally {
            System.out.println("finally");
//            return 7;
        }
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
