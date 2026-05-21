package edu.cecade.tareas.app;

import edu.cecade.tareas.app.Usuario;

public class Docente extends Usuario {

    private String codigo;
    private String curso;

    public Docente(String nombre, String carnet, String codigo, String curso) {
        super (nombre, carnet);
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre +
                " | Curso: " + curso +
                " | Código: " + codigo);
    }
}
