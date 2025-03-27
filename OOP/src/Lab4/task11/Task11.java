package Lab4.task11;

public class Task11 {
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Потрібно передати хоча б одне число");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Максимум: " + findMax(1, 5, 3, 9));
        System.out.println("Максимум: " + findMax(-10, -3, -7));
        System.out.println("Максимум: " + findMax(42));
    }
}
