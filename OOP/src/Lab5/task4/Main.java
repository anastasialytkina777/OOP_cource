package Lab5.task4;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();


        int numDice;
        int totalSum = 0;


        System.out.print("Введіть кількість кубиків: ");
        numDice = scanner.nextInt();


        if (numDice <= 0) {
            System.out.println("Помилка: кількість кубиків повинна бути більше за 0.");
            scanner.close();
            return;
        }


        for (int i = 0; i < numDice; i++) {
            int roll = random.nextInt(6) + 1;
            totalSum += roll;

            print(roll);
        }


        System.out.println("Підсумкова сума всіх кидків: " + totalSum);


        scanner.close();
    }


    static void print(int roll) {
        switch (roll) {
            case 1:
                System.out.println(" _______ ");
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");
                System.out.println(" ‾‾‾‾‾‾‾ ");
                break;
            case 2:
                System.out.println(" _______ ");
                System.out.println("| *     |");
                System.out.println("|       |");
                System.out.println("|     * |");
                System.out.println(" ‾‾‾‾‾‾‾ ");
                break;
            case 3:
                System.out.println(" _______ ");
                System.out.println("| *     |");
                System.out.println("|   *   |");
                System.out.println("|     * |");
                System.out.println(" ‾‾‾‾‾‾‾ ");
                break;
            case 4:
                System.out.println(" _______ ");
                System.out.println("| *   * |");
                System.out.println("|       |");
                System.out.println("| *   * |");
                System.out.println(" ‾‾‾‾‾‾‾ ");
                break;
            case 5:
                System.out.println(" _______ ");
                System.out.println("| *   * |");
                System.out.println("|   *   |");
                System.out.println("| *   * |");
                System.out.println(" ‾‾‾‾‾‾‾ ");
                break;
            case 6:
                System.out.println(" _______ ");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println(" ‾‾‾‾‾‾‾ ");
                break;
        }
    }
}
