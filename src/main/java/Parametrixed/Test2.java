package Parametrixed;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(50);
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("w");
        arrayListString.add("r");
        arrayListString.add("t");
        arrayListString.add("u");
        arrayListString.add("o");

        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);
        System.out.println("---------");
        String s = GenMethod.getSecondElement(arrayListString);
        System.out.println(s);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}

