package HomeWork.Lesson22;

public class HomeWork22 {
}
class StudentH{
    private StringBuilder name;
    private int course;
    private int grade;
//    StudentH(StringBuilder name,int course, int grade){
//        this.name = name;
//        this.course = course;
//        this.grade = grade;
//    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        if (sb.length() <3){return new StringBuilder("name length is less then 3 symbols");
        }else return sb;

    }
    public StringBuilder setName(StringBuilder name) {
        StringBuilder sb = new StringBuilder(name);
        if (sb.length() <3){
            System.out.println("name length must be more then 3 symbols");
            return null;
        }else {
            this.name = name;
            return sb;
        }
    }
    public int getCourse() {
        if (course >=1 && course <=4){return course;}

        else {System.out.println("Course is not valid");
            return -1;}

    }
    public int setCourse(int course) {
        if (course >=1 && course <=4){this.course = course;}
        else System.out.println("Course is not valid");
return course;
    }
    public int getGrade() {
        if (grade >=1 && grade <=10){return course;}
        else {System.out.println("Grade is not valid");
            return -1;}
    }
    public int setGrade(int grade) {
        if (grade >=1 && grade <=10){
            this.grade = grade;
        return grade;}
        else {
            System.out.println("Grade is not valid");
            return -1;
        }
    }

    public void showInfo(StringBuilder name, int course, int grade){

        System.out.println("Name - " + name+ ","+ " course - " + course + "," + " grade - " +grade);
    }
}

class TestStudent{
    public static void main(String[] args) {
        StudentH newStudent = new StudentH();
        StringBuilder sb = newStudent.setName(new StringBuilder("Mike"));
        int newCourse = newStudent.setCourse(3);
        int newGrade = newStudent.setGrade(8);
        newStudent.showInfo(newStudent.setName(new StringBuilder("Mike")),newStudent.setCourse(3),newStudent.setGrade(8));


    }

}
