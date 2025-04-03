package Lab6.task3;


     class AnimalArray {

        public static void main(String[] args) {

            Animal[] animals = new Animal[3];

            animals[0] = new Animal("Кіт", "Мяу");
            animals[1] = new Animal("Собака", "Гав");
            animals[2] = new Animal("Корова", "Муу");


            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }


    class Animal {
        private String name;
        private String sound;


        public Animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }


        public void makeSound() {
            System.out.println(name + " видає звук: " + sound);
        }
    }


