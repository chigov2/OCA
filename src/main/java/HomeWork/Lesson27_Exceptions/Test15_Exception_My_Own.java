package HomeWork.Lesson27_Exceptions;

public class Test15_Exception_My_Own {
    void marathon(int tempAir, int temp_bega) throws PodvernutNoguException {
        if (temp_bega > 12){
            throw new PodvernutNoguException("Темп бега был слишком высокий: " + temp_bega);
        }
        if (tempAir >32){
            throw new SveloMishzuException("Темпеатура воздуха очень высокая: "+ tempAir);
        }
    }

    public static void main(String[] args) {
        Test15_Exception_My_Own t = new Test15_Exception_My_Own();
        try {
            t.marathon(20,13);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PodvernutNoguException extends Exception{
    PodvernutNoguException(String message){
        super(message);
    }

    PodvernutNoguException(){}
}

class SveloMishzuException extends RuntimeException{
    SveloMishzuException(String message){
        super(message);
    }

    SveloMishzuException(){}
}
