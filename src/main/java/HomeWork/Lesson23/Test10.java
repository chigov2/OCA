package HomeWork.Lesson23;

public class Test10 {
    public String s1 = "privet,";
    static double pi = 3.14;

    int summa(int ...i){
        int result =0;
        for (int anyName:i){
            result  = result + anyName;
        }
        return result;
    }
    static void abc(){
        System.out.println("Static abc");
    }

}

class Test10_0 extends Test10{
//    String s2 = super.s1 + " drug";
    String s1 = super.s1 + " drug";

    int summa(int...i){
        int result = super.summa(i);
        System.out.println(" + test");
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        Test10_0 t = new Test10_0();
        System.out.println(t.s1);
        t.summa(10);
    }
}

