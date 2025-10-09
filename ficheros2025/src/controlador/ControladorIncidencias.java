package controlador;

import modelo.ListaIncidencias;
import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Consola;
import vista.Escaner;

import java.util.Scanner;

public class ControladorIncidencias {

    public static void iniciar(){
        Scanner sc = new Scanner(System.in);
        ListaIncidencias lista = new ListaIncidencias();

        //pedir usuario
        String usuario = Escaner.pedirString("Introduce el nombre de usuario:");
        //mostrar menu
        Consola.mostrarMenu();
        //introducir datos
        Escaner.pedirnumero("Introduce el numero de la opcion");
        //buscar usuario
        ServicioFichero.buscarPorUsuario();
        // bucar fecha
        ServicioFichero.buscarPorFecha();

    }
}
