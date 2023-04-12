package HomeWork.Lesson18_Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array1;
        String[] array2;
        int [][] array10;
        int [][] array9;
        int [] array5;

        array1 = new int[8];
        array2 = new String[3];
        array10 = new int[3][];     //{ {-5,2,0,-1}}, {4}, {7,3,-2,5,3} }
        System.out.println(array10.length);
        array5 = new int[2];
        array9 = new int[4][2];

        array5[0] = 1;
        array5[1] = 2;

        array9[0][0] = 5;
        array9[2][1] = 6;
        array9[1] = array5;
        System.out.println("array9[1][0] = "+ array9[1][0]);
        System.out.println("array9[1][1] = "+ array9[1][1]);


        array2[0] = "privet";
        array2[1] = "privet";
        array2[2] = "Hello";








    }


}
