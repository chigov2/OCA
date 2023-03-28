package HomeWork.Lesson13;

public class Test {
}

class Student{
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(7);
//        if (st1.grade == 2){
//            System.out.println("2");
//        } else if (st1.grade == 3){
//            System.out.println("3");
//        } else if (st1.grade == 4){
//            System.out.println("4");
//        }else if (st1.grade == 5){
//            System.out.println("5");
//        } else{
//            System.out.println("wrong value");
//        }
    switch (st1.grade){
        case 1:
            System.out.println("1"); break;
        case 2:
            System.out.println("2");break;
        case 3:
            System.out.println("3");break;
        case 4:
            System.out.println("4"); break;
        case 5:
            System.out.println("5");break;
        default:
            System.out.println("----");
    }

    }
}
