import java.util.*;

public class Expositor {
    private String ci;
    private String nombre;
    private String paterno;
    private String materno;

    // Constructor por Defecto
    public Expositor() {
        this.ci = "";
        this.nombre = "";
        this.paterno = "";
        this.materno = "";
    }

    // COnstructor con Parametros
    public Expositor(String ci, String nombre, String paterno, String materno) {
        this.ci = ci;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    // Getter y Setters
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String Materno) {
        this.materno = materno;
    }

    // To String
    public String toString() {
        return "Producto <ci=" + ci + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ">";
    }

    // Metodo Leer Expositor
    public void leerE() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------------> LEER-EXPOSITOR <-------------");

        System.out.print("Cedula Identidad     ---> ");
        this.nombre = teclado.nextLine();

        System.out.print("Nombre               ---> ");
        this.nombre = teclado.nextLine();

        System.out.print("Paterno              ---> ");
        this.paterno = teclado.nextLine();

        System.out.print("Materno              ---> ");
        this.materno = teclado.nextLine();
    }

    // Metodo Mostrar Expositor
    public void mostrarE() {
        // System.out.println("********************************************************************************");
        System.out.println(toString());
    }

}
