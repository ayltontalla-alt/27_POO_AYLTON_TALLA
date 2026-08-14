package vallegrande.edu.pe.view;

import java.util.Scanner;

public class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        this.scanner = new Scanner(System.in);
    }

    // Mostrar Título
    public void mostrarTitulo() {
        System.out.println("=================================");
        System.out.println("     AGENDA DE CONTACTOS     ");
        System.out.println("=================================");
    }

    // Menú de navegación interactivo (Opciones 1 al 5)
    public void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Registrar Contacto");
        System.out.println("2. Listar Contactos");
        System.out.println("3. Buscar Contacto (por nombre/apellido)");
        System.out.println("4. Eliminar Contacto (por ID)");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción (1-5): ");
    }

    // Métodos auxiliares para capturar datos de la consola
    public String pedirCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. " + mensaje);
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return numero;
    }

    // Mostrar Mensaje genérico
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}