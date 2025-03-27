package Lab4.task8;

public class Task8 {
    static int counter = 0;


    public static void setCounter(int counter) {

        System.out.println("Локальна змінна counter: " + counter);
    }

    public static void main(String[] args) {

        System.out.println("Глобальна змінна до виклику setCounter(): " + counter);


        setCounter(5);


        System.out.println("Глобальна змінна після виклику setCounter(): " + counter);
    }
}
