package HomeWork.Lesson25_HomeWork.Homework;

abstract public class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    abstract void eat();
    abstract void sleep();

    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("mechenosec1");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        Speakable pingvin = new Pingvin("Pingvin1");
        pingvin.speak();
        Animal lion = new Lion("Lion1");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();
        Mammal lion1 = new Lion("Lion_Mammal");
        System.out.println(lion1.name);
        lion1.run();
        lion1.eat();
        lion1.sleep();
        lion1.speak();
    }
}

abstract class Fish extends Animal{
        Fish(String name){
        super(name);//передается значение в супер класс
        this.name = name;
    }
    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюжать как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{

    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
        Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}

class Mechenosec extends Fish{
    Mechenosec(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void swim() {
        System.out.println("Меченосец быстро плавает");
    }
    @Override
    void eat() {
        System.out.println("Меченосец не хищник");
    }
}

class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }

    @Override
    void fly() {System.out.println("Pingvin can not fly");}

    @Override
    void eat() {System.out.println("Pingvin eats fish");}

    @Override
    void sleep() {
        System.out.println("Pingvis sleeps...");
    }

    @Override
    public void speak() {
        System.out.println("Pingvins can not sing");
    }
}

class Lion extends  Mammal{
    Lion(String name){
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("lions run fast");
    }
    @Override
    void eat() {System.out.println("Lions eats other animals");    }

    @Override
    void sleep() {System.out.println("Lions sleeps");  }

}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    };
}
