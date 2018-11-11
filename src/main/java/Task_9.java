import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №12: Сравнение двух строк Задание
 * Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные. Вывести на экран строку с наибольшей длинной.
 */

public class Task_9 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {
        System.out.println ( "Введите первую строку:" );
        String words1 = scanner.nextLine ();
        int len1 = words1.length ();
        System.out.println ( "Введите  вторую строку:" );
        String words2 = scanner.nextLine ();
        int len2 = words2.length ();

        if (len1>len2){
            System.out.println ( "Самая длинная строка: " + words1 );
        }
        else if (len1<len2){
            System.out.println ( "Самая длинная строка: " + words2);
        }
        else{
            System.out.println ( "Введенные строки равны." );
        }
    }
}
