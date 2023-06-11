package Parametrixed;

public class Test1 {
    public static void main(String[] args) {
        Info <String > info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println("---");

        System.out.println(s);
        Info<Integer> info2 = new Info<>(5);
        System.out.println(info2);
        Integer i = info2.getValue();
    }

}

class Info <T>{
    private T value;
    Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "((" + value +"))";
    }

    public T getValue(){
        return value;
    }
}
