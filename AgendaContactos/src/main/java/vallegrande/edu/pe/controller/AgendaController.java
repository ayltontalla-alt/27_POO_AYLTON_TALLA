package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;
import java.util.List;

public class AgendaController {
    private List<Contacto> contactos;

    public AgendaController() {
        this.contactos = new ArrayList<>();
    }

    // 1. Agregar Contacto
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("\n Contacto registrado correctamente.");
    }

    // 2. Listar Contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("\n La agenda está vacía. No hay contactos para mostrar.");
            return;
        }
        System.out.println("\n=== LISTA DE CONTACTOS ===");
        for (Contacto contacto : contactos) {
            contacto.mostrarContacto();
        }
    }

    // 3. Buscar Contacto por Nombre o Apellido (Coincidencia parcial o exacta)
    public void buscarPorNombreOApellido(String textoBusqueda) {
        if (contactos.isEmpty()) {
            System.out.println("\n La agenda está vacía.");
            return;
        }

        String termino = textoBusqueda.toLowerCase();
        List<Contacto> resultados = new ArrayList<>();

        for (Contacto c : contactos) {
            if (c.getNombres().toLowerCase().contains(termino) ||
                    c.getApellidos().toLowerCase().contains(termino)) {
                resultados.add(c);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("\n No se encontraron contactos que coincidan con: '" + textoBusqueda + "'");
        } else {
            System.out.println("\n RESULTADOS DE LA BÚSQUEDA (" + resultados.size() + "):");
            for (Contacto c : resultados) {
                c.mostrarContacto();
            }
        }
    }

    // 4. Eliminar Contacto por ID
    public boolean eliminarContactoPorId(int id) {
        boolean eliminado = contactos.removeIf(contacto -> contacto.getId() == id);
        if (eliminado) {
            System.out.println("\n🗑 Contacto con ID " + id + " eliminado con éxito.");
        } else {
            System.out.println("\n No se encontró ningún contacto con el ID: " + id);
        }
        return eliminado;
    }
}
