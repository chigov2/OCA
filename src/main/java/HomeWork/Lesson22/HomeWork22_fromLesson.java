package HomeWork.Lesson22;

public class HomeWork22_fromLesson {
}

class Student22{
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3){
            this.name = name;
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <5){this.course = course;  }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade >=1 && grade <=10){this.grade = grade;}
    }

    public void showInfo(){

        System.out.println("Name - " + getName()+ ","+ " course - " + getCourse() + "," + " grade - " +getGrade());
    }

}

class TestStudent22{
    public static void main(String[] args) {
        Student22 st1 = new Student22();
        StringBuilder sb1 = new StringBuilder("Mikee");
        st1.setName(sb1);
        st1.setCourse(3);
        st1.setGrade(8);
        st1.showInfo();
    }
}

