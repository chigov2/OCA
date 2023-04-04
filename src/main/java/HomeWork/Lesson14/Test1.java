package HomeWork.Lesson14;

public class Test1 {


    static void vremya(){
        OUTER:
        for (int chas = 0; chas <6; chas++)
            MIDDLE:
            for (int minuta=0; minuta <60; minuta++){
                if (chas > 1 && minuta %10 ==0){
                    break OUTER;
                }
                INNER:
                for (int secunda = 0; secunda < 60; secunda++){
                    if (secunda * chas > minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas + " : "+ minuta + " : "+ secunda );
                }
            }
        }

    public static void main(String[] args) {
       vremya();
    }

    }



