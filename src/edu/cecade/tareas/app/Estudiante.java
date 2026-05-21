package edu.cecade.tareas.app;

public class Estudiante extends Usuario {
    private String grado;
    public Estudiante(String nombre, String carnet,String grado){
        super(nombre, carnet);
        this.grado = grado;
    }

    public String getGrado(){
        return grado;
    }
    public void setGrado(String grado){

    }
    @Override
    public void mostrarInfo(){
        System.out.println("Estudiante:" + nombre +"|carnet:" + carnet + "|grado:"+ grado);
    }
}
