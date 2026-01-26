package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PeopleManager {

    private final String FILE_PATH = "people.json";
    private final Gson gson = new Gson();

    private List<Person> readFile() {

        try (

                FileReader reader = new FileReader(FILE_PATH)

        ) {

            Type listType = new TypeToken<ArrayList<Person>>() {
            }.getType();

            List<Person> people = gson.fromJson(reader, listType);

            return (people != null) ? people : new ArrayList<>();

        } catch (Exception e) {

            return new ArrayList<>();
        }

    }

    private void writeFile(List<Person> people) {

        try (

                FileWriter writer = new FileWriter(FILE_PATH)) {

            gson.toJson(people, writer);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void insert(Person person) {

        List<Person> people = readFile();

        people.add(person);

        writeFile(people);
    }

    public Person getById(int id) {

        List<Person> people = readFile();

        for (Person person : people) {

            if (person.getId() == id) {

                return person;
            }
        }
        return null;
    }

    public boolean update(Person updatedPerson) {
        /*
            Falto validar si la persona es null
         */

        if(updatedPerson == null){

            return false;
        }
        
        List<Person> people = readFile();

        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).getId() == updatedPerson.getId()) {

                people.set(i, updatedPerson);

                writeFile(people);

                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {

        List<Person> people = readFile();

        boolean removed = people.removeIf(p -> p.getId() == id);

        if (removed) {

            writeFile(people);

        }
        return removed;
    }

    public List<Person> getAll() {
        return readFile();
    }
}
