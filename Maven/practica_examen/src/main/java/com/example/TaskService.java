package com.example;

import java.util.List;

public class TaskService {

    private final TaskFileManager taskFileManager = new TaskFileManager();

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

    private Task createTask() {

        IOManager.print("Digite el id");

        int id = IOManager.readInt();

        IOManager.print("Digite el titulo");

        String title = IOManager.readString();

        IOManager.print("Digite la descripcion");

        String description = IOManager.readString();

        Priority priority = priorityInsertion();

        return new Task(id, title, description, priority, false);

    }

    public boolean addTask() {

        try {

            Task task = createTask();

            return taskFileManager.insert(task);

        } catch (TaskInvalidException e) {

            IOManager.print("Error: " + e.getMessage());
            return false;
        }

    }

    public void listTasks() {

        List<Task> tasks = taskFileManager.readAll();

        tasks.stream().forEach(System.out::println);
    }

    public boolean markCompleted() {

        IOManager.print("Digite el id del task a marcar como completado");

        int taskId = IOManager.readInt();

        try {

            return taskFileManager.updateState(taskId);

        } catch (TaskInvalidException e) {
            IOManager.print("No existe una task con dicho id " + e.getCause());
            return false;
        }

    }

    public boolean updateTask() {

        try {

            IOManager.print("Digite la id del task");

            int taskId = IOManager.readInt();

            return taskFileManager.updateTask(taskId);

        } catch (TaskInvalidException e) {
            IOManager.print("ERROR en updateTask: " + e.getCause());
            return false;
        }

    }

    public boolean removeTask() {

        try {

            IOManager.print("Digite el id del task a eliminar");

            int removeTaskId = IOManager.readInt();

            return taskFileManager.delete(removeTaskId);

        } catch (TaskInvalidException e) {
            IOManager.print("ERROR en removeTask: " + e.getCause());
            return false;
        }
    }

    public Task getTaskById(){

        try {
            IOManager.print("Digite el id del task a obtener");

            int id = IOManager.readInt();

            return taskFileManager.getById(id);
            
        } catch (TaskInvalidException e) {
            IOManager.print("Error en el getTaskById " + e.getCause());
            return null;
        }
    }
}
