package HomeWork.Lesson11;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color,String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

 class CarTest{

    void doorsCount(Car c, int a){
        c.doors = a;

    }
    void swapColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }


     public static void main(String[] args) {
        CarTest car2 = new CarTest();
        Car c1 = new Car("Red","V4",3);
         Car c2 = new Car("Blue","V8",5);
         car2.doorsCount(c1,7);
         car2.swapColor(c1,c2);

         System.out.println(c1.doors);
         System.out.println(c1.color);
         System.out.println(c2.color);

     }
}
