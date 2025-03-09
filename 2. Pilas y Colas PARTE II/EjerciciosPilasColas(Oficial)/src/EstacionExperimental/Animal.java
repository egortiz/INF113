package EstacionExperimental;

import java.util.Scanner;

public class Animal {
	private String idEstudiante;
	private String nombre;
	private String variedad;
	private int cantidad;
	private int edad;
	
	// Constructor por Defecto
	public Animal() {
		this.idEstudiante = "";
		this.nombre = "";
		this.variedad = "";
		this.cantidad = 0;
		this.edad = 0;
	}
	
	// Constructor con Parametros
	public Animal(String idEstudiante, String nombre, String variedad, int cantidad, int edad) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.variedad = variedad;
		this.cantidad = cantidad;
		this.edad = edad;
	}
	
	// Getters y Setters
	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
		return "Animal [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", variedad=" + variedad + ", cantidad=" + cantidad + ", edad=" + edad + "]";
	}
	
	// Metodo Leer Animal
	public void leerA() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-ANIMAL <---------------" );
		
		System.out.print("Id Estudiante        ---> ");
		this.idEstudiante = teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Variedad             ---> ");
		this.variedad = teclado.nextLine();
		
		System.out.print("Cantidad             ---> ");
		this.cantidad = teclado.nextInt();
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();
	}
	
	// Metodo Mostrar Animal
	public void mostrarA() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
