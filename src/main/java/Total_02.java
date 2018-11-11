import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Итоговая задача №2
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел
 */


public class Total_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Задайте длину массива: " );
        int argument = scanner.nextInt ();
        int[] mas = new int[argument];

        System.out.println ( "Введите значения для массива: " );
        for (int i = 0; i < mas.length; i++)
            mas[i] = scanner.nextInt ();

        int element;
        int indexToInsert;

        for (int i = 0; i < mas.length; i++) {
            element = mas[i];

            indexToInsert = i;

            while (indexToInsert > 0
                    && mas[indexToInsert-1] > element){
                mas[indexToInsert] = mas[indexToInsert-1];
                indexToInsert--;
                mas[indexToInsert] = element;
            }
        }
        System.out.println ( "Результат сортировки массива вставками: " +  Arrays.toString ( mas ));
    }
}
