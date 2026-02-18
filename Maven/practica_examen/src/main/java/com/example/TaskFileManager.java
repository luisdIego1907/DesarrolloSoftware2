package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class TaskFileManager {

    private static final String PATH = "Tasks.json";

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private final Type listType = new TypeToken<ArrayList<Task>>() {
    }.getType();

    public List<Task> readAll() {

        try (
                FileReader reader = new FileReader(PATH);)

        {

            List<Task> tasks = gson.fromJson(reader, listType);

            return (tasks == null) ? new ArrayList<>() : tasks;

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeAll(List<Task> tasks) {

        try (FileWriter writer = new FileWriter(PATH);) {

            gson.toJson(tasks, listType, writer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean insert(Task newTask) {

        if (newTask == null)
            return false;

        List<Task> tasks = readAll();

        boolean exists = tasks.stream().anyMatch(t -> t.getId() == newTask.getId());

        if (exists) {

            throw new TaskInvalidException("Ya existe una persona con dicho id");
        }
        tasks.add(newTask);

        writeAll(tasks);

        return true;
    }

    public Task getById(int id) {

        List<Task> tasks = readAll();

        for (Task t : tasks) {

            if (t.getId() == id) {

                return t;
            }
        }

        throw new TaskInvalidException("No existe una task con dicho id");
    }

    public boolean update(Task updatedTask) {

        if (updatedTask == null)
            return false;

        List<Task> tasks = readAll();

        for (int i = 0; i < tasks.size(); i++) {

            if (tasks.get(i).getId() == updatedTask.getId()) {

                tasks.set(i, updatedTask);

                writeAll(tasks);

                return true;
            }
        }
        return false;
    }

    public boolean delete(int eliminateTaskId) {

        List<Task> tasks = readAll();

        boolean removed = tasks.removeIf(t -> t.getId() == eliminateTaskId);

        if (removed) {
            writeAll(tasks);
            return true;
        }

        throw new TaskInvalidException("No existe una task con dicho id");
    }

    public boolean updateState(int taskId) {

        List<Task> tasks = readAll();

        for (int i = 0; i < tasks.size(); i++) {

            if (tasks.get(i).getId() == taskId) {

                tasks.get(i).setCompleted(true);

                writeAll(tasks);

                return true;
            }
        }

        throw new TaskInvalidException("No existe una task con dicho id");
    }

    public boolean updateTask(int taskId){

        List<Task> tasks = readAll();

        for(int i = 0 ; i < tasks.size() ; i++){

            if (tasks.get(i).getId() == taskId) {
                
                IOManager.print("Digite el nuevo titulo");

                String newTitle = IOManager.readString(); 

                IOManager.print("Digite la nueva descripcion");

                String newDescription = IOManager.readString();

                Priority newPriority = priorityInsertion();

                tasks.get(i).setTitle(newTitle);

                tasks.get(i).setDescription(newDescription);

                tasks.get(i).setPriority(newPriority);

                writeAll(tasks);
                return true;
            }
        }

        throw new TaskInvalidException("No existe una task con dicho id");
    }

    private Priority priorityInsertion() {

        IOManager.print("Digite la prioridad 1=Alta , 2=Media y 3=Baja");

        int eleccion = IOManager.readInt();

        Priority priority;

        switch (eleccion) {
            case 1 -> priority = Priority.HIGH;
            case 2 -> priority = Priority.MEDIUM;
            case 3 -> priority = Priority.LOW;
            default -> throw new AssertionError();
        }

        return priority;
    }
}
