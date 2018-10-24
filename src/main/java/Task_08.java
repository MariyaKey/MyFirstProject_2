import java.util.Scanner;
/**
 * Created by Мария Криволуцкая
 *
 * Задача №11: Удаление всех пробелов в заданном тексте
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран
 */
public class Task_08 {
        static Scanner scanner = new Scanner ( System.in );

        public static void main(String[] args){
            System.out.println ( "Введите строку:" );
            String words = scanner.nextLine ();

            System.out.println ("Результат отсеивания пробелов" );
            System.out.println(words.replace(" ", "" ));
        }
    }
