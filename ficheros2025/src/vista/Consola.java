package vista;

public class Consola {

    public static void mostrarString(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE GESTIÓN DE INCIDENCIAS ===");
        System.out.println("1. Registrar nueva incidencia");
        System.out.println("2. Mostrar todas las incidencias");
        System.out.println("3. Buscar incidencias por usuario");
        System.out.println("4. Buscar incidencias por fecha");
        System.out.println("0. Salir");
        System.out.println("=======================================");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarTitulo(String titulo) {
        System.out.println("\n--- " + titulo + " ---");
    }

    public static void mostrarError(String error) {
        System.err.println("ERROR: " + error);
    }

    public static void mostrarExito(String mensaje) {
        System.out.println("✓ " + mensaje);
    }

    public static void mostrarSeparador() {
        System.out.println("---------------------------------------");
    }

    public static void limpiarPantalla() {
        System.out.println("\n\n");
    }
}