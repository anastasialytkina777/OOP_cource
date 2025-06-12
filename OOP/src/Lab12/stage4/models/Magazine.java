package Lab12.stage4.models;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getInfo() {
        return title + " (Журнал), №" + issueNumber + ", " + year;
    }
}