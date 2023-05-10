package HomeWork.Lesson25_HomeWork.Homework;

import HomeWork.Employee;

abstract public class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    abstract void eat();
    abstract void sleep();

    public static void main(String[] args) {
        Fish fish = new Mechenosec("Fish array Lucky") {
            @Override
            void swim() {System.out.println("override fish swim");}
            @Override
            void eat() {System.out.println("override fish eat");}
        };
        Animal bird = new Bird("Sweety") {
            @Override
            void fly() {
                System.out.println("Bird Sweety flies");
            }
            @Override
            void eat() {}
            @Override
            void sleep() {}
        };
        Animal mammal = new Lion("Human") {
            @Override
            void run() {System.out.println("Mammal run");}
            @Override
            void eat() {}
            @Override
            void sleep() {}
        };
        Animal mechenosec = new Fish("Mechenosec array Fish") {
            @Override
            void eat() {System.out.println("Mechenosec array eat ");}
            @Override
            void sleep() {System.out.println("Mechenosec array speak");}

            @Override
            void swim() {

            }
        };
        Bird pingvin = new Pingvin("Pingvin") {
            @Override
            void fly() {

            }

            @Override
            void eat() {

            }

            @Override
            void sleep() {

            }


        };
        Lion lion = new Lion("Lion2") {
            @Override
            void eat() {}
            @Override
            void sleep() {}
        };

        Speakable bird_S = new Bird("Lion speakable") {
            @Override
            void fly() {System.out.println("4");}
            @Override
            void eat() {System.out.println("5");}
            @Override
            void sleep() {System.out.println("6");}
            @Override
            public void speak() {

                System.out.println("77");
            }
        };

        Speakable mammal_S = new Mammal("Mammal speakable") {
            @Override
            void run() {
                System.out.println("1");
            }
            @Override
            void eat() {
                System.out.println("2");
            }
            @Override
            void sleep() {
                System.out.println("3");
            }
        };


        Speakable [] animals_s = {bird_S,mammal_S,pingvin,lion,fish};
        Animal [] animals = {fish,bird,mammal,mechenosec,pingvin,lion};


//            for (Animal a: animals){
//                    if (a instanceof Fish){((Fish) a).swim();}
//                    if (a instanceof Bird){((Bird) a).fly();}
//                    if (a instanceof Mammal){((Mammal) a).run();}
//
//                }

            for (Speakable s: animals_s){
                if (s instanceof Bird){
                    ((Bird) s).fly();
                    ((Bird) s).eat();
                    ((Bird) s).sleep();
                    ((Bird) s).speak();

                        }

                    if (s instanceof Mammal){
                        ((Mammal) s).run();
                        ((Mammal) s).eat();
                        ((Mammal) s).sleep();
                    }
                }
            }


//        Mechenosec mechenosec = new Mechenosec("mechenosec1");
//        System.out.println(mechenosec.name);
//        mechenosec.eat();
//        mechenosec.swim();
//        mechenosec.sleep();
//        Speakable pingvin = new Pingvin("Pingvin1");
//        pingvin.speak();
//        Animal lion = new Lion("Lion1");
//        System.out.println(lion.name);
//        lion.eat();
//        lion.sleep();
//        Mammal lion1 = new Lion("Lion_Mammal");
//        System.out.println(lion1.name);
//        lion1.run();
//        lion1.eat();
//        lion1.sleep();
//        lion1.speak();
    }


abstract class Fish extends Animal implements Speakable{
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
        System.out.println(name + " sings");
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
        System.out.println("lions run fast");}
    @Override
    void eat() {System.out.println("Lions eats other animals");}
    @Override
    void sleep() {System.out.println("Lions sleeps");}

}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    };
}
