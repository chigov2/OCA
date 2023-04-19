package HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test7 {
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
        ArrayList<String> arrayList2 = arrayList1;
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add(s3);
        arrayList3.add(s1);
        arrayList3.add(s4);
        arrayList3.add(s2);

        System.out.println(arrayList1);
        Collections.sort(arrayList1);
        System.out.println();
        System.out.println(arrayList1);
        System.out.println();
        System.out.println(arrayList1.equals(arrayList2));
        System.out.println();
        System.out.println(arrayList1.equals(arrayList3));
        System.out.println();
        System.out.println(arrayList3);

    }
}
