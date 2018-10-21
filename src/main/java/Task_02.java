import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №5: Отработка поразрядных операций
 * Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран
 */

public class Task_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Введите число в бинарном формате: " );

        String bin = scanner.nextLine ();
        int binNum = Integer.parseInt ( bin, 2 );

        System.out.println ( binNum );
    }
}
