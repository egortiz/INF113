import java.util.*;
public class Estudiante {
	private String nombre;
	private String apellido;
	private String ci;
	private int semestre;
	private double promedio;
	
	// Constructor por defecto
	public Estudiante() {
		this.nombre = "";
		this.apellido = "";
		this.ci = "";
		this.semestre = 0;
		this.promedio = 0;
	}
	
	// Constructor con Parametros
	public Estudiante(String nombre, String apellido, String ci, int semestre, double promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.semestre = semestre;
		this.promedio = promedio;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	// To string
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", Semestre=" + semestre + ", promedio=" + promedio + "]";
	}
	
	// Metodo Leer Estudiante
	public void leerE() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-ESTUDIANTE <-------------" );
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Apellido             ---> ");
		this.apellido = teclado.nextLine();
		
		System.out.print("Cedula Identidad     ---> ");
		this.ci = teclado.nextLine();
		
		System.out.print("Semestre             ---> ");
		this.semestre = teclado.nextInt();
		
		System.out.print("Promedio             ---> ");
		this.promedio = teclado.nextInt();
		} 
	
	// Metodo Mostrar Estudiante
	public void mostrarE() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}
}
