package HomeWork.Lesson27_Exceptions;

public class Test12 {
    //38min
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (IndexOutOfBoundsException e) {
            String s = null;
            try {
                System.out.println(s.length());
            } catch (NullPointerException ex) {
                System.out.println("Null pointer exception caught");
            }
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }

}
