package Lab12.stage4.handlers;

import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int getIntInput(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("❌ Invalid input. Please enter a number.");
            scanner.next();
        }

        int intInput = scanner.nextInt();
        scanner.nextLine();
        return intInput;
    }
}