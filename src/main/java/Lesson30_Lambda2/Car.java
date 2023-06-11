package Lesson30_Lambda2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String model;
    String color;
    double engine;
    Car(String model, String color, double engine){
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Our car is: " + model+ ", color is: " + color + ", engine is: " + engine;
    }
}

class Test10{
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i=0; i<3; i++){
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

        public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Ford","Red",1.8));
        System.out.println("Our cars: "+ourCars);

        changeCar(ourCars.get(0),car -> {car.color = "Blue"; car.engine = 1.9; car.model = "Lada";});
            System.out.println("-----------------------");
            System.out.println("Our cars: "+ourCars);
    }
}
