import java.io.*;
import java.util.Scanner;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №17: Выгрузка данных из файла, проверка и перезапись
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 */

public class Task_14 {
    static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {
        File file = new File ( "C:/Users/user", "First.txt" );

        try {
            FileReader fileReader = new FileReader ( file );

            BufferedReader reader = new BufferedReader ( fileReader );

            String S = null;
            while ((S = reader.readLine ()) != null) {
                System.out.println ( S );
            }
            reader.close ();
        }
        catch (IOException exc){
            System.out.println ( "Ошибка ввода-вывода" + exc );
        }
        try {
            FileWriter writer = new FileWriter (file);

            System.out.println ( "Введите текст: " );
            String K = scanner.nextLine ();

            writer.write(K);
            writer.close ();
        }
        catch (IOException exc){
            System.out.println ( "Ошибка ввода-вывода" + exc );
        }
    }
}