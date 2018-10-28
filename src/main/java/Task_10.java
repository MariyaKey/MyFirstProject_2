import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №13: Преобразование типов
 * Необходимо написать программу, которая будет реализовывать следующие действия:
 * 1. Ввод числа с клавиатуры и запись его в строковую переменную S
 * 2. Конвертация строковой переменной S в числовую переменную X типа int
 * 3. Конвертация числа X типа int в число Y типа double
 * Все три числа разных типов необходимо в столбик вывести на экран
 */

public class Task_10 {
    static Scanner scanner = new Scanner ( System.in );
    public static void main(String[] args) {
        //Запрашивается число и объявляется строковая переменная с введённым значением
        System.out.println ( "Введите число:" );
        String S = scanner.nextLine ();

        //С помощью метода valueOf() преобразовываем строку в целое число
        Integer X = Integer.valueOf(S);

        //преобразовываем целое X в число с плавающей точкой
        double Y = (double) X;

        System.out.println ( "Результат преобразования :" );
        System.out.println (S);
        System.out.println (X);
        System.out.println (Y);
    }
}
