package basic.c01_beginner;

/*
Clase 16 - Tipos de datos primitivos
Vídeo: https://youtu.be/JOAqpdM36wI?t=6211
*/

public class DataTypes {

    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.77;
        System.out.println(myDouble);

        // float, long, byte

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());
    }
}
