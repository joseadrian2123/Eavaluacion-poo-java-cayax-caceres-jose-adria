package edu.cecade.tareas.repositorio;

import edu.cecade.tareas.app.Tareas;
import java.util.List;

public interface RepositorioTareas {

    void guardar(Tareas tarea);

    List<Tareas> listar();

    Tareas buscarPorId(int id);
}
