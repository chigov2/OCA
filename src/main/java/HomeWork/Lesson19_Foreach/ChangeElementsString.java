package HomeWork.Lesson19_Foreach;

public class ChangeElementsString {
    public static void main(String[] args) {
        String[] array = {"John","Mike","Max"};
        for (String a: array){
            a= new String("Lenchik");
        }

        for (String b: array){
            System.out.print(b + " ");
        }
    }
}
