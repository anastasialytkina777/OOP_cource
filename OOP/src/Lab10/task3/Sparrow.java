package Lab10.task3;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void fly() {
        System.out.println("Flying high");
    }
}

