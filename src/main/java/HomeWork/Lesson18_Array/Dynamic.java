package HomeWork.Lesson18_Array;

import java.util.Random;

public class Dynamic {
    public static void main(String[] args) {
        String[] array1;
        int [][] array2;

        int [] array4 = new int[3];
        int [] array5 = new int[]{1,2,6};

        array1 = new String[3];
        array2 = new int[3][];
        for (int i = 0; i < array1.length; i++){
            array1[i] = "hello " + i;
            System.out.println(array1[i]);
        }

        array2[0] = new int[3];
        array2[1] = new int[2];
        array2[2] = new int[4];
        Random random = new Random();

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                array2[i][j] = i + j + random.nextInt()%6;
                System.out.println("array2["+ i + "][" + j + "] = " + array2[i][j] );
            }
        }

    }
}
