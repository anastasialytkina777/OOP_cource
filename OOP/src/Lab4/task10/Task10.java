package Lab4.task10;

public class Task10 {
    public static void printNumbers(String message, int... numbers) {
        System.out.print(message + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        printNumbers("Список 1", 1, 2, 3);
        printNumbers("Список 2", 10, 20);
        printNumbers("Порожній список");
    }
}
