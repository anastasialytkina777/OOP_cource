package Lab5.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        do {

            System.out.println("\n--- Банківська програма ---");
            System.out.println("1. Показати поточний баланс");
            System.out.println("2. Внести кошти");
            System.out.println("3. Зняти кошти");
            System.out.println("4. Вийти");
            System.out.print("Виберіть дію: ");


            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    double depositAmount = deposit(scanner);
                    balance += depositAmount;
                    System.out.printf("Ви внесли: $%.2f\n", depositAmount);
                    break;
                case 3:
                    double withdrawAmount = withdraw(scanner, balance);
                    if (withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.printf("Ви зняли: $%.2f\n", withdrawAmount);
                    }
                    break;
                case 4:
                    System.out.println("Дякуємо за користування програмою!");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 4);


        scanner.close();
    }


    static void showBalance(double balance) {
        System.out.printf("Поточний баланс: $%.2f\n", balance);
    }


    static double deposit(Scanner scanner) {
        System.out.print("Введіть суму для внесення: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Сума внесення має бути більшою за нуль.");
            return 0;
        }
        return amount;
    }


    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Введіть суму для зняття: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Сума зняття має бути більшою за нуль.");
            return 0;
        }
        if (amount > balance) {
            System.out.println("Недостатньо коштів на рахунку.");
            return 0;
        }
        return amount;
    }
}

