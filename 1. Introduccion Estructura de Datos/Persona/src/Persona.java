import java.util.*;
public class Persona {
	private String nombre;
	private int edad;
	private int ci;
	
	// Constructor por Defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.ci = 0;
	}
	
	// Constructor con Parametros
	public Persona(String nombre, int edad, int ci) {
		this.nombre = nombre;
		this.edad = edad;
		this.ci = ci;
	}
	
	// Getters y Setters
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

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	// ToString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", ci=" + ci + "]";
	}
	
	// Metodo leer
	public void leerP() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Nombre               ---> ");
		this.nombre= teclado.nextLine();
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();
		
		System.out.print("Cedula de Identidad  ---> ");
		this.ci = teclado.nextInt();
	}
	
	// Metodo mostrar
	public void mostrarP() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}
