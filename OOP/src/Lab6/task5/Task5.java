package Lab6.task5;

 class BookExample {

        public static void main(String[] args) {

            Book book1 = new Book("Задуха", "Чак Паланік");
            Book book2 = new Book("Механічний апельсин", "Ентоні Берджес");


            book1.printInfo();
            book2.printInfo();
        }
    }

    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Book(String title) {
            this.title = title;
            this.author = "Невідомий";
        }

        public void printInfo() {
            System.out.println("Назва: " + title);
            System.out.println("Автор: " + author);
            System.out.println("-----------------------");
        }
    }


