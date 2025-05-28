package Lab12.stage4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Library library = new Library();
    static List<LibraryItem> borrowedItems = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        library.addItem(new Book("1984", "George Orwell", 1949));
        library.addItem(new Book("Brave New World", "Aldous Huxley", 1932));
        library.addItem(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
        library.addItem(new Magazine("National Geographic", 2023, 5));
        library.addItem(new DVD("Inception", 2010, 148));

        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    static void showMenu() {
        System.out.println("\n=== МЕНЮ ===");
        System.out.println("1. Переглянути всі книги в бібліотеці");
        System.out.println("2. Переглянути доступні книги");
        System.out.println("3. Позичити книгу");
        System.out.println("4. Повернути книгу");
        System.out.println("5. Вийти");
        System.out.print("Ваш вибір: ");
    }

    static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Введіть номер опції: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static void handleUserChoice(int choice) {
        scanner.nextLine(); // очистка буфера після nextInt()

        switch (choice) {
            case 1 -> library.listAllItems();
            case 2 -> library.listAvailableItems();
            case 3 -> borrowItem();
            case 4 -> returnItem();
            case 5 -> {
                System.out.println("👋 До побачення!");
                System.exit(0);
            }
            default -> System.out.println("❌ Невірна опція.");
        }
    }

    static void borrowItem() {
        library.listAvailableItems();
        System.out.print("Введіть номер книги, яку хочете позичити: ");
        int number = getUserChoice();
        LibraryItem item = library.borrowItem(number);
        if (item != null) {
            borrowedItems.add(item);
        }
    }

    static void returnItem() {
        if (borrowedItems.isEmpty()) {
            System.out.println("📭 Ви не позичали жодних книг.");
            return;
        }
        System.out.println("\n📦 Ваші позичені книги:");
        for (int i = 0; i < borrowedItems.size(); i++) {
            System.out.println((i + 1) + ". " + borrowedItems.get(i).getInfo());
        }
        System.out.print("Введіть номер книги для повернення: ");
        int number = getUserChoice();
        if (number > 0 && number <= borrowedItems.size()) {
            LibraryItem item = borrowedItems.remove(number - 1);
            library.returnItem(item);
        } else {
            System.out.println("❌ Невірний номер.");
        }
    }
}

