package HomeWork.Lesson27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
    public static void main(String[] args) {
        File f = new File("test10_.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        }
//        catch (FileNotFoundException e) {
////            e.printStackTrace();
//            System.out.println("file not found");
//        }
//        catch (NullPointerException e) {
////            e.printStackTrace();
//            System.out.println("file not found1");
//        }
        catch (Exception e) {
//            e.printStackTrace();
            System.out.println("file not exception");
        }catch (Throwable e) {
//            e.printStackTrace();
            System.out.println("file not Thowable");
        }
    }
}
