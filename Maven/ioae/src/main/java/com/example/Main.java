package com.example;

public class Main {
    public static void main(String[] args) {

        PeopleManager manager = new PeopleManager();

        // Insert nueva persona
        manager.insert(new Person(100, "Alejandro", 43, false));

        // Get by id
        System.out.print(manager.getById(5));

        // Update Person

        System.out.println(manager.update(new Person(100, "Juan", 10, false)) ? "Persona actualizada "
                : "No se encontro el id para actualizar");

        manager.getAll().stream().forEach(person -> System.out.println(person.toString()));

        // Delete
        System.out.println(manager.delete(100) ? " Persona eliminada " : " No se encontro dicho id");

        // Imprime todos los valores
        // manager.getAll().stream().forEach(person
        // ->System.out.println(person.toString()));

        manager.getAll().stream().forEach(System.out::println);
    }
}