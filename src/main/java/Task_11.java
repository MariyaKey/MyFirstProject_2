import java.util.Arrays;

/**
 * Created by Мария Криволуцкая
 *
 * Задача №14: Сортировка данных в массиве
 * Необходимо написать программу для сортировки данных массива по возрастанию.
 * Использовать пузырьковый метод сортировки.
 */

public class Task_11 {
    public static void main(String[] args) {
        //объявлен массив чисел
        int[] mas = {3, 7, 4, 4, 6, 8, 5};
        System.out.println ( "Объявленный массив чисел: " + Arrays.toString ( mas ) );

        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //задаем условие для сортировки массива
                if (mas[j] > mas[j + 1]) {

                    int bubble;
                    //сравниваем элементы попарно и меняем их местами в том случае, если они имеют неправильный порядок
                    bubble = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = bubble;
                }
            }
        }
        //выводим отсортированный массив на экран
        System.out.println ( "Результат сортировки массива: " +  Arrays.toString ( mas ));
    }
}