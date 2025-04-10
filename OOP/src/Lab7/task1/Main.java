package Lab7.task1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(512, 0);
        BankAccount account2 = new BankAccount(513, 0);

        account1.setBalance(5000);
        account2.setBalance(-5000);

        account1.deposit(2000);
        account1.withdraw(1000);
        account1.withdraw(3000);

        account2.deposit(-5000);
        account2.withdraw(1000);
        account2.deposit(10000);
        account2.withdraw(-5);
    }
}
