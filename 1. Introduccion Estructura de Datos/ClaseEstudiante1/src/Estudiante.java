import java.util.*;
public class Estudiante {
	private String nombre;
	private int ci;
	private String promedio;
	
	// Constructor por defecto
	public Estudiante() {
		super();
		nombre = "";
		ci = 0;
		promedio = "";
	}
	// Constructor con parametros
	public Estudiante(String nombre, int ci, String promedio) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.promedio = promedio;
	}
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getPromedio() {
		return promedio;
	}
	public void setPromedio(String promedio) {
		this.promedio = promedio;
	}
	// To String
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", ci=" + ci + ", promedio=" + promedio + "]";
	}
	// Metodo Mostrar
	public void mostrar() {
		System.out.println(toString());
	}
	// Metodo Leer
	public void leer() {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Nombre    ----> ");
		this.nombre = teclado.next();
		
		System.out.print("C.I.      ----> ");
		this.ci = teclado.nextInt();
		
		System.out.print("Promedio  ----> ");
		this.promedio = teclado.next();
	}
}
