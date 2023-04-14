package HomeWork.Lesson18_Array;

public class ShowArray {
    public void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length-1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length -1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String[][] arrayTest = new String[3][];
        arrayTest[0] = new String[]{"Element00", "Element01"};
        arrayTest[1] = new String[]{"Element10"};
        arrayTest[2] = new String[]{"Element20", "Element21", "Element22"};
        ShowArray showTest = new ShowArray();
        showTest.showArray(arrayTest);

    }

}
