import java.util.*;
public class Zona {
	private int nroDistrito;
	private double superficie;
	private String nombre;
	
	// Constructor por defecto
	public Zona() {
		this.nroDistrito = 0;
		this.superficie = 0;
		this.nombre = "";
	}
	// Constructor con parametros
	public Zona(int nroDistrito, double superficie, String nombre) {
		super();
		this.nroDistrito = nroDistrito;
		this.superficie = superficie;
		this.nombre = nombre;
	}
	// Getters y Setters
	public int getNroDistrito() {
		return nroDistrito;
	}
	public void setNroDistrito(int nroDistrito) {
		this.nroDistrito = nroDistrito;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public String getNombreString() {
		return nombre;
	}
	public void setNombreString(String nombreString) {
		this.nombre = nombreString;
	}
	
	// To String
	@Override
	public String toString() {
		return "Zona [nroDistrito=" + nroDistrito + ", superficie=" + superficie + ", nombre=" + nombre + "]";
	}
	
	//Metodo Leer Zona
	public void leerZ() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-ZONA <-----------------" );
		
		System.out.print("Nro. Distrito        ---> ");
		this.nroDistrito = teclado.nextInt();
		
		System.out.print("Superficie           ---> ");
		this.superficie = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();	
	}
	//Metodo Mostrar Zona
	public void mostrarZ() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}
}
