package Lab4.task9;

public class Task9 {
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {

        int result1 = sum(1, 2, 3);
        int result2 = sum(10, 20);
        int result3 = sum(5);


        System.out.println("Сума 1, 2, 3: " + result1);
        System.out.println("Сума 10, 20: " + result2);
        System.out.println("Сума 5: " + result3);
    }
}
