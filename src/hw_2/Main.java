package hw_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Решение Task_0
        System.out.println("Решение Task_0:");
        String jewels = "aB";
        System.out.println("Драгоценные камни: " + jewels);
        String stones = "aaaAbbBabB";
        System.out.println("Куча обычных камней: " + stones);
        System.out.print("Драгоценных камней в куче обычных камней: ");
        System.out.println(Task_0.findJewelsInStones(jewels, stones));
        System.out.println();


        //Решение Task_1
        System.out.println("Решение Task_1:");
        final String str = "абвгдежз";
        System.out.println("Дана строка: " + str);
        System.out.print("Сгенерирован массив с индексами: ");
        final int [] index = Task_1.numIndex(str);
        System.out.println("Перетасованная строка: " +  Task_1.shuffle(str, index));
        System.out.println();

        //Решение Task_2







    }

}