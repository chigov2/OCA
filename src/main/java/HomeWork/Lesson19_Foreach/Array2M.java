package HomeWork.Lesson19_Foreach;

public class Array2M {
    public static void main(String[] args) {
        int[][] array = {{3,7,8},{4,5},{9,4,4,6,8,3}};

        for (int[] array2: array){
            for (int array3: array2){
                System.out.print(array3 + " ");
            }

        }
    }


}
