package HomeWork.Lesson27_Exceptions;

public class HomeWork27_28 {

    public static void main(String[] args) {
        Tiger1 tiger = new Tiger1();
        try {
            tiger.eat("meat2");
        } catch (NoMeatException e) {
            System.out.println(e.getMessage());
        }


        try {
            tiger.drink("water");
            try{
                tiger.drink("Beer");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("This is inner finally block");
            }
        } catch (NoWaterException e) {
            System.out.println("Tiger does not drink " + e);
        }
        finally {
            System.out.println("his is outer finally block");
        }
    }

}

class NoMeatException extends RuntimeException{
    NoMeatException(String message){super(message);}
}

class NoWaterException extends Exception{
    NoWaterException(String message){super(message);}
}

class Tiger1{
    void eat(String meat){
        if (meat != "meat"){throw new NoMeatException("Tiger does not eat " + meat);}
        if (meat == "meat"){System.out.println("Tiger does eat " + meat);}
    }
    void drink(String drink) throws NoWaterException {
        if (drink != "water"){throw new NoWaterException("Tiger does not drink " + drink);}
        if (drink == "water"){System.out.println("Tiger does drink " + drink);}
    }
}

