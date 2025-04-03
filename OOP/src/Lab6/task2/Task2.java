package Lab6.task2;

 class CarOOP {

    public static void main(String[] args) {
        Car myCar = new Car("Audi", "A6");
        myCar.accelerate(30);
        myCar.printInfo();
    }
}

class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int increase) {
        speed += increase;
    }

    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Швидкість: " + speed + " км/год");
    }
}






