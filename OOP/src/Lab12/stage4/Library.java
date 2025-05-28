package Lab12.stage4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    // Добавить предмет в библиотеку
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Вывести все предметы
    public void listAllItems() {
        System.out.println("\n📚 Всі предмети бібліотеки:");
        for (int i = 0; i < items.size(); i++) {
            LibraryItem item = items.get(i);
            System.out.printf("%d. %s %s\n", i + 1, item.getInfo(),
                    item.isAvailable() ? "(доступний)" : "(позичено)");
        }
    }

    // Вывести только доступные предметы
    public void listAvailableItems() {
        System.out.println("\n📚 Доступні предмети бібліотеки:");
        int count = 0;
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println((count + 1) + ". " + item.getInfo());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("  Немає доступних предметів.");
        }
    }

    // Взять предмет по номеру из списка доступных
    public LibraryItem borrowItem(int number) {
        int count = 0;
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                count++;
                if (count == number) {
                    item.borrowItem();
                    return item;
                }
            }
        }
        System.out.println("❌ Невірний номер предмета.");
        return null;
    }

    // Вернуть предмет обратно
    public void returnItem(LibraryItem item) {
        if (item != null) {
            item.returnItem();
        }
    }
}
