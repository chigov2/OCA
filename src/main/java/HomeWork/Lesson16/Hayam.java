package HomeWork.Lesson16;

public class Hayam {
    public static void main(String[] args) {
        String s1 = "It is a long established Fact that a reader will be distracted " +
                "by the Read-able content, of a page When looking at its layout.";
        String s2 = s1.toUpperCase();

        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++){
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 !=':' && c1 !=' ' && c1 != '-'&& c1 !='.' && c1==c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
    }
}
