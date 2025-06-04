package Lab5.task7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int balance = 100;
        int bet = 0;
        int winnings = 0;


        System.out.println("Ласкаво просимо до гри 'Слот-машина'!");
        System.out.println("Можливі символи: 🍒, 🍋, 🍊, 🏆, ⚓");


        while (balance > 0) {
            System.out.println("Поточний баланс: $" + balance);


            System.out.print("Введіть розмір ставки: $");
            bet = scanner.nextInt();


            if (bet > balance) {
                System.out.println("Недостатньо коштів. Ваша ставка перевищує баланс.");
                continue;
            } else if (bet <= 0) {
                System.out.println("Некоректна сума ставки. Будь ласка, введіть позитивну суму.");
                continue;
            }


            balance -= bet;


            String[] row = spinRow();


            printRow(row);
            winnings = getPayout(row, bet);

            if (winnings > 0) {
                System.out.println("Ви виграли $" + winnings + "!");
                balance += winnings;
            } else {
                System.out.println("На жаль, ви програли цього раунду.");
            }


            System.out.print("Чи хочете ви продовжити гру? (Y/N): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("N")) {
                break;
            }
        }


        if (balance == 0) {
            System.out.println("Ви витратили всі гроші. Кінець гри!");
        }


        System.out.println("Дякуємо за гру! Ваш фінальний баланс: $" + balance);


        scanner.close();
    }


    static String[] spinRow() {
        String[] symbols = {"🍒", "🍋", "🍊", "🏆", "⚓"};
        Random random = new Random();
        String[] row = new String[3];

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }


    static void printRow(String[] row) {
        System.out.println("**********");
        System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
        System.out.println("**********");
    }


    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🍒": return bet * 3;
                case "🍋": return bet * 4;
                case "🍊": return bet * 5;
                case "🏆": return bet * 10;
                case "⚓": return bet * 100;
            }
        } else if (row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])) {
            switch (row[0]) {
                case "🍒": return bet * 2;
                case "🍋": return bet * 3;
                case "🍊": return bet * 4;
                case "🏆": return bet * 5;
                case "⚓": return bet * 6;
            }
        }
        return 0;
    }
}
