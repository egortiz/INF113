import java.util.*;
public class Zona {
	private int idMac;
	private String nombre;
	
	// Constructor por defecto
	public Zona() {
		super();
		this.idMac = 0;
		this.nombre = "";
	}

	// Constructor con parametros
	public Zona(int idMac, String nombre) {
		this.idMac = idMac;
		this.nombre = nombre;
	}
	
	// Getters and Setters
	public int getIdMac() {
		return idMac;
	}

	public void setIdMac(int idMac) {
		this.idMac = idMac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// to String
	@Override
	public String toString() {
		return "Zona [idMac=" + idMac + ", nombre=" + nombre + "]";
	}
	
	// Metodo leer
	public void leerZ() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("idMacrodistrito      ---> ");
		idMac= teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		nombre = teclado.nextLine();
	}
	public void mostrarZ() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
	/*
	// Metodo mostrarZ
	public void mostrarZ() {
		System.out.println("*******************************************************************" );
		System.out.println("idMacrodistrito          : "+this.idMac );
		System.out.println("Nombre                   : "+this.nombre);
	}
	*/	
}
