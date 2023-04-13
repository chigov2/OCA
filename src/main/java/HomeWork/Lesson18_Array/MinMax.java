package HomeWork.Lesson18_Array;

public class MinMax {
    public static void minMax(int[] array){
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
    }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
}

    public static void main(String[] args) {
        int[] array1 = {1,4,-2,7,9,4,7};
        minMax(new int[]{1,3,5,6,7,8,9,34});
        System.out.println();
        minMax(array1);
    }
}
