package Lab3.task10;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину масиву: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введіть елементи масиву: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Елемент " + i + ": ");
            array[i] = scanner.nextInt();
        }
        boolean foundDublicate = false;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Знайдено дублікат: " + array[i]);
                    foundDublicate = true;
                    break;
                }
            }
        }
        if (!foundDublicate){
            System.out.println("Дублікатів не знайдено");
        }
        scanner.close();
    }
}
