package HomeWork.Lesson18_Array;

import java.util.Arrays;
import java.util.Random;

public class Sortirovka {
    static Random random = new Random();

    public static void sorti(int[] array){

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args) {
//        Sortirovka sort = new Sortirovka();
//        sort.sorti(new int[]{1,4,-8,45,13,-7});

//        sorti(new int[]{1,4,-8,45,13,-7});


        int[] arrayNew = new int[20];
        for (int i =0; i < arrayNew.length; i++){
            arrayNew[i] = i + random.nextInt()%15;
            System.out.print(arrayNew[i] + "  ");
        }
        System.out.println();

        sorti(arrayNew);

    }
}
