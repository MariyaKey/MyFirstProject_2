import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задание №9: Ввод/вывод данных для матрицы
 * Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
 */

public class Task_06 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {
        System.out.print ( "Введите количество строк: " );
        int line = scanner.nextInt ();
        System.out.print ( "Введите количество столбцов: " );
        int column = scanner.nextInt ();
        System.out.println ( "Введите числа для заполнения матрицы: " );

        int table[][] = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = scanner.nextInt ();
            }
        }

        System.out.println ( "Результаты умножения элементов первой строки массива на 3 " );
        for (int i = 0; i < column; i++) {
            System.out.println ( table[0][i] * 3 );
        }
    }
}

