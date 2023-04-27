package HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test10_homework {
    public ArrayList<String> abc(String ... s){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s1: s){
            if (!arrayList.contains(s1)){
                arrayList.add(s1);
            }
        }
        Collections.sort(arrayList);
        System.out.print(arrayList + " ");
        return arrayList;
    }

    public static void main(String[] args) {
        Test10_homework dz = new Test10_homework();
        dz.abc("hello","mikee","lena","max","alex","vova","andrey","valera");

    }
}


