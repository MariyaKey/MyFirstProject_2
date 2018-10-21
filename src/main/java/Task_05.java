import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задание №8: Ввод/вывод данных для массива
 * Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
 */

public class Task_05 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {
        System.out.print ( "Задайте длину массива: " );
        int argument = scanner.nextInt ();
        int[] anArrayOfStrings = new int[argument];

        System.out.println ( "Введите значения для массива: " );
        for (int i = 0; i < anArrayOfStrings.length; i++)
            anArrayOfStrings[i] = Integer.parseInt (String.valueOf (scanner.nextInt ()));

        System.out.println ( "Результаты умножения каждого элемента массива на 2 " );
        for (int n : anArrayOfStrings) {
            System.out.println (n * 2 );
        }
    }
}
