package basic.helloworld;

import java.util.Scanner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("¡Hola Mundo!"); // Cambia "¡Hola Mundo!" por tu nombre.

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo"); // Usa "\n" para saltar a la siguiente línea.


        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // Este es un comentario de una sola línea.

        // 4. Crea un comentario en varias líneas.
        /* Este es un comentario
           en varias líneas. */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Mi edad es 25");
        System.out.println("Mi color favorito es Azul");
        System.out.println("Mi ciudad es Madrid");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        // Puedes usar System.err para imprimir mensajes de error.
        System.err.println("Este es un mensaje de error"); // Imprime un mensaje de error.

        System.out.println("Esto es un mensaje de advertencia"); // Imprime un mensaje de advertencia.

        System.out.println("Esto es un mensaje de información"); // Imprime un mensaje de información.
Scanner sc = new Scanner(System.in);
String nombre = sc.nextLine();
System.out.println("Hola " + nombre);

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Mi nombre es " + "Brais");
        System.out.println("Mi edad es " + 37);
        System.out.println("Mi ciudad es " + "Madrid");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  ^_^  ");
        System.out.println(" (o o) ");
        System.out.println(" / \\ ");   

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // El programa no compilará porque el método main es el punto de entrada de la aplicación.
        // Si lo eliminas, obtendrás un error de compilación que dice "Main method not found".
        // Puedes intentar comentar el método main y compilarlo para ver el error.


        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // Si lo cambias, obtendrás un error de compilación que dice "Main method not found".

    }
}