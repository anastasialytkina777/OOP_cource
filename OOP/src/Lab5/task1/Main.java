package Lab5.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double monthlyDeposit;
        double annualRate;
        int years;
        int timesCompounded;

        System.out.print("Введіть початкову суму вкладу: ");
        principal = scanner.nextDouble();

        System.out.print("Введіть суму місячного внеску: ");
        monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (у %): ");
        annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість років: ");
        years = scanner.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        timesCompounded = scanner.nextInt();

        double r = annualRate / 100.0;

        int totalPeriods = timesCompounded * years;
        double periodicRate = r / timesCompounded;

        double amountFromPrincipal = principal * Math.pow(1 + periodicRate, totalPeriods);
        double amountFromDeposits = monthlyDeposit * ((Math.pow(1 + periodicRate, totalPeriods) - 1) / periodicRate);

        double totalAmount = amountFromPrincipal + amountFromDeposits;

        System.out.printf("Сума після %d років становить: $%.2f\n", years, totalAmount);

        scanner.close();
    }
}

