package Lab1.task6;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the rectangle: ");
        double height = scanner.nextDouble();

        double area = width * height; //

        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}
