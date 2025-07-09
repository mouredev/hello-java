package basic.c08_oop;

/*
Clase 67 - Composición
Vídeo: https://youtu.be/JOAqpdM36wI?t=26963
*/

public class Composition {

    public static void main(String[] args) {

        // Composición ("tiene un")

        var car = new Car();
        car.on();
    }

    public static class Engine {

        public void on() {
            System.out.println("Motor encendido");
        }
    }

    public static class Car {

        final private Engine engine = new Engine();

        public void on() {
            engine.on();
        }
    }
}
