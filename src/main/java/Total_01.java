import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Итоговая задача №1
 * Написать программу, которая будет выводить таблицу умножения для введенного пользователем числа с клавиатуры.
 */

public class Total_01 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args){
        System.out.print ( "Введите число, для которого необходимо вывести таблицу умножения: " );
        int argument = scanner.nextInt ();

        for (int i=1; i <= 10; i++) {
            System.out.println (argument + "x" + i + "=" + (argument * i));
        }
    }
}
