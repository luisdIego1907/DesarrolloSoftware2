package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        Person person = new Person("Luis", 20, true);

        /*
         * String json = gson.toJson(person);
         * 
         * System.out.print(json);
         */
/* 
        try (
                FileWriter writer = new FileWriter("person.json");
            ) 
        {
            gson.toJson(person, writer);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
*/
/* 
        try(
            FileReader reader = new FileReader("person.json");
        ){
            Person person2 = gson.fromJson(reader, Person.class);

            System.out.println(person2);

        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }*/

          try(
            FileReader reader = new FileReader("person.json");
        ){
            Type type = new TypeToken<ArrayList<Person>>() {}.getType();

            List<Person> people = gson.fromJson(reader, type);

            for(Person p : people){
                System.out.println(p.getName());
            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
      
    }
}