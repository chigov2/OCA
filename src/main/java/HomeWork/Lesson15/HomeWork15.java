package HomeWork.Lesson15;

public class HomeWork15 {
    static void vremya(){
        int chas = 0;
        OUTER:
        while(chas <6){
            int minute = 0;
            MIDDLE:
            do {
                int secunda = 0;
                INNER:
                while (secunda < 60){
                    System.out.println(chas + " : "+ minute + " : " +secunda);
                    secunda++;

                }
                minute++;
            }while(minute <= 59);
            chas++;
        }
//        OUTER:
//        for (int chas = 0; chas <6; chas++)
//            MIDDLE:
//                    for (int minuta=0; minuta <30; minuta++){
//                        if (chas >= 1 ){//&& minuta % 10 ==0 always true
//                            break OUTER;
//                        }
//                        INNER:
//                        for (int secunda = 0; secunda < 60; secunda++){
//                            if (secunda * chas > minuta){
//                                continue MIDDLE;
//                            }
//                            System.out.println(chas + " : "+ minuta + " : "+ secunda );
//                        }
//                    }
    }

    public static void main(String[] args) {
        vremya();
    }


}
