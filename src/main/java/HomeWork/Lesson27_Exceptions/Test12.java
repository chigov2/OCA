package HomeWork.Lesson27_Exceptions;

public class Test12 {
    //38min
    public void abc(){
        int[] array = {1,2,3};
        try{
            System.out.println(array[7]);
        }
        catch (ArrayIndexOutOfBoundsException error){
            String s = null;
            System.out.println(array.length);
        }
//        catch (NullPointerException error_null){
//            System.out.println("null pointer exception");
//        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }

}
