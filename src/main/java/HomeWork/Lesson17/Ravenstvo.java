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

    public static boolean ravenstvo2(StringBuilder st1, StringBuilder st2){
        boolean result = true;
        if (st1.length() == st2.length()){
            for (int i = 0; i < st1.length(); i++){
                if (st1.charAt(i) != st2.charAt(i)){
                    result = false;
                    break;
                }

            }
        }//else {result = false;}
        return result;
    }

    public static void main(String[] args) {
//        StringBuilder ss1 = new StringBuilder("112");
//        StringBuilder ss2 = new StringBuilder("112");
//        StringBuilder ss3 = ss1;
//        Ravenstvo.ravenstvo(ss1,ss2);
//        Ravenstvo.ravenstvo(ss1,ss3);
        StringBuilder ss1 = new StringBuilder("112");
        StringBuilder ss2 = new StringBuilder("112");
        StringBuilder ss3 = new StringBuilder("113");

        boolean a = ravenstvo2(ss1,ss3);
        System.out.println("a = " +a);
        boolean b = ravenstvo2(new StringBuilder(),new StringBuilder());
        System.out.println("b = " +b);
        boolean c = ravenstvo2(new StringBuilder("f"),new StringBuilder("f"));
        System.out.println("c = "+c);


    }

}
