import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = 0;

        do {
            System.out.println("\n=== AGENDA DE CONTACTOS ===");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar búfer
            } else {
                System.out.println("Entrada no válida. Ingrese un número.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el email: ");
                    String email = scanner.nextLine();

                    // Creación del objeto Contacto e instanciación
                    Contacto nuevoContacto = new Contacto(nombre, telefono, email);
                    agenda.agregarContacto(nuevoContacto);
                    break;

                case 2:
                    agenda.mostrarContactos();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 4:
                    System.out.println("Saliendo de la aplicación...");
                    break;

                default:
                    System.out.println("Opción inválida. Seleccione entre 1 y 4.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}