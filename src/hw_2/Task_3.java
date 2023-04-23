package hw_2;


import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* Task_3.*
public class Task_3 '*' {

//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
public static void main(String[] args) {

}

 */
public class Task_3 {
    public static void main(String[] args) {
        fileCreate();
        System.out.println("Введите число в формате byte: ");
        byte number = numIn();

    }



    public static void fileCreate(){
        File file = new File("result.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                System.out.println("Ошибка создания файла " + e.toString());
            }

        }
    }

    public static Byte numIn() {
        Scanner scanner = new Scanner(System.in);
        byte num = scanner.nextByte();
        return num;
    }



}
