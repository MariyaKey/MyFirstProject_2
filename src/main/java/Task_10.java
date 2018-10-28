import java.util.Scanner;

public class Task_10 {
    static Scanner scanner = new Scanner ( System.in );
    public static void main(String[] args) {
        System.out.println ( "Введите число:" );
        String S = scanner.nextLine ();

        Integer X = Integer.valueOf(S);

        double Y = (double) X;

        System.out.println ( "Результат преобразования :" );
        System.out.println (S);
        System.out.println (X);
        System.out.println (Y);
    }
}
