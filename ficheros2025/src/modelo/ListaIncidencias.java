package modelo;


import java.util.ArrayList;

public class ListaIncidencias {

    private ArrayList<Incidencia> incidencias;

    // Constructor para inicializar la lista
    public ListaIncidencias() {
        incidencias = new ArrayList<>();
    }

    public void agregar(Incidencia i) {
        incidencias.add(i);
    }

    public ArrayList<Incidencia> getIncidencias() {
        return incidencias;
    }

}
