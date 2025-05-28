package Lab12.stage1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> library = new ArrayList<>(Arrays.asList(
                "1984 - George Orwell (1949)",
                "Brave New World - Aldous Huxley (1932)",
                "Fahrenheit 451 - Ray Bradbury (1953)"
        ));
        List<String> borrowed = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Переглянути книги");
            System.out.println("2. Позичити книгу");
            System.out.println("3. Повернути книгу");
            System.out.println("4. Вийти");
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("📚 Книги в бібліотеці:");
                    for (int i = 0; i < library.size(); i++) {
                        System.out.println((i + 1) + ". " + library.get(i));
                    }
                }
                case 2 -> {
                    System.out.print("Номер книги для позики: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < library.size()) {
                        borrowed.add(library.remove(index));
                        System.out.println("✅ Книгу позичено.");
                    } else {
                        System.out.println("❌ Невірний номер.");
                    }
                }
                case 3 -> {
                    System.out.println("📦 Позичені книги:");
                    for (int i = 0; i < borrowed.size(); i++) {
                        System.out.println((i + 1) + ". " + borrowed.get(i));
                    }
                    System.out.print("Номер книги для повернення: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < borrowed.size()) {
                        library.add(borrowed.remove(index));
                        System.out.println("🔁 Книгу повернено.");
                    } else {
                        System.out.println("❌ Невірний номер.");
                    }
                }
                case 4 -> {
                    System.out.println("👋 До зустрічі!");
                    return;
                }
                default -> System.out.println("❌ Невірна опція.");
            }
        }
    }
}
