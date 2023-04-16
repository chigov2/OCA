package HomeWork.Lesson19_Foreach;

public class ChangingElementsStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Mike");
        StringBuilder sb2 = new StringBuilder("Lena");
        StringBuilder sb3 = new StringBuilder("Max");
        StringBuilder[] array = {sb1,sb2,sb3};

        for(StringBuilder sb: array){
            sb.append(" Java");
        }

        for (StringBuilder b: array){
            System.out.print(b + " ");
        }
    }

}
