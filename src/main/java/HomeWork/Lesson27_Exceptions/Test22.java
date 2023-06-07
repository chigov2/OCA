package HomeWork.Lesson27_Exceptions;

public class Test22 {
    void abc (){
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test22 t2 = new Test22();
        try {
            t2.abc();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
