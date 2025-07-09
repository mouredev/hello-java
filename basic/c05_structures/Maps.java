package basic.c05_structures;

/*
Clase 43 - Maps
Vídeo: https://youtu.be/JOAqpdM36wI?t=14574
*/

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.put("Brais", "brais@gmail.com");
        names.put("Moure", "moure@gmail.com");
        names.put("MoureDev", "mouredev@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso

        System.out.println(names.get("Moure"));
        System.out.println(names.get("Dev"));

        // Verificación

        System.out.println(names.containsKey("Moure"));
        System.out.println(names.containsKey("Dev"));

        System.out.println(names.containsValue("moure@gmail.com"));

        // Eliminación

        System.out.println(names.remove("Moure"));
        System.out.println(names.remove("MoureDev"));
        System.out.println(names);

        // Limpieza

        names.clear();
        System.out.println(names);

        // Modificación

        names.put("Brais", "brais@gmail.com");
        System.out.println(names);

        names.put("Brais", "braismouredev@gmail.com");
        System.out.println(names);

        names.replace("Moure", "mouredev@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Moure", "mouredev@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
     }
}
