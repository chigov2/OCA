package HomeWork.Lesson18_Array;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] array = {8,1,5,7,2,-5};
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("-------------");
        Arrays.sort(array);
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("-------------");
        int index = Arrays.binarySearch(array,5);
        System.out.println(index);
    }
}
