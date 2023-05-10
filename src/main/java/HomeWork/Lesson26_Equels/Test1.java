package HomeWork.Lesson26_Equels;

public class Test1 {

    public static void main(String[] args) {
        Car c1 = new Car("Red","V8");
        Car c2 = new Car("Red","V8");
        Car c3 = new Car("Black","V4");
        System.out.println(c1.equals(c2));
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
        boolean result2;

        Car c2 = (Car) obj;
        if (obj != null){//(obj instanceof Car)
            result =  (color.equals(c2.color) && engine.equals(c2.engine));
            result2 = (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
            return result;//return result, result2;

        }else return false;
    }
}

