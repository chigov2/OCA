package HomeWork.Lesson20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list3 = list1;
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        StringBuilder [] array2 = list1.toArray(new StringBuilder[list1.size()]);

        for (StringBuilder array0: array2){
            System.out.println(array0 + " ");
        }

//        System.out.println(list1==list2);
//        System.out.println(list1==list3);
//        System.out.println(list1.get(1)==list2.get(1));

        System.out.println("----------");
        list1.get(0).append("!");
        System.out.println(list2.get(0));
        list1.set(0,new StringBuilder("D"));
        System.out.println(list2.get(0));
        System.out.println(list1.get(0));

    }
}
