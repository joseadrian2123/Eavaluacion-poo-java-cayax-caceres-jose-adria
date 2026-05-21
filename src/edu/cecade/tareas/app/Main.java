package edu.cecade.tareas.app;

import edu.cecade.tareas.app.Estudiante;
import edu.cecade.tareas.repositorio.RepositorioMemoriaTareas;
import edu.cecade.tareas.servicio.ServicioTareas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RepositorioMemoriaTareas repo =
                new RepositorioMemoriaTareas();

        ServicioTareas servicio =
                new ServicioTareas(repo);

        Estudiante estudiante1 =
                new Estudiante(
                        "Jose",
                        "2025001",
                        "5to Bach"
                );

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Crear tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar entregada");
            System.out.println("4. Ver porcentaje");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Fecha entrega: ");
                    String fecha = sc.nextLine();

                    servicio.crearTarea(
                            id,
                            titulo,
                            descripcion,
                            fecha,
                            estudiante1
                    );

                    break;

                case 2:

                    servicio.listarTareas();

                    break;

                case 3:

                    System.out.print("Ingrese ID: ");
                    int idEntrega = sc.nextInt();

                    servicio.marcarEntregada(idEntrega);

                    break;

                case 4:

                    servicio.porcentajeEntregadas();

                    break;

                case 0:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}

