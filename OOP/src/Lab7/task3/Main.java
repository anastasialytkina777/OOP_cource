package Lab7.task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 0);

        car.accelerate(60);
        car.brake(20);
        car.brake(60);

        car.carInfo();
    }
}
