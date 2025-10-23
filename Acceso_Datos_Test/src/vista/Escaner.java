package vista;

import java.util.Scanner;

public class Escaner {
    private static final Scanner sc = new Scanner(System.in);

    public static int pedirNumero (String mensaje) {
        while (true) {
            try {
                Consola.mostrarString(mensaje);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                Consola.mostrarString("Introduce un número válido.");
            }
        }
    }
    public static void cerrar() {
        sc.close();
    }
}
