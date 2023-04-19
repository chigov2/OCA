package HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test9_Iterator {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(s3);
        arrayList1.add(s1);
        arrayList1.add(s4);
        arrayList1.add(s2);
        System.out.println(arrayList1);

        Iterator<String> it = arrayList1.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }


    }
}
