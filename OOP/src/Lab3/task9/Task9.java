package Lab3.task9;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину масиву: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < length; i++){
            System.out.print("Елемент " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Введіть індекс елемента, який хочете змінити: ");
        int index = scanner.nextInt();

        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();
        array[index] = newValue;

        System.out.println("Оновлений масив:");
        for(int number : array){
            System.out.print(number + " ");
        }
        scanner.close();
    }

}
