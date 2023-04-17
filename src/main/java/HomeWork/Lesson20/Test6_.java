package HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6_ {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

//        Object[] array = list1.toArray();
        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);

        for (Object array0: array2){
            System.out.print(array0 + " ");
        }

        StringBuilder[] array4 = {sb1,sb2,sb3,sb3,sb3};
        List<StringBuilder> list8 = Arrays.asList(array4);
        System.out.println();
        System.out.println("-----------");

        for (StringBuilder list00: list8){
            System.out.print(list00 + " ");
        }
        System.out.println();
        System.out.println("-----------1");
        System.out.println(list8);
//        array4[0].append("!");
        array4[0] = new StringBuilder("F");
        System.out.println();
        System.out.println("-----------2");
        System.out.println(list8);
    }
}
