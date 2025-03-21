package Lab3.task8;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int number : array) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + target + " знайдено у масиві.");
        } else {
            System.out.println("Число " + target + " не знайдено у масиві.");
        }

        scanner.close();
    }
}
