package Lab3.task6;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0, even = 0;

        // Одразу ініціалізуємо min і max після першого введеного числа
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            if (numbers[i] % 2 == 0) even++;
        }

        // Знаходимо мінімум та максимум через окремий цикл
        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = (double) sum / n;

        // Вивід результатів
        System.out.println("\nРезультати:");
        System.out.println("Мінімальне: " + min);
        System.out.println("Максимальне: " + max);
        System.out.println("Сума: " + sum);
        System.out.printf("Середнє значення: %.2f%n", average);
        System.out.println("Кількість парних: " + even);

        scanner.close();
    }
}
