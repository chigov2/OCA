package HomeWork.Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list.add(new StringBuilder("hello0"));
        list.add(new StringBuilder("hello1"));
        list.add(new StringBuilder("hello2"));
        list.add(new StringBuilder("hello3"));
        list.add(new StringBuilder("hello22"));

        for (StringBuilder list0: list){
            System.out.print(list0 + " ");
        }
        System.out.println();
        System.out.println(list.indexOf("hello2"));//не работает
        System.out.println(list.toString());
    }
}
