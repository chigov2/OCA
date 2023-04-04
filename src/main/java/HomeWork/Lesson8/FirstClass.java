package HomeWork.Lesson8;

public class FirstClass {
    static int multiple3(int m1,int m2, int m3){
        int result = m1* m2* m3;
        return result;
    }
    static  void delenie(int a, int b){
        System.out.println("Delenie a na b  = " + a/b + " Ostatok = " +a%b);
    }
}
class SecondClass{
    public static void main(String[] args) {
        System.out.println(FirstClass.multiple3(2,3,4));
        System.out.println(FirstClass.multiple3(5,6,7));
        FirstClass.delenie(7,2);
        FirstClass.delenie(56,3);
    }
}
