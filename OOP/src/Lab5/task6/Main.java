package Lab5.task6;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] options = {"rock", "paper", "scissors"};


        String playAgain;

        do {

            String playerChoice = "";
            String computerChoice = "";


            while (true) {
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                playerChoice = scanner.nextLine().toLowerCase();


                if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please choose 'rock', 'paper' or 'scissors'.");
                }
            }


            Random random = new Random();
            computerChoice = options[random.nextInt(3)];

            // 7. Визначте переможця за допомогою умов
            System.out.println("Player choice: " + playerChoice);
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }


            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));


        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

