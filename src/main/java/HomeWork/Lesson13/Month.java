package HomeWork.Lesson13;

public class Month {

    public static void dayInMonth(int month){
        switch (month){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28"); break;

            default:
                System.out.println("30--");

        }
    }

    public static void main(String[] args) {
//        int month = 1;
        Month.dayInMonth(1);
        Month.dayInMonth(2);
    }
}
