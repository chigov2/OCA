package HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Car c = new Car();
        Student student = new Student();
        ArrayList<Object> list = new ArrayList<>();

        list.add("hello");
        list.add(c);
        list.add(student);
        list.add(new StringBuilder("ok"));
        list.add(new String("ok"));

        ArrayList<String> list2 = new ArrayList<>();//correct
        ArrayList<StringBuilder> list3 = new ArrayList<>();//correct
        List<StringBuilder> list4 = new ArrayList<>();//correct


    }
}
class Car{}
class Student{}
