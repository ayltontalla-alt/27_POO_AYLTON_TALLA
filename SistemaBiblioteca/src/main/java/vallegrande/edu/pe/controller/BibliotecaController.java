package vallegrande.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;
import vallegrande.edu.pe.model.Estudiante;
import vallegrande.edu.pe.model.Libro;

public class BibliotecaController {
    private List<Libro> libros = new ArrayList<>();
    private List<Estudiante> estudiantes = new ArrayList<>();

    //METODOS LIBRO
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado correctamente.");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        System.out.println("LISTA DE LIBROS");
        for (Libro libro : libros) {
            libro.mostrarLibro();
        }
    }

    public void buscarLibro(String criterio) {
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(texto) ||
                    libro.getAutor().toLowerCase().contains(texto)) {
                libro.mostrarLibro();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun libro");
        }
    }

    //METODOS ESTUDIANTE
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante registrado correctamente.");
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("LISTA DE ESTUDIANTES");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarEstudiante();
        }
    }

    public void buscarEstudiante(String criterio) {
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().toLowerCase().contains(texto) ||
                    estudiante.getCarrera().toLowerCase().contains(texto)) {
                estudiante.mostrarEstudiante();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun estudiante");
        }
    }
}
