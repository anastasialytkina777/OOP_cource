package Lab10.task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer wd = new WasherDryer("Samsung");

        wd.turnOn();
        wd.wash();
        wd.dry();


        Appliance a = wd;
        Washable w = wd;
        Dryable d = wd;

        a.turnOn();
        w.wash();
        d.dry();
    }
}

