package HomeWork.Lesson16;

public class SubString {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.substring(4);
        System.out.println(s2);
        String s3 = s1.trim();
        System.out.println(s3);

        String s4 = s1.replace('H','h');
        System.out.println(s4);

        String s5 = "Hello, ";
        String s6 = "Mike";
        String s7 = s5.concat(s6);
        System.out.println(s7);
    }
}
