import controlador.ControladorIncidencias;
import modelo.Incidencia;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String cadena= "2025-09-18;14:01:00;excepción 3;usuario1";
        String[] datos=null;
        datos= new String[4];

        datos = cadena.split(";");

        System.out.println(Arrays.toString(datos));

        Incidencia fallo = new Incidencia(datos[0], datos[1], datos[2], datos[3]);
    }
}