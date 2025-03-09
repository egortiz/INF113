import java.util.*;
public class Zona {
	private int idZona;
	private String nombre;
	private String distrito;
	
	// Constructor por defecto
	public Zona() {
		this.idZona = 0;
		this.nombre = "";
		this.distrito = "";
	}
	
	// Constructor con parametros
	public Zona(int idZona, String nombre, String distrito) {
		this.idZona = idZona;
		this.nombre = nombre;
		this.distrito = distrito;
	}
	
	// Getters y Setters
	public int getIdZona() {
		return idZona;
	}
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	//To String
	@Override
	public String toString() {
		return "Zona [idZona=" + idZona + ", nombre=" + nombre + ", distrito=" + distrito + "]";
	}
	
	//Metodo Leer Zona
	public void leerZ() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-ZONA <-----------------" );
		
		System.out.print("Id. Zona             ---> ");
		this.idZona = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Distrito             ---> ");
		this.distrito = teclado.nextLine();
	}
	
	//Metodo Mostrar Zona
	public void mostrarZ() {
	//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	

}
