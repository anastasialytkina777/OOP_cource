package Lab5.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = {
                "Яка планета найбільша в Сонячній системі?",
                "Скільки планет в Сонячній системі?",
                "Яка планета найближча до Сонця?",
                "Хто першим ступив на Місяць?",
                "Яка планета відома своїми кільцями?"
        };

        String[][] options = {
                {"1. Юпітер", "2. Сатурн", "3. Земля", "4. Марс"},
                {"1. 8", "2. 9", "3. 10", "4. 7"},
                {"1. Меркурій", "2. Венера", "3. Земля", "4. Марс"},
                {"1. Юрій Гагарін", "2. Ніл Армстронг", "3. Алдрін Базз", "4. Джон Кеннеді"},
                {"1. Юпітер", "2. Сатурн", "3. Марс", "4. Нептун"}
        };

        String[] correctAnswers = {"1", "1", "1", "2", "2"};


        Scanner scanner = new Scanner(System.in);


        int score = 0;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Виберіть відповідь (1-4): ");
            String userAnswer = scanner.nextLine();


            if (userAnswer.equals(correctAnswers[i])) {
                score++;
            }
        }


        System.out.println("Ваша кількість правильних відповідей: " + score + " з " + questions.length);


        scanner.close();
    }
}

