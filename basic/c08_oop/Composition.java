package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
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
