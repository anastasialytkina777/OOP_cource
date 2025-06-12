package Lab12.stage4.handlers;

import java.util.ArrayList;
import java.util.List;

import Lab12.stage4.errors.ItemNotFoundException;
import Lab12.stage4.models.LibraryItem;
import Lab12.stage4.services.Library;

public class LibraryHandler {
    private final Library library;
    private final List<LibraryItem> borrowedItems = new ArrayList<>();

    public LibraryHandler(Library library) {
        this.library = library;
    }

    public void handleUserChoice(int choice) {
        try {
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
        catch (ItemNotFoundException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    private void borrowItem() throws ItemNotFoundException {
        library.listAvailableItems();
        int number = UserInputHandler.getIntInput("Введіть номер книги, яку хочете позичити: ");
        LibraryItem item = library.borrowItem(number);
        if (item != null) {
            borrowedItems.add(item);
            return;
        }
        throw new ItemNotFoundException("Предмет з номером \'" + number + "\' не знайдено");
    }

    private void returnItem() throws ItemNotFoundException {
        if (borrowedItems.isEmpty()) {
            System.out.println("📭 Ви не позичали жодних книг.");
            return;
        }
        System.out.println("\n📦 Ваші позичені книги:");
        for (int i = 0; i < borrowedItems.size(); i++) {
            System.out.println((i + 1) + ". " + borrowedItems.get(i).getInfo());
        }
        int number = UserInputHandler.getIntInput("Введіть номер книги для повернення: ");
        if (number > 0 && number <= borrowedItems.size()) {
            LibraryItem item = borrowedItems.remove(number - 1);
            library.returnItem(item);
        } else {
            throw new ItemNotFoundException("Предмет не знайдено");
        }
    }
}