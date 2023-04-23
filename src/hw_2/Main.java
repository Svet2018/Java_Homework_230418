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


        //Решение Task_2
//        System.out.println("Решение Task_2:");
//        System.out.print("Введите количество строк в книге от 1 до 10: ");
//        int numStrings = Task_2.numIn();
////        System.out.print("Введите номер строки в книге: ");
////        int numberStrings = Task_2.numIn();
//        System.out.print("Введите количество продуктов на которые аллергия: ");
//        int numProd = Task_2.numIn();
//        System.out.println("Введите продукт на который аллергия и на который заменить в формате: продукт1 - продукт2");
//        String f = Arrays.toString(Task_2.foodIn(numProd));
//        Task_2.fileFile();




    }
}