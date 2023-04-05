package HomeWork.Lesson15;

public class Test6Time {
    public static void main(String[] args) {
        int chas = -1;

        OUTER:
        do {
            chas++;
            int minuta = 0;

            INNER:
            while (minuta < 60){
                if (minuta == 30){
                    continue OUTER;
                }
                System.out.println(chas + " : "+ minuta);
                minuta++;
            }
            System.out.println("next chas");
            //chas++;
        }while (chas < 24);
    }
}
