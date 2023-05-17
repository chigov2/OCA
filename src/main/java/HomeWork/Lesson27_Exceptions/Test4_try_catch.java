package HomeWork.Lesson27_Exceptions;

public class Test4_try_catch {
    public static void main(String[] args) {
        int [] array = {1,4,6};
        try {
            System.out.println(array[21]);
        } catch (Exception error) {System.out.println("exception");
        }
        System.out.println("ok");

    }
}
