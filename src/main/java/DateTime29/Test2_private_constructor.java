package DateTime29;

public class Test2_private_constructor {
    public static void main(String[] args) {
        Car car = Car.createCar();
    }
}

class Car{
    private Car(){ }
    static Car createCar(){
        return new Car();
    }
}
