package HomeWork.Overload;

public class Lesson5 {

    int sum(){
        int result = 0;
        System.out.println("Sum of zero parameters = " + result);
        return result;
    }
    int sum(int a){
        int result  = a;
        System.out.println("Sum of one parameter = " + result);
        return result;
    }
    int sum(int a, int b){
        int result = a + b;
        System.out.println("Sum of two parameters = " + result);
        return result;
    }
    int sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println("Sum of tree parameters = " + result);
        return result;
    }

    int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        System.out.println("Sum of four parameters = " + result);
        return result;
    }
}

class Summ1{
    public static void main(String[] args) {
        Lesson5 summ1 = new Lesson5();
        summ1.sum();
        summ1.sum(5);
        summ1.sum(5,6);
        summ1.sum(5,6,1);
        summ1.sum(4,3,9,5);
    }

}
