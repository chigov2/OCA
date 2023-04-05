package HomeWork.Lesson15;

public class Test5Time {
    public static void main(String[] args) {

        for (int chas = 0; chas < 24; chas++){
            int minuta = 0;
            while (minuta < 60){
                System.out.println(chas + " : " +minuta);
                minuta++;
            }
        }
    }
}
