package hw_2;

import java.util.Random;

public class Task_1 {
    public Task_1() {}

    /* Task_1
public class Task_1 {
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1] result “abc”
public static void main(String[] args) {
}
public String shuffle(final String s, final int[] index){
return "";
}
 */
    //Метод создает массив длинной равной длине строки
    public static int [] numIndex(String str){
        int num = str.length();
        int [] number = new int[num];
        return number;
    }

    //Метод перетасовывает и выводит массив и перетасованную строку
    public static String shuffle(final String str, final int[] index){
        char[] strToArray_1 = str.toCharArray();
        String s ="";
        int num = str.length();
        for (int i = 0; i < num; i++){
            Random random = new Random();
            int ran = random.nextInt(0, num);
            index[i] = ran;
            System.out.print(index[i] + " ");
            s = s + strToArray_1[ran];
        }
        System.out.println();
        return s;}
}
