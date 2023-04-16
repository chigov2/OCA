package HomeWork.Lesson20;

import java.util.ArrayList;

public class Test4 {

        public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list.add(new StringBuilder("hello"));
        list.add(new StringBuilder("hello1"));
        list.add(new StringBuilder("hello2"));
        list.add(new StringBuilder("hello3"));
        list.add(3,new StringBuilder("hello22"));

        list2.add(new StringBuilder("list2_"));
        list2.add(new StringBuilder("list3_"));

        for (StringBuilder list0: list){
            System.out.print(list0 + " ");
        }
        System.out.println();
        System.out.println(list.get(3));
        System.out.println();
        for (int i = 0; i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list2.set(1,new StringBuilder("Ivanov"));
//        list.set(2,"2_");
//        list.remove("hello1");
        list.addAll(1,list2);

        System.out.println();
            System.out.print("AddAll list2: -- " );
        for (StringBuilder s : list) {
            System.out.print( s + " ");
        }
            System.out.println();
            System.out.print("append: -- ");
            list2.get(1).append("!");
            for (StringBuilder s : list) {
                System.out.print(s + " ");
            }

        System.out.println();
        for (StringBuilder s : list2) {
            System.out.print(s + " ");
        }
    }
    }

