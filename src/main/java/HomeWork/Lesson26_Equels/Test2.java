package HomeWork.Lesson26_Equels;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        Long l = 45l;
        int a = list.get(0);
        System.out.println(a);
        System.out.println();
        String s1 = "50";
        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        int i = Integer.parseInt(s1);
        System.out.println(i);
        System.out.println(b1);
    }
}
