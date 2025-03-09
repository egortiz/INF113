import java.util.*;
public class Combo {
	private int nroCombo;
	private double precio;
	private String nombre;
	
	// Constructor por Defecto
	public Combo() {
		this.nroCombo = 0;
		this.precio = 0;
		this.nombre = "";
	}
	
	// Constructor con Parametros
	public Combo(int nroCombo, double precio, String nombre) {
		this.nroCombo = nroCombo;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	// Getters y Setters
	public int getNroCombo() {
		return nroCombo;
	}

	public void setNroCombo(int nroCombo) {
		this.nroCombo = nroCombo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// To String
	@Override
	public String toString() {
		return "Combo [nroCombo=" + nroCombo + ", precio=" + precio + ", nombre=" + nombre + "]";
	}
	

	// Metodo Leer Combo
	public void leerC() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------------------- LEER-COMBO ----------------------------");
		
		System.out.print("Número Combo         ---> ");
		this.nroCombo= teclado.nextInt();
		
		System.out.print("Precio               ---> ");
		this.precio= teclado.nextDouble();
		
		System.out.print("Nombre               ---> ");
		this.nombre= teclado.nextLine();
	}
	
	// Metodo Mostrar Combo
		public void mostrarC() {
			System.out.println("*******************************************************************" );
			System.out.println(toString());
		}
}
