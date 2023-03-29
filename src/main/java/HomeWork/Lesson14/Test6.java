package HomeWork.Lesson14;

public class Test6 {

    public void time(){
        OUTER: for (int hour = 0; hour < 24; hour++){
            System.out.println("Start of outer loop");
            INNER: for(int minute = 0; minute <60; minute++){
                if (minute == 20){continue OUTER; }
                System.out.println(hour + " : " + minute);
                if (minute == 30){break OUTER;}
            }
            System.out.println("End of outer loop");
        }
    }

    public static void main(String[] args) {
        Test6 timer = new Test6();
        timer.time();
    }
}
