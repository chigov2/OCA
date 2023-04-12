package HomeWork.Lesson17;
class Car{}

public class StringBuilderequels {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
//        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb3 = sb1;
        StringBuilder sb2 = sb1.append("4");
        sb2.append("5").append("6");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1.equals(sb3));

        StringBuilder sb10 = new StringBuilder("Hello");
        StringBuilder sb12 = new StringBuilder("Good bye");
        System.out.println("--------------");
        String s1  = new String(sb10);
        String s2  = new String(sb12);
        StringBuilder sb13 = sb2.append(new Car());
        System.out.println(sb13);
        System.out.println(s1);
    }





}
