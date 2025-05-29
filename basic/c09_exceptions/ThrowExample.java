package basic.c09_exceptions;

/*
Clase 8 - Manejo de excepciones, depuración y extras (28/05/2025)
Vídeo: https://www.twitch.tv/videos/2471305243
*/

public class ThrowExample {

    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("La puntuación debe estar entre 0 y 100");
        } else {
            System.out.println("Puntuación válida: " + score);
        }
    }
}
