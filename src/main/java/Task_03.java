import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №6: Условие вывода данных
 * Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: X, Y или Z, а программа должна сказать, какое число ввёл пользователь: X, Y, или Z.
 */

public class Task_03 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Известно, что:" );
        System.out.println ( "X = 1" );
        System.out.println ( "Y = 2" );
        System.out.println ( "Z = 3" );
        System.out.println ( "Введите 1, 2 или 3: " );

        int riddle = scanner.nextInt ();

        if (riddle == 1) {
            System.out.println ( "Вы ввели число X." );
        }
        if (riddle == 2) {
            System.out.println ( "Вы ввели число Y." );
        }
        if (riddle == 3) {
            System.out.println ( "Вы ввели число Z." );
        } else {
            System.out.println ( "Вы ввели некорректное число!" );
        }
    }
}
