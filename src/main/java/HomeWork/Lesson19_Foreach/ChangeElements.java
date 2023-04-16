package HomeWork.Lesson19_Foreach;

public class ChangeElements {
    public static void main(String[] args) {
        int[] array = {2,6,9,87,62,3};
        for (int a: array){
            a=3;
        }

        for (int b: array){
            System.out.print(b + " ");
        }
    }

    //foreach нельзя поменять значения примитивных типов данных!!!!!!!
}
