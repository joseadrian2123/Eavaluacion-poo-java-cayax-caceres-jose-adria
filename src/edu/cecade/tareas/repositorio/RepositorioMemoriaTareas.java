package edu.cecade.tareas.repositorio;

import edu.cecade.tareas.app.Tareas;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoriaTareas implements RepositorioTareas {

    private ArrayList<Tareas> tareas;

    public RepositorioMemoriaTareas() {
        tareas = new ArrayList<>();
    }

    @Override
    public void guardar(Tareas tarea) {
        tareas.add(tarea);
    }

    @Override
    public List<Tareas> listar() {
        return tareas;
    }

    @Override
    public Tareas buscarPorId(int id) {

        for (Tareas tarea : tareas) {
            if (tarea.getId() == id) {
                return tarea;
            }
        }

        return null;
    }
}