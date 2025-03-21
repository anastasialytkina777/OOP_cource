package Lab3.task3;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Цикл for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " * 7 = " + numbers[i] * 7);
        }

        System.out.println("Цикл while:");
        int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j] + " * 7 = " + numbers[j] * 7);
            j++;
        }

        System.out.println("Цикл do while:");
        int k = 0;
        do {
            System.out.println(numbers[k] + " * 7 = " + numbers[k] * 7);
            k++;
        } while (k < numbers.length);
    }
}
