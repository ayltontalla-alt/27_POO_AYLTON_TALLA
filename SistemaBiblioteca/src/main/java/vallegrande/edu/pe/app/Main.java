package vallegrande.edu.pe.app;

import java.util.Scanner;
import vallegrande.edu.pe.controller.BibliotecaController;
import vallegrande.edu.pe.model.Estudiante;
import vallegrande.edu.pe.model.Libro;
import vallegrande.edu.pe.view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            view.mostrarTitulo();
            view.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Titulo:");
                    String titulo = scanner.nextLine();
                    System.out.println("Autor:");
                    String autor = scanner.nextLine();
                    System.out.println("Año:");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    if (titulo.isEmpty() || autor.isEmpty() || anio <= 0) {
                        System.out.println("Datos no validos");
                    } else {
                        Libro libro = new Libro(id, titulo, autor, anio);
                        controller.agregarLibro(libro);
                    }
                    break;
                case 2:
                    controller.listarLibros();
                    break;
                case 3:
                    System.out.println("Ingrese Titulo o Autor");
                    String criterio = scanner.nextLine();
                    controller.buscarLibro(criterio);
                    break;
                case 4:
                    System.out.println("ID:");
                    int idEst = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Carrera:");
                    String carrera = scanner.nextLine();

                    if (nombre.isEmpty() || carrera.isEmpty()) {
                        System.out.println("Datos no validos");
                    } else {
                        Estudiante estudiante = new Estudiante(idEst, nombre, carrera);
                        controller.agregarEstudiante(estudiante);
                    }
                    break;
                case 5:
                    controller.listarEstudiantes();
                    break;
                case 6:
                    System.out.println("Ingrese Nombre o Carrera");
                    String criterioEst = scanner.nextLine();
                    controller.buscarEstudiante(criterioEst);
                    break;
                case 7:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7);

        scanner.close();
    }
}