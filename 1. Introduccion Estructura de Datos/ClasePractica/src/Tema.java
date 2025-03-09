import java.util.*;
public class Tema {
    private int nroTema;
    private String nombre;

    // Constructor con parametros
    Tema(int a, String b) {
        this.nroTema = a;
        this.nombre = b;
    }
    // Getters y Setters

    public int getNroTema() {
        return nroTema;
    }

    public void setNroTema(int nroTema) {
        this.nroTema = nroTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo mostrar
    public void mostrar() {
        System.out.println("<" + nroTema + " " + nombre + ">");
    }

}
