package HomeWork.Lesson15;

public class Test4Time {
    public static void main(String[] args) {
        int chas = 0;

        OUTER:
        do {
            int minuta = 0;

            INNER:
            while (minuta < 60){
                if (chas == 2 && minuta == 30){
                    break OUTER;
                }
                System.out.println(chas + " : "+ minuta);
                ++minuta;
            }
            System.out.println("next chas");
            chas++;
        }while (chas < 24);
    }
}
