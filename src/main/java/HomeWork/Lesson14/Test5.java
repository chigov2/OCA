package HomeWork.Lesson14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20;i++){
            if (i % 2 == 0) {
                if (i == 16 || i == 12) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
