package hw_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListStr {

    /*
Task_2
На первой строке записывается натуральное число n - количество строчек в книге.
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов,
на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2",
где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену,
не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить
написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */

        public static void main(String[] args) {
            System.out.println("Поваренная книга Васи:");
            List<String> book = listkookBook();
            printBook((ArrayList<String>) book);
            System.out.println();
            System.out.println("Введите количество интересующих Вас Васиных рецептов от 1 до 10: ");
            int num = numIn();
            System.out.println("Введите номера интересующих Вас рецептов из поваренной книги Васи от 1 до 10:");
            List<Integer> list = number(num);

            System.out.println("Ваша собственная поваренная книга, на основе Васиных рецептов:");
            List<String> newListBook = printNewBook((ArrayList<Integer>) list, (ArrayList<String>) book);
            printBook((ArrayList<String>) newListBook);

        }

        //Метод создает поваренную книгу
        protected static ArrayList<String> listkookBook(){
            List<String> addBook = new ArrayList<>();
            addBook.add("Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.");
            addBook.add("Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.");
            addBook.add("Рецепт 3. Мандарин 100гр, молоко 200гр. Возьмите мандарин и измелчите его. Посыпьте измельчённый мандарин на молоко.");
            addBook.add("Рецепт 4. Орех 100гр, мука 3кг. Смешать, есть) Радоваться жизни.");
            addBook.add("Рецепт 5. Яблоко 100гр, варенье 200гр. Возьмите яблоко и измелчите его. Посыпьте измельчённый яблоко на варенье.");
            addBook.add("Рецепт 6. Курица 100гр, перец 3кг. Смешать, есть) Радоваться жизни.");
            addBook.add("Рецепт 7. Апельсин 100гр, батон 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.");
            addBook.add("Рецепт 8. Банан 100гр, сметана 3кг. Смешать, есть) Радоваться жизни.");
            addBook.add("Рецепт 9. Пастила 100гр, крупа 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.");
            addBook.add("Рецепт 10. Тыква 100гр, огурец 3кг. Смешать, есть) Радоваться жизни.");
            return (ArrayList<String>) addBook;
        }

        //Метод печатает поваренную книгу
        protected static void printBook(ArrayList<String> list){
            for (String str : list){
                System.out.println(str);
            }
        }

        //Метод принимает и возвращает количество чего-либо
        protected static int numIn(){
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            return number;
        }

        //Метод создает список выбранных рецептов
        protected static ArrayList<Integer> number(int num){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++){
                System.out.print("> ");
                list.add( numIn());
            }
            return (ArrayList<Integer>) list;
        }

        //Метод печатает интересующие рецепты
        protected static List<String> printNewBook(ArrayList<Integer> numList, ArrayList<String> stringList){
            List<String> newList = new ArrayList<>();
            for (int i = 0; i < numList.size(); i++){
                newList.add(stringList.get(numList.get(i) - 1));
        }
            return newList;
        }



}




