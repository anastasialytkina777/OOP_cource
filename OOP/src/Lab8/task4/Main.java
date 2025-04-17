package Lab8.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(8, 10);

        System.out.printf("Circle Area: %.2f;\nRectangle Area: %.2f%n", circle.area(), rectangle.area());
    }
}

