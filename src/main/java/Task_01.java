import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*Запрашивается первое число.*/
        System.out.println("Введите число X: ");
        int X = scanner.nextInt ();

        /*Запрашивается второе число.*/
        System.out.println("Введите число Y: ");
        int Y = scanner.nextInt ();

        /*Запрашивается третье число.*/
        System.out.println("Введите число Z: ");
        int Z = scanner.nextInt ();

        /*Вычисление среднего арифметического трех чисел*/
        int num1 = (X + Y + Z)/3;

        /*Деление полученного среднего арифметического на 2*/
        double num2 = num1/2;

        System.out.println ("Среднее арифметическое введённых чисел: " + num1);
        System.out.println ("Результат деления среднего арифметического на 2: " + num2);

        if (num2 > 3) {
            System.out.println ("Программа выполнена корректно.");
        }

    }
}
