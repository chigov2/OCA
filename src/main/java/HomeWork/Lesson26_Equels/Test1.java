package HomeWork.Lesson26_Equels;

public class Test1 {

    public static void main(String[] args) {
        Car c1 = new Car("Red","V8");
        Car c2 = new Car("Red","V8");
        Car c3 = new Car("Black","V4");
        c3 = c2;
//        System.out.println(c1.equals(c3));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c3);
    }
}

class Car{
    String color; String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Car c2 = (Car) obj;
//        if (obj != null){//(obj instanceof Car)
//            return  (color.equals(c2.color) && engine.equals(c2.engine));
//
//        }else return false;
//    }
    @Override
    public boolean equals(Object obj) {
        boolean result;

        Car c8 = (Car) obj;
        if (obj != null){//(obj instanceof Car)
            result =  (color.equals(c8.color) && engine.equals(c8.engine));
            return result;

        }else return false;
    }

    @Override
    public String toString() {
        return "Car color: " +color + "; Car engine: " +engine;
    }
}

