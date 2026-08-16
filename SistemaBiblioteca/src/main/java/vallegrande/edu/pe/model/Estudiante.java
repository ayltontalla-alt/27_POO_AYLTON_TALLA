package vallegrande.edu.pe.model;

public class Estudiante {
    //ATRIBUTOS
    private int id;
    private String nombre;
    private String carrera;

    //CONSTRUCTOR
    public Estudiante(int id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCarrera() {
        return carrera;
    }

    //MOSTRAR ESTUDIANTE
    public void mostrarEstudiante() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("-----------------------");
    }
}