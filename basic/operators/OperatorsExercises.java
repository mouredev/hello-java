package basic.operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma = 5 + 3; // Suma de 5 y 3.
        int resta = 10 - 4; // Resta de 10 y 4.
        int multiplicacion = 6 * 7; // Multiplicación de 6 y 7.
        int division = 25 / 5; // División de 25 y 5.       
        int modulo = 10 % 3; // Módulo de 10 y 3.
        // Puedes usar el operador de incremento (++) o decremento (--) para modificar el valor de una variable.


        // 2. Crea una variable para cada tipo de operación de asignación.    
        int a = 10; // Asignación de 10 a la variable a.    
        a += 5; // Suma 5 a la variable a (equivalente a a = a + 5).
        a -= 3; // Resta 3 a la variable a (equivalente a a = a - 3).
        a *= 2; // Multiplica 2 a la variable a (equivalente a a = a * 2).
        a /= 4; // Divide 4 a la variable a (equivalente a a = a / 4).
        a %= 3; // Módulo 3 a la variable a (equivalente a a = a % 3).
        // Puedes usar el operador de incremento (++) o decremento (--) para modificar el valor de una variable.    
        System.out.println(a); // Imprime el valor de a después de las operaciones. 

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(5 > 3); // 5 es mayor que 3.
        System.out.println(10 < 20); // 10 es menor que 20.
        System.out.println(7 >= 7); // 7 es mayor o igual que 7.    
        System.out.println(25 <= 30); // 25 es menor o igual que 30.
        System.out.println(12 == 12); // 12 es igual a 12.
        System.out.println(5 != 3); // 5 es diferente a 3.

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(5 < 3); // 5 no es menor que 3.
        System.out.println(10 > 20); // 10 no es mayor que 20.
        System.out.println(7 <= 7); // 7 no es menor o igual que 7.
        System.out.println(25 >= 30); // 25 no es mayor o igual que 30.
        System.out.println(12 != 12); // 12 no es diferente a 12.       

        // 5. Utiliza el operador lógico and.
        boolean andResult = (5 > 3) && (10 < 20); // Ambas condiciones son verdaderas.
        System.out.println(andResult); // Imprime el resultado de la operación AND. 

        // 6. Utiliza el operador lógico or.
        boolean orResult = (5 < 3) || (10 > 20); // Al menos una condición es verdadera.
        System.out.println(orResult); // Imprime el resultado de la operación OR.

        // 7. Combina ambos operadores lógicos.
        boolean combinedResult = (5 > 3) && (10 < 20) || (7 == 7); // Al menos una condición es verdadera.
        System.out.println(combinedResult); // Imprime el resultado de la combinación de operadores lógicos.

        // 8. Añade alguna negación.
        boolean negationResult = !(5 > 3); // La negación de la condición es falsa.
        System.out.println(negationResult);


        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int x = 5;
        System.out.println(-x); // Imprime el valor negativo de x.
        System.out.println(+x); // Imprime el valor positivo de x.
        System.out.println(++x); // Incrementa x en 1 y luego lo imprime.    
        System.out.println(--x); // Decrementa x en 1 y luego lo imprime.    
        System.out.println(x++); // Imprime el valor de x y luego lo incrementa en 1.

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int y = 10;
        int z = 5;
        boolean result = (y + z == 15) && (y > z); // Combinación de operadores aritméticos, de comparación y lógicos.
        System.out.println(result);
    }
}
