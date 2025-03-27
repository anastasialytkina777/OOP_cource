package Lab4.task4;

public class Task4 {
    public static void printInfo(String name) {
        System.out.println("Ім'я: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Ім'я: " + name + ", Вік: " + age);
    }

    public static void main(String[] args) {

        printInfo("Софія");
        printInfo("Микита", 25);
    }
}
