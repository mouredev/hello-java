package basic.c08_oop;

/*
Clase 63 - Polimorfismo
Vídeo: https://youtu.be/JOAqpdM36wI?t=24505
*/

public class Polymorphism {

    public static void main(String[] args) {


        // Polimorfismo

        // - Polimorfismo por herencia (sobrescritura)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // - Polimorfismo por sobrecarga (sobrecarga de métodos)

        var calculator = new Calculator();
        System.out.println(calculator.sum(3, 5));
        System.out.println(calculator.sum(3.2, 5.4));
    }

    // - Polimorfismo por herencia (sobrescritura)

    public static class Animal {

        public void sound() {
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    // - Polimorfismo por sobrecarga (sobrecarga de métodos)

    public static class Calculator {

        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }

        public double sum(double a, double b) {
            return a + b;
        }
    }
}
