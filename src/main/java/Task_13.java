import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №16: Запись данных в файл
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt
 */

public class Task_13 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter ( "Second.txt" );

            System.out.println ( "Введите текст: " );
            String S = scanner.nextLine ();

            writer.write(S);
            writer.close ();
        }
        catch (IOException exc) {
            System.out.println ( "Ошибка ввода-вывода" + exc );
        }
    }
}
