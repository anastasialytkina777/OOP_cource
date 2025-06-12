package Lab12.stage4.models;

import Lab12.stage4.util.Reservable;

public class Book extends LibraryItem implements Reservable {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return title + " - " + author + " (" + year + ")";
    }

    @Override
    public void reserve() {
        System.out.println("🔖 Книга '" + title + "' успішно зарезервована.");
    }
}