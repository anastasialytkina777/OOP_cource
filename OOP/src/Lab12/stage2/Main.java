package Lab12.stage2;

import java.util.*;

public class Main {
    static List<String> library = new ArrayList<>(Arrays.asList(
            "1984 - George Orwell (1949)",
            "Brave New World - Aldous Huxley (1932)",
            "Fahrenheit 451 - Ray Bradbury (1953)"
    ));
    static List<String> borrowed = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    static void showMenu() {
        System.out.println("\n=== МЕНЮ ===");
        System.out.println("1. Переглянути книги");
        System.out.println("2. Позичити книгу");
        System.out.println("3. Повернути книгу");
        System.out.println("4. Вийти");
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
        scanner.nextLine(); // очищення буфера
        switch (choice) {
            case 1 -> viewBooks();
            case 2 -> borrowBook();
            case 3 -> returnBook();
            case 4 -> {
                System.out.println("👋 До побачення!");
                System.exit(0);
            }
            default -> System.out.println("❌ Невірна опція.");
        }
    }

    static void viewBooks() {
        if (library.isEmpty()) {
            System.out.println("📭 У бібліотеці немає книг.");
        } else {
            System.out.println("📚 Доступні книги:");
            for (int i = 0; i < library.size(); i++) {
                System.out.println((i + 1) + ". " + library.get(i));
            }
        }
    }

    static void borrowBook() {
        viewBooks();
        System.out.print("Введіть номер книги: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < library.size()) {
            borrowed.add(library.remove(index));
            System.out.println("✅ Книгу додано до позичених.");
        } else {
            System.out.println("❌ Невірний номер.");
        }
    }

    static void returnBook() {
        if (borrowed.isEmpty()) {
            System.out.println("📭 У вас немає позичених книг.");
        } else {
            System.out.println("📦 Позичені книги:");
            for (int i = 0; i < borrowed.size(); i++) {
                System.out.println((i + 1) + ". " + borrowed.get(i));
            }
            System.out.print("Введіть номер книги для повернення: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < borrowed.size()) {
                library.add(borrowed.remove(index));
                System.out.println("🔁 Книгу повернено.");
            } else {
                System.out.println("❌ Невірний номер.");
            }
        }
    }
}