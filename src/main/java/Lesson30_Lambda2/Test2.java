package Lesson30_Lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("1","2","3","4","5","6");

        for (String s: list){
            Predicate<String> p = z-> {return z.length()>4;};
        }


//        for (String s : list){
//            System.out.println(s);
//        }
        list.forEach(t -> System.out.println(t));

        System.out.println("---");
        list.forEach(System.out::println);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(8);
        integerArrayList.add(12);
        integerArrayList.add(30);
        integerArrayList.add(14);
        integerArrayList.add(58);
        integerArrayList.add(63);
        integerArrayList.add(7);
        System.out.println("--/3----");
//        integerArrayList.removeIf(element ->element%3==0);
        System.out.println(integerArrayList);
        System.out.println("--sort----");
        integerArrayList.sort((h,j)-> -h.compareTo(j));
//        integerArrayList.sort(Integer::compareTo);
        System.out.println(integerArrayList);
    }
}
