package vista;

import modelo.Incidencia;
import modelo.ListaIncidencias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Consola {

    private ListaIncidencias lista;
    private Scanner sc;

    public Consola() {
        lista = new ListaIncidencias();
        sc = new Scanner(System.in);
    }

    public static void mostrarString(String dato) {
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    registrarIncidencia();
                    break;
                case 2:
                    mostrarIncidencias();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Registrar incidencia");
        System.out.println("2. Mostrar incidencias");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private void registrarIncidencia() {
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Excepción: ");
        String excepcion = sc.nextLine();

        System.out.print("Fecha (dd/MM/yyyy): ");
        String fechaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);

        Incidencia inc = new Incidencia(id, fecha, usuario, excepcion);
        lista.agregar(inc);

        System.out.println("Incidencia registrada.");
    }

    private void mostrarIncidencias() {
        lista.mostrarTodas(); // ya imprime si está vacía o no
    }

    // Punto de entrada
    public static void main(String[] args) {
        Consola app = new Consola();
        app.iniciar();
    }
}
