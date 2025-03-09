import java.util.*;
public class Practica {
    private String fecha;
    private String nombre;
    private int nroTema;
    private int nota;

    // Constructor con parametros
    Practica(String a, String b, int c, int d) {
        this.fecha = a;
        this.nombre = b;
        this.nroTema = c;
        this.nota = d;
    }
    // Getters and Setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroTema() {
        return nroTema;
    }

    public void setNroTema(int nroTema) {
        this.nroTema = nroTema;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    // Metodo mostrar
    public void mostrar() {
        System.out.println("[" + fecha + " " + nombre + " " + nroTema + " " + nota + "]");
    }

}
