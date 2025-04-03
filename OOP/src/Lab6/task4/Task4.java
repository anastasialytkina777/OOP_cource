package Lab6.task4;

class CounterExample {

        public static void main(String[] args) {

            Counter c1 = new Counter();
            Counter c2 = new Counter();

            c1.increment();
            c1.increment();
            c2.increment();

            System.out.println("Counter c1: " + c1.getCount()); // Очікуємо 2
            System.out.println("Counter c2: " + c2.getCount()); // Очікуємо 1


            StaticCounter.increment();
            StaticCounter.increment();
            StaticCounter.increment();

            System.out.println("StaticCounter: " + StaticCounter.getCount()); // Очікуємо 3
        }
    }


    class Counter {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }


    class StaticCounter {
        private static int count = 0;

        public static void increment() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }


