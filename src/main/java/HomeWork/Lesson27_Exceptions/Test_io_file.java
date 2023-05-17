package HomeWork.Lesson27_Exceptions;

import java.io.*;

public class Test_io_file {
    public static void main(String[] args) throws IOException {
        File f = new File("test10.txt");
        FileOutputStream fos = new FileOutputStream(f);
        //fos.write(200);
        FileInputStream fis = new FileInputStream(f);
        fis.read();

    }
}
