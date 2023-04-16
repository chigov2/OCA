package HomeWork.Lesson19_Foreach;

public class ForEach_Test1 {
    public static void main(String[] args) {
        String[] students = {"John","Mike","Max"};
        String[] exams = {"Math","Economy"};

        for (String student: students){
            for (String exam: exams){
                System.out.println(student + " " + exam);
            }
        }
    }

}
