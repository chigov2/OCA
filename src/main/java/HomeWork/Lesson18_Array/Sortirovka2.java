package HomeWork.Lesson18_Array;

import java.util.Random;

public class Sortirovka2 {
    public static int[] sorti2(int[] array) {

        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayNew = new int[20];
        for (int i =0; i < arrayNew.length; i++){
            arrayNew[i] = i + random.nextInt()%15;
            System.out.print(arrayNew[i] + "  ");
        }
        System.out.println();
        System.out.println();
        sorti2(arrayNew);
        for (int i =0; i < arrayNew.length; i++){
            System.out.print(arrayNew[i] + "  ");
        }
    }
}
