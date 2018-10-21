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

        int table[][] = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == line - 1 || j == 0 || j == line - 1) {
                    table[i][j] = '#';
                } else {
                   table[i][j] = ' ';
                }
            }
        }
                for (int i = 0; i < line; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print ( table[i][j] );
                    }
                    System.out.println();
                }

        /*System.out.println ( "Результаты умножения каждого элемента массива на 3 " );
        for (int n : table) {
            System.out.println ( n * 3 );*/
        }
    }
}

