package HomeWork.Lesson17;

public class StringBuilderLesson {
    public static void main(String[] args) {
        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("abcdefgh");
        String sb2 = sb1.substring(4,6);
        System.out.println(sb1.length());
        System.out.println(sb2);
        System.out.println(sb1.indexOf("c"));
        System.out.println(sb1.charAt(3));
        System.out.println("-----------------");

        StringBuilder sb3 = new StringBuilder(50);
        System.out.println(sb3.length());
    }
}
