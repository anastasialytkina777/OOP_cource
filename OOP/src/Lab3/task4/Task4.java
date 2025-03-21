package Lab3.task4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть N: ");
        int N = scanner.nextInt();

        // Мтематична формула для обчислення суми чисел від 1 до N
        int sum = (N * (N + 1)) / 2;

        System.out.println("Загальна сума: " + sum);

        scanner.close();
    }
}
