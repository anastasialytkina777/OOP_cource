package Lab10.task5;

public abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}

