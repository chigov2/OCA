package HomeWork;

public class Student {
    int id;
    String name;
    String lastName;
    float sredeeAlgebra;
    float sredeeGeometry;
    float sredeeHistory;

    Student(int id1,String name1, String lastName1,float sredeeAlgebra1, float sredeeGeometry1, float sredeeHistory1){
        id = id1;
        name = name1;
        lastName = lastName1;
        sredeeAlgebra = sredeeAlgebra1;
        sredeeGeometry = sredeeGeometry1;
        sredeeHistory = sredeeHistory1;
    }
    Student(int id,String name, String lastName){
        this(id,name,lastName,0.0f,0.0f,0.0f);
    }
    Student(){

    }

}


class NewStudent{

    float sredneeArifmeticheskoe(Student st) {
        float srednee = (st.sredeeAlgebra+st.sredeeGeometry+st.sredeeHistory) / 3;
        System.out.println("Sredee = " + srednee);
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

        Student student2 = new Student(15,"Mike","Stoba",4.5f,4.7f,5.0f);
        Student student3 = new Student(18,"Student3","lastName");
        Student student4 = new Student();

        System.out.println(student2.id + " " + student2.name + " " + student2.lastName + " " + student2.sredeeHistory + " " + student2.sredeeGeometry + " " +student2.sredeeHistory);
        System.out.println(student3.id + " " + student3.name + " " + student3.lastName);

        NewStudent st2  = new NewStudent();
        NewStudent st3  = new NewStudent();
        st2.sredneeArifmeticheskoe(student2);




    }
}
