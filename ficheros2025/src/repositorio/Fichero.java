package repositorio;


import java.io.*;

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

    @Override
    public String toString() {
        return "Fichero{" +
                "ruta='" + ruta + '\'' +
                '}';
    }

    public static void leerFichero() {
        String cadena;
        FileReader fichero;
        BufferedReader lector;

        try {
            fichero = new FileReader("datos/incidencia.txt");
            lector = new BufferedReader(fichero);

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
        }

    }

    public void escribirFichero(String dato) {
        //conectará y añadirá la línea al fichero
        FileWriter fichero = null;

        try {
            fichero = new FileWriter("datos/incidencias.txt", true);
            fichero.write(dato + "\n");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");

        } finally {
            try {
                if (fichero != null){
                    fichero.close();
                }
            } catch(IOException e) {
                System.out.println("Error al cerrar el FileWriter");
            }
        }
    }
}


