package HomeWork.Lesson19_Foreach;

public class Test9 {
    public static void main(String[] args) {
        int[] array1 = {3,89,6,3,3,1};
        int[] array2 = {9,5,3,2,8,69,8,7,8};

        for (int i = 0; i < array1.length && i < array2.length; i++){
            array1[i] = 12;
            array2[i] = 3;
        }

        for (int i = 0;i < array1.length && i < array2.length; i++ ){
            System.out.print(array1[i] + " ");

            System.out.print(array2[i] + " ");
        }
    }
}
