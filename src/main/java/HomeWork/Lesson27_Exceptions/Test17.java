package HomeWork.Lesson27_Exceptions;

public class Test17 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();

        Employee[] array1 = {d,t};
       // Teacher t2 = (Teacher) array1[0];
        Test17 t1 = new Test17();
        t1.createPwd("12345erhw");
    }
    public void createPwd(String pwd){
        if (pwd.length() <= 6){
            throw new IllegalArgumentException("Длина пароля должна быть больше 6 символов");
        }
        if (pwd.length() >12){throw new IllegalArgumentException("Длина пароля должна быть меньше 12 символов");}
        System.out.println("password accepted");
    }
}

class Employee{};
class Teacher extends Employee{};
class Doctor extends Employee{};
