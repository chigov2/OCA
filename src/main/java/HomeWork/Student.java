package HomeWork;

public class Student {
    int id;
    String name;
    String lastName;
    float sredeeAlgebra;
    float sredeeGeometry;
    float sredeeHistory;


}

class NewStudent{
    float sredneeArifmeticheskoe(Student st) {
        float srednee = (st.sredeeAlgebra+st.sredeeGeometry+st.sredeeHistory) / 3;
        System.out.println(srednee);
        return srednee;
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Mike";
        student1.lastName = "Stoba";
        student1.sredeeAlgebra = 3.5f;
        student1.sredeeGeometry = 4.2f;
        student1.sredeeHistory = 4.5f;

        NewStudent newStudent = new NewStudent();
        newStudent.sredneeArifmeticheskoe(student1);

        System.out.println(student1.id + " " + student1.name + " " + student1.lastName + " ");

    }
}
