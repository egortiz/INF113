import java.util.*;

public class Artesanias {
    private String ci;
    private String nombre;
    private String material;
    private double precio;

    public Artesanias() {
        this.ci = "";
        this.nombre = "";
        this.material = "";
        this.precio = 0;
    }

    public Artesanias(String ci, String nombre, String material, double precio) {
        this.ci = ci;
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
    }

    // Getters y Setters
    public String getci() {
        return ci;
    }

    public void setci(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    // To string
    public String toString() {
        return "Producto [ci=" + ci + ", nombre=" + nombre + ", material=" + material + ", precio=" + precio + "]";
    }

    // Metodo Leer Artesania
    public void leerA() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------------> LEER-PRODUCTO <--------------");
        System.out.print("ci                   ---> ");
        this.ci = teclado.nextLine();

        System.out.print("Nombre               ---> ");
        this.nombre = teclado.nextLine();

        System.out.print("Material             ---> ");
        this.material = teclado.nextLine();

        System.out.print("Precio (bs)          ---> ");
        this.precio = teclado.nextDouble();
    }

    // Metodo Mostrar Artesina
    public void mostrarA() {
        // System.out.println("********************************************************************************");
        System.out.println(toString());
    }
}
