package HomeWork.Lesson20;

import java.util.ArrayList;

public class Test2
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("hello");
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add(3,"hello22");

        list2.add("list2_");
        list2.add("list3_");

        for (String list0: list){
            System.out.print(list0 + " ");
        }
        System.out.println();
        System.out.println(list.get(3));
        System.out.println();
        for (int i = 0; i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list2.set(1,"Ivanov");
//        list.set(2,"2_");
//        list.remove("hello1");
       list.addAll(1,list2);

        System.out.println();
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : list2) {
            System.out.print(s + " ");
        }
    }
}
