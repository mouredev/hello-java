package basic.c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        /*
        Clase 51 - Funciones
        Vídeo: https://youtu.be/JOAqpdM36wI?t=186100
        */

        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        // ...

        sendEmail();

        sendEmailToUser("brais@gmail.com");
        sendEmailToUser("brais@gmail.com", "Brais");

        var users = new ArrayList<>(Arrays.asList("brais@gmail.com", "moure@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("brais@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    /*
    Clase 52 - Funciones sin parámetros ni retorno
    Vídeo: https://youtu.be/JOAqpdM36wI?t=18394
    */

    // Función sin parámetros ni retorno

    public static void sendEmail() {
        System.out.println("Se envía el email");
    }

    /*
    Clase 53 - Funciones con parámetros / Sobrecarga
    Vídeo: https://youtu.be/JOAqpdM36wI?t=18827
    */

    // Función con parámetros

    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

    // Sobrecarga de funciones

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            sendEmailToUser(email);
        }
    }

    /*
    Clase 54 - Funciones con retorno
    Vídeo: https://youtu.be/JOAqpdM36wI?t=19027
    */

    // Función con retorno

    public static boolean sendEmailWithState(String email) {

        if (email.isEmpty()) {
            return false;
        }

        System.out.println("Se envía el email a " + email);
        return true;
    }
}
