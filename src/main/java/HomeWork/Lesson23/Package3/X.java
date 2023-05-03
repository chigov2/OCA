package HomeWork.Lesson23.Package3;

public class X {
    public X(){
        System.out.println("X");
    }
    public X(int i){
        System.out.println("X" +i);
    }
    private boolean adc(){return false;}

    public static void main(String[] args) {
        X x = new Y(18);
        System.out.println(x.adc());
    }
}

class Y extends X{
    public Y(int i) {
        System.out.println("Y");
    }
    public boolean abc (){return true;}
}
