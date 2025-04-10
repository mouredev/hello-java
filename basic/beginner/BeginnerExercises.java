
import java.lang.reflect.Field;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Tu Nombre"; // Cambia "Tu Nombre" por tu nombre real.
        System.out.println("Mi nombre es: " + nombre); // Imprime tu nombre.

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 25; // Cambia 25 por tu edad real.
        System.out.println("Mi edad es: " + edad); // Imprime tu edad.

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.75; // Cambia 1.75 por tu altura real.
        System.out.println("Mi altura es: " + altura + " metros"); // Imprime tu altura.

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gustaProgramar = true; // Cambia true por false si no te gusta programar.
        System.out.println("Me gusta programar: " + gustaProgramar); // Imprime si te gusta programar o no.
        // 5. Declara una constante con tu email.
        final String EMAIL = "mouredev@gmail.com"; // Cambia por tu email real.
        System.out.println("Mi email es: " + EMAIL); // Imprime tu email.
        // Recuerda que las constantes se declaran con la palabra clave final y su valor no puede cambiar.

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char inicial = 'M'; // Cambia 'M' por la inicial de tu nombre.
        System.out.println("Mi inicial es: " + inicial); // Imprime tu inicial.

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Madrid"; // Cambia "Madrid" por tu localidad.
        System.out.println("Mi localidad es: " + localidad); // Imprime tu localidad.

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 3;
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma); 
// Imprime la suma de a y b.


        // 9. Imprime el tipo Y EL NOMBRE de dos variables creadas anteriormente.
        System.out.println("El tipo de la variable a es: " + ((Object)a).getClass().getSimpleName()); // Imprime el tipo de a.
        System.out.println("El tipo de la variable b es: " + ((Object)b).getClass().getSimpleName()); // Imprime el tipo de b.
        for (Field declaredField : a.getClass().getDeclaredFields()) {
            System.err.println("El nombre de la variable a es: " + declaredField.getName());
        }
         // Imprime el nombre de a.
        for (Field declaredField : b.getClass().getDeclaredFields()) {
            System.err.println("El nombre de la variable b es: " + declaredField.getName());
        }
        // Imprime el nombre de b.

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int c; // Declara la variable c sin inicializarla.
        c = 10; // Asigna un valor a c. 
        System.out.println("El valor de c es: " + c); // Imprime el valor de c  .

    }
}
