package Lab6.task2;

class CarProcedural {

    public static void main(String[] args) {

        String brand = "Audi";
        String model = "A6";
        int speed = 0;


        speed = accelerate(speed, 30);


        printCarInfo(brand, model, speed);
    }

    public static int accelerate(int currentSpeed, int increase) {
        return currentSpeed + increase;
    }

    public static void printCarInfo(String brand, String model, int speed) {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Швидкість: " + speed + " км/год");
    }
}

