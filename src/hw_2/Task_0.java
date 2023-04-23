package hw_2;

import java.util.Random;

/*
Task_0
public class Task_0 {
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {
}
public String findJewelsInStones(String jewels, String stones) {
return "";
}
 */
public class Task_0 {
    public Task_0() {}


    public static String findJewelsInStones(String jewels, String stones) {
        char[] strToArray_1 = jewels.toCharArray();
        char[] strToArray_2 = stones.toCharArray();
        int sum_1 = 0;
        int sum_2 = 0;
        for(int i = 0; i < strToArray_2.length; i++) {
            if (strToArray_2[i]==strToArray_1[0]){
                sum_1++;
            }
            if (strToArray_2[i]==strToArray_1[1]){
                sum_2++;
            }
        }
        String s = strToArray_1[0]+ "" + sum_1 + strToArray_1[1] + "" + sum_2;
        return s;
    }
}
