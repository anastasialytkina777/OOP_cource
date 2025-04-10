package Lab7.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 59);
        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();

        clock.setHours(25);
        clock.setMinutees(60);
        clock.setSeconds(60);

        clock.setHours(6);
        clock.setMinutees(45);
        clock.setSeconds(30);

        clock.displayTime();
        clock.tick();
        clock.displayTime();
    }
}
