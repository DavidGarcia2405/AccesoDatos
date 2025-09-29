package repositorio;

import modelo.ListaIncidencias;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fichero {
    private String ruta;

    public Fichero(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }


    public void addDato(String dato) {

        //Añadir la linea al fichero

    }

    public String buscarDato(String dato) {

        //Añadir la linea al fichero
        return "";

    }

    public String buscarDato(String dato, int columna) {

        //Añadir la linea al fichero
        return "";

    }

    public String buscarDato(LocalDate fechaInicial, LocalDate fechaFinal) {

        //Añadir la linea al fichero
        return "";

    }

    public ArrayList<String> leerFichero(String dato) {

        //Añadir la linea al fichero
        return null;

    }

    private static void leerFichero() {
        String cadena = null;
        FileReader fichero = null;
        BufferedReader lector = null;

        try {
            fichero = new FileReader("datos/incidencia.txt");
            lector = new BufferedReader(fichero);

            // Primer lectura antes de entrar al bucle
            do {
                cadena = lector.readLine();
                if (cadena != null) {
                    System.out.println(cadena);
                }
            } while (cadena != null);

        } catch (FileNotFoundException e) {
            System.out.println("No encuentro el fichero");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        } finally {


            try {
                if (lector != null) lector.close();
                if (fichero != null) fichero.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    } private static void escribirFichero(String dato){
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("data/personas.txt", true);
            fichero.write(dato);
        }catch (IOException e){
            //throw new RunTimeException(e);
        }
    }
}

