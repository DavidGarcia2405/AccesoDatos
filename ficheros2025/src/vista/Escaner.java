package vista;

import java.util.Scanner;

public class Escaner {
    private static Scanner sc = new Scanner(System.in);

    public static String pedirString(String dato){
        Consola.mostrarString(dato);
        return sc.nextLine();
    }

    public static int pedirnumero(String dato) {
        Consola.mostrarString(dato);
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }
    public static String pedirUsuario(String usuario){
        Consola.mostrarString(usuario);
        return sc.nextLine();
    }

    public static void cerrar() {
        sc.close();
    }
}
