package Lab6.task1;

 class Person {

        private String name;
        private int age;


        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public void introduce() {
            System.out.println("Привіт, мене звати " + name + ", мені " + age + " років.");
        }


        public static void main(String[] args) {
            Person person1 = new Person("Анастасія", 18);
            person1.introduce();
        }
    }


