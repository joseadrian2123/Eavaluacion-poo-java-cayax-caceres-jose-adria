package edu.cecade.tareas.app;

public class Tareas {

    private int id;
    private String titulo;
    private String descripcion;
    private String fechaEntrega;
    private boolean entregada;
    private Estudiante estudiante;

    public Tareas(int id, String titulo, String descripcion,
                 String fechaEntrega, Estudiante estudiante) {

        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.estudiante = estudiante;
        this.entregada = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public boolean isEntregada() {
        return entregada;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void marcarEntregada() {
        entregada = true;
    }

    public void mostrarInfo() {
        System.out.println(
                "ID: " + id +
                        " | Título: " + titulo +
                        " | Estado: " + (entregada ? "Entregada" : "Pendiente") +
                        " | Estudiante: " + estudiante.getNombre()
        );
    }
}
