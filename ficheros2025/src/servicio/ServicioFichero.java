package servicio;

import modelo.Incidencia;
import modelo.ListaIncidencias;
import repositorio.Fichero;
import vista.Escaner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ServicioFichero {
    private static final String ruta = "datos/incidencias.txt";

    public static void guardar(LocalDate fecha, LocalTime hora, String tipoExcepcion, String usuario) {
        Incidencia incidencia1 = new Incidencia(fecha, hora, tipoExcepcion, usuario);
        Fichero log = new Fichero(ruta);

        log.escribirFichero(incidencia1.toString());
    }

    public static void guardar(Incidencia miIncidencia) {
        Fichero log = new Fichero(ruta);

        log.escribirFichero(miIncidencia.toString());
    }

    public static ArrayList<Incidencia> buscarPorUsuario(String usuario, ListaIncidencias datos) {

        ArrayList<Incidencia>listaFiltradaPorUsuario = new ArrayList<Incidencia>();

        for (Incidencia linea : datos.getIncidencias()) {

            if (linea.getUsuario().equalsIgnoreCase(usuario)) {
                listaFiltradaPorUsuario.add(linea);
            }
        }
        return listaFiltradaPorUsuario;
    }


    public static ArrayList<String> buscarPorFecha(LocalDate fechaIni, LocalDate fechaFin, ListaIncidencias datos) {

        String fechaIniStr = Escaner.pedirString("Dime la fecha Inicial");
        fechaIni = LocalDate.parse(fechaIniStr);

        String fechaFinStr = Escaner.pedirString("Dime la fecha Final");
        fechaFin = LocalDate.parse(fechaFinStr);

        ArrayList<String>listaFiltradaPorFecha = new ArrayList<String>();

        for (Incidencia linea : datos.getIncidencias()) {
            if (linea.getFecha().isAfter(fechaIni) || linea.getFecha().isEqual(fechaIni) &&
            linea.getFecha().isBefore(fechaFin) || linea.getFecha().isEqual(fechaFin)){

                listaFiltradaPorFecha.add(linea);
            }
        }
        return listaFiltradaPorFecha;
    }
}
