import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №15: Выгрузка данных из файла на экран
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */

public class Task_12 {
    public static void main(String[] args) {

        try {
            //создается объект file и указывается расположение читаемого файла
            File file = new File ( "C:/Users/user", "First.txt" );
            //создается объект fileReader для чтения содержимого файла First
            FileReader fileReader = new FileReader ( file );

            BufferedReader reader = new BufferedReader ( fileReader );

            String S = null;
            //запускается цикл, который читает содержимое файла и присваивает его к строковой переменной S, и выводит S на экран до тех пор, пока переменная не пуста и есть, что читать
            while ((S = reader.readLine ()) != null) {
                System.out.println ( S );
            }
            reader.close ();
        }
        catch (IOException exc){
            System.out.println ( "Ошибка ввода-вывода" + exc );
        }
    }
}

