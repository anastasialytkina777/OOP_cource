package Lab3.task2;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min, max, guess, attempts = 0;

        System.out.println("Гра Відгадай число!");
        System.out.print("Введіть мінімальне число: ");
        min = scanner.nextInt();
        System.out.print("Введіть максимальне число: ");
        max = scanner.nextInt();

        int randomNumber = random.nextInt(min, max);

        System.out.printf("Введіть число від %d до %d: ", min, max);

        // Цикл do-while для вгадування числа
        do {
            System.out.print("Введіть число: ");
            guess = scanner.nextInt();
            attempts++;

            String message = (guess < randomNumber) ? "Спробуйте більше число!" :
                    (guess > randomNumber) ? "Спробуйте менше число!" :
                            "Вітаємо! Ви відгадали число!";

            System.out.println(message);
        } while (guess != randomNumber);

        System.out.println("Ви відгадали число за " + attempts + " спроб.");


        scanner.close();
    }
}
