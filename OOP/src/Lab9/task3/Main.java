package Lab9.task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

