import java.util.*;
public class Estudiante {
	private String ci;
	private String nombre;
	private String paterno;
	private String materno;
	
	// Construictor por defecto
	public Estudiante() {
		this.ci = "";
		this.nombre = "";
		this.paterno = "";
		this.materno = "";
	}
	
	// Constructor con parametros
	public Estudiante(String ci, String nombre, String paterno, String materno) {
		this.ci = ci;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
	}
	
	// Getters y Setters
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

	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
	// Metodo leer
	public void leerE() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("C.I.       -----> ");
		ci = teclado.next();
		
		System.out.print("Nombre     -----> ");
		nombre = teclado.next();
		
		System.out.print("Paterno    -----> ");
		paterno = teclado.next();
		
		System.out.print("Materno    -----> ");
		materno = teclado.next();
			
	}
	
	// To string
	@Override
	public String toString() {
		return "Estudiante [ci=" + ci + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + "]";
	}
	
	// Metodo Mostrar
	public void mostrarE() {
		System.out.println(toString());
	}
	
	
	
	
	
	
	
	
	

}
