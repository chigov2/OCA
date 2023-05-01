package HomeWork.Lesson22.DZ;

public class DZ22 {
}
class Animal{
    Animal(){
        System.out.println("I am animal");
    }

    int eyes;
    public void eat(){
        System.out.println("Animals eats");
    }
    public void drink(){
        System.out.println("Animals drinks");
    }
}

class Pet extends Animal{
    String name;
    int tail = 1;
    int paw = 4;
    Pet(){
        System.out.println("A am pet");
        eyes = 2;
    }
    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jump");
    }
}
class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
    Cat(String name){
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}


class Test{
    public static void main(String[] args) {

        Dog dog = new Dog("Mikee");
        System.out.println("Dog has " + dog.paw + " paws");
        Cat cat = new Cat("Alex");
        cat.sleep();
    }
}

