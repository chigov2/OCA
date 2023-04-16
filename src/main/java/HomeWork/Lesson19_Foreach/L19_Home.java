package HomeWork.Lesson19_Foreach;

public class L19_Home {
    public static String[] abc(String[]...array){
        int lenght = 0; //не знаю какой длины будет массив
        for (String[] arrayInner: array){//узнаем длину(количество) всех одномеиных массивов
            lenght += arrayInner.length;
        }
//        System.out.println(lenght);
//        System.out.println();
        //создается одномерный массив с длиной, равной количеству одномерных массивов  в array
        //данный фор создает из двумерного массива одномерный
        String[] result = new String[lenght];
        int count = 0;
        for (String[] arrayInner: array){
            for (String s: arrayInner){
                result[count] = s;
                count++;//индекс каждого посоедующего элемента
            }
        }
//         for (String res: result){
//            System.out.print(res + " ");
//        }
        return result;
    }

    public static void main(String[] args) {

        String[] target = abc(new String[]{"Mike","Lena","Max"}, new String[]{"test","hello"});

        //надо сравнить элементы массива c параметрами коммандной строки
        for (String s : args){
            for (int i = 0; i < target.length; i++){
                if (s.equals(target[i])){
                    target[i] = null;
                }
            }
        }
        for (String s1: target){
            System.out.print(s1+" ");
        }
    }
}
