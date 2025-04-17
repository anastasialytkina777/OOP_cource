package Lab8.task3;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }


    public void makeSound() {
        System.out.println(name + " says: Bark");
    }


    public void walking() {
        System.out.println(name + " is walking...");
    }
}


