package Test46;

public class Test7 {
    public static void main(String[] args) {
        int a = 8;
        do {
            while(a++ < 12)
            { a += 4;}
            //a = 8 -> 8 < 12 -> OK -> (8+1) - -> 8+1+4 = 13 -> 13 >12 ->(13+1)
            // (13 > 4) -> OK -> (13+1)
        }while (a<4);
        System.out.println(a);
    }
}
