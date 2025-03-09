import java.util.*;
public class Alimentos {
	private String nombre;
	private double precio;
	
	// Constructor por Defecto
	public Alimentos() {
		this.nombre = "";
		this.precio = 0;
	}
	
	// Constructor con parametros
	public Alimentos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// toString
	@Override
	public String toString() {
		return "Alimentos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	// Metodo Leer Alimento
	public void leerA() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
			
		System.out.print("Precio(Bs.)          ---> ");
		this.precio = teclado.nextDouble();
		}
	
	// Metodo Mostrar Libro
	public void mostrarA() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}
}
