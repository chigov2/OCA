package HomeWork.Lesson19_Foreach;

public class DynamicInit {
    public static void main(String[] args) {

        int[] array = new int[4];
//        for (int i = 0; i < array.length; i++){
//            array[i] = i+3;
//        }

        for (int a: array){
            a= a +2;
        }

        for (int a: array){
            System.out.print(a + " ");
        }

    }
}
