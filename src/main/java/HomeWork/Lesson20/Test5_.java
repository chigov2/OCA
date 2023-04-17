package HomeWork.Lesson20;

import java.util.ArrayList;

public class Test5_ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(new String("hello0"));
        list.add(new String("hello1"));
        list.add(new String("hello2"));
        list.add(new String("hello3"));
        list.add(new String("hello22"));
        list.add(new String("hello2"));

        for (String list0: list){
            System.out.print(list0 + " ");
        }
        System.out.println();
        System.out.println(list.indexOf("hello2"));
        System.out.println(list.indexOf(new String("hello2")));
        System.out.println(list.lastIndexOf(new String("hello2")));
        System.out.println(list.size());
//        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list.contains("hello3"));
        System.out.println(list.toString());
    }
}
