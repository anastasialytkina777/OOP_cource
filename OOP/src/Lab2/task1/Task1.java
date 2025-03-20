package Lab2.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число додатнє");
        } else if (number < 0) {
            System.out.println("Число від'ємне");
        } else {
            System.out.println("Число нуль");
        }
        scanner.close();
    }
}
