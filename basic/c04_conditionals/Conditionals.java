package basic.c04_conditionals;

/*
Clase 35 - Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=9908
*/

public class Conditionals {

    public static void main(String[] args) {

        // Condicionales

        /*
        Clase 36 - Sentencia if
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9978
        */

        // if, else if, else

        var age = 18;

        System.out.println(age >= 18);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        /*
        Clase 37 - Sentencia switch
        Vídeo: https://youtu.be/JOAqpdM36wI?t=10678
        */

        // switch

        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
    }
}
