package edu.cecade.tareas.util;

public class Validador {

    public static boolean textoVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }
}