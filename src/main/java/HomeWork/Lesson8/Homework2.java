package HomeWork.Lesson8;

public class Homework2 {
    public static final double PI = 3.14;

    public double square(double radius){
        double pi = PI * radius * radius;
        return  pi;
    }

    public static double dlina(double radius2){
        double dlina = 2 * PI * radius2;
        return dlina;
    }
    public void info(double radius3){
        System.out.println("Radius = " + radius3);
        System.out.println("Square = " + square(radius3));
        System.out.println("Dlina = " + dlina(radius3));
    }

}
class Zadacha2Test{
    public static void main(String[] args) {
        Homework2 staticTest8 = new Homework2();
        staticTest8.info(8);
    }
}
