package HomeWork.Lesson27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8_StringBuilder {

    static StringBuilder a = new StringBuilder("privet");
    static StringBuilder abc (){
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);}
        catch (FileNotFoundException e) {
            a.append("!!!");
            System.out.println("exception " + a);
            return a;
        }finally {
            System.out.println("finally " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
