package edu.cecade.tareas.app;

public abstract class Usuario {
    protected String nombre;
    protected String carnet;
    public Usuario(String nombre, String carnet){
        this.nombre = nombre;
        this.carnet = carnet;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCarnet(){
        return carnet;
    }
    public void setCarnet(String carnet) {
     this.carnet = carnet;
    }
    public abstract void mostrarInfo();

}
