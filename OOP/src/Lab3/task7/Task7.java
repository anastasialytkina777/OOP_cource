package Lab3.task7;
import java.util.Random;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 101).toArray();

        System.out.println("Масив до сортування: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Відсортований масив: " + Arrays.toString(array));
    }
}
