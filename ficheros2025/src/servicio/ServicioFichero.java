package servicio;

import modelo.Incidencia;
import modelo.Pokemon;
import repositorio.Fichero;

import java.time.LocalDate;

public class ServicioFichero {
    public static void añadir(String tipo, String nombre){
        Incidencia miIncidencia = new Incidencia(1, , "David", "excepcion");
        Fichero ListaIncidencias = new Fichero("datos/incidencia.txt");
        ListaIncidencias.addDato(miIncidencia.toString());
    }

    public  static void añadir (Incidencia miIncidencia){
        Fichero ListaIncidencias = new Fichero("datos/incidencia.txt");
        ListaIncidencias.addDato(ListaIncidencias.toString());
    }
    //arreglar todo esto
}
