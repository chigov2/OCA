package HomeWork.Lesson27_Exceptions;

public class Test5_Error {
    static public void abc1(){
        System.out.println("abc method is working");
//        abc1();
    }

    public static void main(String[] args) {
        try {
            Test5_Error.abc1();
        } catch (StackOverflowError e) {
            e.printStackTrace();
            System.out.println("hello");
        }

    }
}
