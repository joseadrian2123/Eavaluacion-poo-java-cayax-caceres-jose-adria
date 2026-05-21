package edu.cecade.tareas.servicio;

import edu.cecade.tareas.app.Estudiante;
import edu.cecade.tareas.app.Tareas;
import edu.cecade.tareas.repositorio.RepositorioTareas;
import edu.cecade.tareas.util.Validador;

public class ServicioTareas {

    private RepositorioTareas repositorio;

    public ServicioTareas(RepositorioTareas repositorio) {
        this.repositorio = repositorio;
    }

    public void crearTarea(int id, String titulo,
                           String descripcion,
                           String fecha,
                           Estudiante estudiante) {

        if (Validador.textoVacio(titulo) ||
                Validador.textoVacio(descripcion)) {

            System.out.println("Error: datos vacíos.");
            return;
        }

        if (repositorio.buscarPorId(id) != null) {
            System.out.println("Error: ID repetido.");
            return;
        }

        Tareas tarea = new Tareas(
                id,
                titulo,
                descripcion,
                fecha,
                estudiante
        );

        repositorio.guardar(tarea);

        System.out.println("Tarea creada correctamente.");
    }

    public void listarTareas() {

        for (Tareas tarea : repositorio.listar()) {
            tarea.mostrarInfo();
        }
    }

    public void marcarEntregada(int id) {

        Tareas tarea = repositorio.buscarPorId(id);

        if (tarea == null) {
            System.out.println("La tarea no existe.");
            return;
        }

        tarea.marcarEntregada();

        System.out.println("Tarea entregada.");
    }

    public void porcentajeEntregadas() {

        int total = repositorio.listar().size();
        int entregadas = 0;

        for (Tareas tarea : repositorio.listar()) {

            if (tarea.isEntregada()) {
                entregadas++;
            }
        }

        if (total == 0) {
            System.out.println("No hay tareas.");
            return;
        }

        double porcentaje =
                (double) entregadas / total * 100;

        System.out.println(
                "Porcentaje entregadas: " +
                        porcentaje + "%"
        );
    }
}