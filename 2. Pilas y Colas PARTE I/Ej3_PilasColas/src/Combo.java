import java.util.*;

public class Combo {
	private int nroCombo;
	private String nombre;
	private double precio;
	
	// Constructor por defecto
	public Combo() {
		this.nroCombo = 0;
		this.nombre = "";
		this.precio = 0;
	}
	
	// Constructor con parametros
	public Combo(int nroCombo, String nombre, double precio) {
		super();
		this.nroCombo = nroCombo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	// Getters y setters
	public int getNroCombo() {
		return nroCombo;
	}
	public void setNroCombo(int nroCombo) {
		this.nroCombo = nroCombo;
	}
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

	
	// To String 
	@Override
	public String toString() {
		return "Combo [nroCombo=" + nroCombo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	// Metodo Leer Combo
	public void leerC() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-COMBO <---------------" );
		
		System.out.print("Nro. Combo           ---> ");
		this.nroCombo = teclado.nextInt();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		teclado.nextLine();
		
		System.out.print("Precio               ---> ");
		this.precio = teclado.nextDouble();
	}
	// Metodo Mostrar Combo
	public void mostrarC() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}		
}
