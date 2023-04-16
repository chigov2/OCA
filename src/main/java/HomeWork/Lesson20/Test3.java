package HomeWork.Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello1");
        StringBuilder sb2 = new StringBuilder("hello2");
        StringBuilder sb3 = new StringBuilder("hello3");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (StringBuilder sb: list){
            System.out.print(sb + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).append("2") + "! ");
        }
        System.out.println();
        list.remove(sb3);
//        list.remove("hello32");
        for (StringBuilder sb: list){
            System.out.print(sb + " ");
        }

    }

}
