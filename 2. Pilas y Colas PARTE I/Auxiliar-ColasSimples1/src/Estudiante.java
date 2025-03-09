import java.util.*;
public class Estudiante {
	private String nombre;
	private String ci;
	private int edad;
	
	// Constructor Por Defecto
	public Estudiante() {
		this.nombre = "";
		this.ci = "";
		this.edad = 0;
	}
	
	// Constructor Con Parametros 
	public Estudiante(String nombre, String ci, int edad) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
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
		return "Estudiante [nombre=" + nombre + ", ci=" + ci + ", edad=" + edad + "]";
	}
	
	// Metodo Leer Estudiante
	public void leerE() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Cedula de Identidad  ---> ");
		this.ci = teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();	
	}
	
	// Metodo Mostrar Estudiante
		public void mostrarE() {
			System.out.println("********************************************************************************" );
			System.out.println(toString());
		}
}
