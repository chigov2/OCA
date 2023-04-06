package HomeWork.Lesson16;

public class Car {
    String color;
    String motor;
    Car(String color, String motor){
        this.color = color;
        this.motor = motor;
    }

    public static Car abc (String color){
        Car newCar = new Car(color,"V6");
        newCar.color = color;
        return newCar;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red","v2");
        Car car2 = car1.abc("blue");
        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
class CarTest{
    public static void main(String[] args) {
        Car car3 = new Car("green","V1");
        Car car4 = car3.abc("white");
        System.out.println(car3.color);
        System.out.println(car3.motor);
        System.out.println(car4.color);
        System.out.println(car4.motor);

    }


}


