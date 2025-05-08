package Lab10.task2;

public class Main {
    public static void main(String[] args) {
        Playable[] instruments = new Playable[2];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();

        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}

