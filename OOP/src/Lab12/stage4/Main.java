package Lab12.stage4;

import java.util.Scanner;

import Lab12.stage4.models.Book;
import Lab12.stage4.models.DVD;
import Lab12.stage4.models.Magazine;
import Lab12.stage4.services.Library;
import Lab12.stage4.handlers.LibraryHandler;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        LibraryHandler handler;
        Scanner scanner = new Scanner(System.in);

        library.addItem(new Book("1984", "George Orwell", 1949));
        library.addItem(new Book("Brave New World", "Aldous Huxley", 1932));
        library.addItem(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
        library.addItem(new Magazine("National Geographic", 2023, 5));
        library.addItem(new DVD("Inception", 2010, 148));
        handler = new LibraryHandler(library);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 5) {
                break;
            }
            handler.handleUserChoice(choice);
        }
        scanner.close();
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
}