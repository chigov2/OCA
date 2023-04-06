package HomeWork.Lesson16;

public class Test_lengt {
    public static void main(String[] args) {
        String s1 = new String("abcdefabcdef");
        System.out.println(s1.length());
//        System.out.println(s1.charAt(2));

        char c1 = s1.charAt(3);
//        System.out.println(c1);
//        System.out.println(s1.indexOf('e'));;
        System.out.println(s1.indexOf('a',4));

        boolean b1 = s1.startsWith("abc",6);
        System.out.println(b1);


    }
}
