package Lab7.task1;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не може бути від'ємним");
            return;
        } else {
            System.out.println("Баланс встановлений на " + balance);
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Депозит не може бути від'ємним");
        } else {
            balance +=amount;
            System.out.println("Депозит " + amount + ", новий баланс - " + balance);
        }
    }
    public void withdraw(double amount) {
        if (amount <0) {
            System.out.println("Вилучення не може бути від'ємним");
        } else if (amount > balance ) {
            System.out.println("Сума перевищуе баланс");
        } else {
            balance -= amount;
            System.out.println("Вилучення " + amount + " новий баланс - " + balance);
        }
    }

}
