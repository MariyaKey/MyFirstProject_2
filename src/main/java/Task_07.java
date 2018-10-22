import java.util.Scanner;
/**
 * Created by Мария Криволуцкая
 *
 * Задание №10: Ввод строки с клавиатуры
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */

public class Task_07 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args){
        System.out.println ( "Введите строку:" );
        String words = scanner.nextLine ();

        System.out.println ("Вы ввели строку: " + words);
    }
}
