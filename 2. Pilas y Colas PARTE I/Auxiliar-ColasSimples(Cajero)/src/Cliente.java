import java.util.*;
public class Cliente {
	private String nombre;
	private int ci;
	private int edad;
	
	// Constructor por defecto
	public Cliente() {
		this.nombre = "";
		this.ci = 0;
		this.edad = 0;
	}
	
	// Constructor con Parametros
	public Cliente(String nombre, int ci, int edad) {
		
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

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
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
		return "Cliente [nombre=" + nombre + ", ci=" + ci + ", edad=" + edad + "]";
	}
	
	// Metodo Leer Cliente
	public void leerC() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-------------------------- LEER-CLIENTE ---------------------------");
		System.out.print("Nombre               ---> ");
		this.nombre= teclado.nextLine();
		
		System.out.print("Cedula de Identidad  ---> ");
		this.ci = teclado.nextInt();
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();
	}
	
	// Metodo Mostrar Cliente
	public void mostrarC() {
		//System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}
