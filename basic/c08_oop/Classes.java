package basic.c08_oop;

/*
Clase 57 - Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=19902
*/

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Brais", -38, "123456789A");

//        person.name = "Brais";
//        person.age = 38;

        person.sayHello();

        person.name = "Brais Moure";
        System.out.println(person.name);

//        person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("MoureDev", 18, "123456789B");
        person2.sayHello();
    }
}