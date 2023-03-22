package Lesson4;

public class Car {
    String color;
    String motor;

    Car(String color, String motor){
        this.color = color;
        this.motor = motor;
    }


}

class Car1{
    public static void main(String[] args) {
        Car car1 = new Car("color2","motor2");
        System.out.println(car1.color);
        System.out.println(car1.motor);
    }
}
