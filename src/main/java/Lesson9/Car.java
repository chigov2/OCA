package Lesson9;

public class Car {
    String color;
    String engine;
    static  int count;

    Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showColor(){
        System.out.println("Car color: " + "color");
    }

    public  void changeColor(String color3){
        System.out.println("Car color is changed");
        int price = 5000;
        color = color3;
        price +=1000;
    }
}
