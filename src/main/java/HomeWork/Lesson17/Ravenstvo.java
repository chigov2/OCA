package HomeWork.Lesson17;

public class Ravenstvo {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
if (sb1 == sb2){
    System.out.println("true");
    return true;
}else{
    System.out.println("false");
    return true;
}
    }

    public static void main(String[] args) {
        StringBuilder ss1 = new StringBuilder("112");
        StringBuilder ss2 = new StringBuilder("112");
        StringBuilder ss3 = ss1;
        Ravenstvo.ravenstvo(ss1,ss2);
        Ravenstvo.ravenstvo(ss1,ss3);
    }

}
