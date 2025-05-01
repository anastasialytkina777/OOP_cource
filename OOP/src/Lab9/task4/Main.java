package Lab9.task4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Circle(3.5);
        shapes[3] = new Rectangle(2.0, 3.0);

        for (Shape shape : shapes) {
            System.out.println("Площа: " + shape.area());
        }
    }
}

