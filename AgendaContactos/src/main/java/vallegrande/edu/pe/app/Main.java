package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();

        view.mostrarTitulo();

        boolean continuar = true;
        int contadorId = 1; // Generador automático de IDs

        while (continuar) {
            view.mostrarMenu();
            int opcion = view.pedirEntero("");

            switch (opcion) {
                case 1:
                    // Registrar Contacto
                    view.mostrarMensaje("\n--- REGISTRAR NUEVO CONTACTO ---");
                    String nombres = view.pedirCadena("Nombres           : ");
                    String apellidos = view.pedirCadena("Apellidos         : ");
                    String direccion = view.pedirCadena("Dirección         : ");
                    String telefono = view.pedirCadena("Teléfono          : ");
                    String correo = view.pedirCadena("Correo Electrónico: ");

                    Contacto nuevo = new Contacto(contadorId++, nombres, apellidos, direccion, telefono, correo);
                    controller.agregarContacto(nuevo);
                    break;

                case 2:
                    // Listar Contactos
                    controller.listarContactos();
                    break;

                case 3:
                    // Buscar Contacto
                    view.mostrarMensaje("\n--- BÚSQUEDA DE CONTACTOS ---");
                    String termino = view.pedirCadena("Ingrese nombre o apellido a buscar: ");
                    controller.buscarPorNombreOApellido(termino);
                    break;

                case 4:
                    // Eliminar Contacto
                    view.mostrarMensaje("\n--- ELIMINAR CONTACTO ---");
                    int idEliminar = view.pedirEntero("Ingrese el ID del contacto a eliminar: ");
                    controller.eliminarContactoPorId(idEliminar);
                    break;

                case 5:
                    // Salir
                    view.mostrarMensaje("\n Saliendo del sistema. ¡Hasta luego!");
                    continuar = false;
                    break;

                default:
                    view.mostrarMensaje("\n Opción no válida. Elija un número entre 1 y 5.");
            }
        }
    }
}