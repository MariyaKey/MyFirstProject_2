import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Итоговая задача №3
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей.
 */

public class Total_03 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args){
        System.out.println ("Введите текущий курс доллара в рублях: ");
        double course = scanner.nextDouble ();

        System.out.println ("Введите сумму для конвертации: ");
        double sum = scanner.nextDouble ();

        System.out.printf("Результат конвертации: %.2f", sum/course);
    }
}
