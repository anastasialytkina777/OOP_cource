package Lab12.stage4;

public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected boolean available = true;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
    }


    public boolean isAvailable() {
        return available;
    }


    public void borrowItem() {
        if (available) {
            available = false;
            System.out.println("✅ Ви взяли: " + getInfo());
        } else {
            System.out.println("❌ Предмет недоступний.");
        }
    }


    public void returnItem() {
        available = true;
        System.out.println("🔄 Ви повернули: " + getInfo());
    }


    public abstract String getInfo();
}
