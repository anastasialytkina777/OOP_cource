package Lab12.stage4;

public class DVD extends LibraryItem {
    private int duration;  // длительность в минутах

    public DVD(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return title + " (DVD), " + duration + " хвилин, " + year;
    }
}

