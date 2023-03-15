package HomeWork;

public class Student {
    int id;
    String name;
    String lastName;
    float sredeeAlgebra;
    float sredeeGeometry;
    float sredeeHistory;

    void sredneeArifmeticheskoe(float algebra, float geometry, float history) {
        float srednee = (algebra + geometry + history) / 3;
        System.out.println(srednee);;
    }
}

class NewStudent{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Mike";
        student1.lastName = "Stoba";
        student1.sredeeAlgebra = 3.5f;
        student1.sredeeGeometry = 4.2f;
        student1.sredeeHistory = 4.5f;
        student1.sredneeArifmeticheskoe(student1.sredeeAlgebra,student1.sredeeGeometry,student1.sredeeHistory);
        System.out.println(student1.id + " " + student1.name + " " + student1.lastName + " ");

    }
}
