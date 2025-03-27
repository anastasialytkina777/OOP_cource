package Lab4.task6;

public class Task6 {
    public static void printNumber() {
        int num = 10;
        System.out.println("Значення num у методі printNumber(): " + num);
    }

    public static void main(String[] args) {

        printNumber();

        // System.out.println(num); Неможливо вивести num, оскільки ця змінна є локальною і доступна лише всередині методу printNumber()

    }
}
