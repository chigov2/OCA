package Lesson4;

public class Car {
    Car(String color, String motor){
        color1 = color;
        motor1 = motor;
    }
    String color1;
    String motor1;

}

class Car1{
    public static void main(String[] args) {
        Car car1 = new Car("color2","motor2");
        System.out.println(car1.color1);
        System.out.println(car1.motor1);
    }
}
