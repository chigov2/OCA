package HomeWork.Lesson24_interface.Homework;

abstract public class Animal {
    String name;
    Animal(String name){
        this.name=name;
        System.out.println(name);
    }
    abstract void eat();
    abstract void sleep();

//    public static void main(String[] args) {
//        Fish fish = new Fish("static main fish") {
//            @Override
//            void eat() {
//                System.out.println("Fish eat");
//            }
//
//            @Override
//            void sleep() {
//                System.out.println("Fish sleep");
//            }
//        };
//        fish.eat();
//        fish.sleep();
//    }
}

abstract class Fish extends Animal{
    String fishName;

    Fish(String fishName){
        super("Fish Mikee");
        this.fishName = fishName;
    }
    @Override
    void eat() {System.out.println("Всегда интересно наблюжать как едят рыбы");
    }
    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюжать как спят рыбы");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    String nameBird;
    Bird(String nameBird){
        super("super bird");
        this.nameBird = name;
    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(nameBird + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
    String mammalName;
    Mammal(String mammalName){
        super("super Mammal costructor");
        this.mammalName = name;
    }
    abstract void run();
}

class Mechenosec extends Fish{
    Mechenosec(String fishName) {
        super(fishName);
    }

    @Override
    void swim() {
        System.out.println("Меченосец быстро плавает");
    }

    @Override
    void eat() {
//        super.eat();
        System.out.println("Меченосец не хищник");
    }

}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    };
}
