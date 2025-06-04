package Lab5.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double num1, num2, result = 0;
        char operator;
        boolean valid = true;


        System.out.print("Введіть перше число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Введіть друге число: ");
        num2 = scanner.nextDouble();


        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // 5. Обробіть випадок ділення на нуль
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                    valid = false;
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Помилка: некоректний оператор!");
                valid = false;
                break;
        }


        if (valid) {
            System.out.println("Результат: " + result);
        }


        scanner.close();
    }
}

