package HomeWork.Lesson23.Package2;

import HomeWork.Lesson23.HomeWorkImages.X;

public class Y extends X {
//    Y(){}
    public void abc(){
        System.out.println("Y");
    }
    public void def(){
        Y y = new Y();
        y.abc();
    }
    public void sdf(){
        X x = new Y();
//        x.abc();
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.sdf();
    }
}
