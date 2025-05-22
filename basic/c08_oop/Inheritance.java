package basic.c08_oop;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

public class Inheritance {

    public static void main(String[] args) {

        // Herencia ("es un")

        var animal = new Animal("Mi animal");
//        animal.name = "Mi animal";
        animal.eat();

        var dog = new Dog("Mou", 3);
//        dog.name = "Mou";
        dog.eat();

        var cat = new Cat("Cou");
//        cat.name = "Cou";
        cat.eat();

        var bird = new Bird("Bou");
//        bird.name = "Bou";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " está comiendo.");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat() {
            System.out.println("El perro con nombre " + name + " está comiendo.");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("Está volando");
        }
    }

}
