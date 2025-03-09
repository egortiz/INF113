import java.util.*;
public class Macrodistrito {
	private int idMac;
	private String nombre;
	private String tipo;
	
	// Constructor con parametros
	public Macrodistrito(int idMac, String nombre, String tipo) {
		super();
		this.idMac = idMac;
		this.nombre = nombre;
		this.tipo = tipo;
	}
	// Constructor por defecto
	public Macrodistrito() {
		super();
		this.idMac = 0;
		this.nombre = "";
		this.tipo = "";
	}
	// Getters y Setters
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// To Straing
	@Override
	public String toString() {
		return "Macrodistrito [idMac=" + idMac + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	// Metodo leer
	public void leerM() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("idMacrodistrito      ---> ");
		idMac= teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		nombre = teclado.nextLine();
		
		System.out.print("Tipo                 ---> ");
		tipo = teclado.next();
	}
	public void mostrarM() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
	/*
	// Metodo mostrarM
	public void mostrarM() {
		System.out.println("*******************************************************************" );
		System.out.println("idMacrodistrito          : "+this.idMac );
		System.out.println("Nombre                   : "+this.nombre);
		System.out.println("Tipo                     : "+this.tipo);
	}
	*/
}
