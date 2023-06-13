package Test46;

public class Test2 {
}
class A1{
    public A1(){str1 = abc("string1");    }
    static String str1 =  abc("String2");
    String str3 = abc("String3");
    {str1 = abc("String4");}
    static {str1 = abc("String5");}
    static String str2 = abc("String6");
    String str4 = abc("String7");



    static String abc(String str){
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        A1 a = new A1();
    }
}
