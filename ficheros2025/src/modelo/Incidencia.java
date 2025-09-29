package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Incidencia {

    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private String usuario;
    private String excepcion;

    public Incidencia(int id, LocalDate fecha, String usuario, String excepcion) {
        this.id = id;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.usuario = usuario;
        this.excepcion = excepcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", usuario='" + usuario + '\'' +
                ", excepcion='" + excepcion + '\'' +
                '}';
    }
}

