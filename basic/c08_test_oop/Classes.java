package basic.c08_test_oop;

/*
Clase 59 - Modificadores de acceso
Vídeo: https://youtu.be/JOAqpdM36wI?t=21542
*/

import basic.c08_oop.Person;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Brais", 38, "123456789A");

//        person.name = "Brais";
//        person.age = 38;

        person.sayHello();

//        person.name = "Brais Moure";
//        System.out.println(person.name);
    }
}