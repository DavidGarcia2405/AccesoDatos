package modelo;

import java.util.ArrayList;

public class ListaIncidencias {

    private ArrayList<Incidencia> lista;

    // Constructor para inicializar la lista
    public ListaIncidencias() {
        lista = new ArrayList<>();
    }

    public void agregar(Incidencia i) {
        lista.add(i);
    }

    public void mostrarTodas() {
        if (lista.isEmpty()) {
            System.out.println("No hay incidencias.");
        } else {
            for (Incidencia i : lista) {
                System.out.println(i);
            }
        }
    }
}
