import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;

    // Constructor
    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    // Método para registrar
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("¡Contacto registrado exitosamente!");
    }

    // Método para mostrar
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.println("\n--- LISTA DE CONTACTOS ---");
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    // Método para buscar por nombre
    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\nContacto encontrado:");
                System.out.println(c);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con el nombre: " + nombre);
        }
    }
}
