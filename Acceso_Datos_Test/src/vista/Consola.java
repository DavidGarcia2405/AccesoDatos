package vista;

public class Consola {

    public static void mostrarString(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== NUMERO DE PREGUNTAS QUE QUIERES RECIBIR ===");
        System.out.println("1. Una pregunta");
        System.out.println("2. Dos preguntas");
        System.out.println("3. Tres preguntas");
        System.out.println("5. Cinco preguntas");
        System.out.println("6. Seis preguntas");
        System.out.println("7. Siete preguntas");
        System.out.println("8. Ocho preguntas");
        System.out.println("9. Nueve preguntas");
        System.out.println("10. Diez preguntas");
        System.out.println("0. Salir");
        System.out.println("=======================================");
        System.out.print("Seleccione una opción: ");
    }
}

