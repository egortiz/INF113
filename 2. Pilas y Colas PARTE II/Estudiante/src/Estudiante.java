import java.util.*;
public class Estudiante {
	private String ci;
	private String nombre;
	private int edad;

	// Constructor por Defecto
	public Estudiante() {
		this.ci = "";
		this.nombre = "";
		this.edad = 0;
	}
	
	// Constructor con Parametros
	public Estudiante(String ci, String nombre, int edad) {
		this.ci = ci;
		this.nombre = nombre;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	// To String
	@Override
	public String toString() {
		return "Estudiante [ci=" + ci + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	

	// Metodo Leer Estudiante
	public void leerE() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Cedula de Identidad  ---> ");
		this.ci = teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre= teclado.nextLine();
		
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();
	}

	

	// Metodo Mostrar Estudiante
	public void mostrarE() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}
