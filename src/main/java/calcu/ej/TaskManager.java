package calcu.ej;

import java.util.ArrayList;

// Crea una clase TaskManager que permita agregar, eliminar y listar tareas.
// Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
// correctamente, como 
// 1) agregar una tarea, 2) eliminar una tarea existente y 3) listar las tareas disponibles.

public class TaskManager {
  
  ArrayList<String> tasks;

  public TaskManager() {
    tasks = new ArrayList<>();
  }

  public String addTask(String task) {
    tasks.add(task);
    if (!tasks.isEmpty()) return "Added."; else return "Not added.";
  }

  public boolean removeTask(String task) {
    if (tasks.contains(task)) {
      tasks.remove(task);
      return true;
    } else {
      return false;
    }
  }

  public int tasksList() {
    System.out.println(tasks);
    return tasks.size();
  }

}
