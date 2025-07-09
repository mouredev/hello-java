package basic.c05_structures;

/*
Clase 42 - Sets
Vídeo: https://youtu.be/JOAqpdM36wI?t=13502
*/

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Brais");
        names.add("Moure");
        names.add("MoureDev");
        names.add("mouredev@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminación

        names.remove("Brais");
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("mouredev@gmail.com"));

        System.out.println(names);
        names.add("Moure");
        names.add("Moure");
        names.add("Moure");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("MoureDev");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}
