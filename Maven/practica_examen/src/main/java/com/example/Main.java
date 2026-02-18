package com.example;

public class Main {
    public static void main(String[] args) {

        boolean c = true;


        TaskService taskService = new TaskService();

        String menu = "=== TODO MANAGER ===\r\n" + //
                "1. Agregar tarea\r\n" + //
                "2. Listar tareas\r\n" + //
                "3. Marcar tarea como completada\r\n" + //
                "4. Actualizar tarea\r\n" + //
                "5. Eliminar tarea\r\n" + //
                "6. Ver tarea por ID\r\n" + //
                "7. Salir";

        while (c) {

            IOManager.print(menu);

            int value = IOManager.readInt();

            switch (value) {
                case 1 -> {
                    
                    IOManager.print( taskService.addTask() ? "Se agrego correctament" : "Hubo un error");
                }
                case 2 -> {

                    taskService.listTasks();
                }
                case 3 -> {
                    IOManager.print(taskService.markCompleted() ? "Se marco como completada" : "Hubo un error en el proceso");
                }
                case 4 -> {

                    IOManager.print( taskService.updateTask() ? "Se actualizo dicha task" : "Hubo un error en el proceso");
                }
                case 5 -> {
                    IOManager.print( taskService.removeTask() ? "Se elimino dicha task" : "Hubo un error en el proceso de eliminacion");
                }
                case 6 -> {
                    Task task = taskService.getTaskById();
                    
                    IOManager.print( (task != null) ? task.toString() : "Hubo un error en la obtencion" );
                }
                case 7 -> {
                    System.exit(0);
                }
                default -> throw new AssertionError();
            }
        }
    }

}