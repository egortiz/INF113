import java.util.*;

public class Ninio {
	private String nombre;
	private int edad;

	// Constructor por Defecto
	public Ninio() {
		this.nombre = "";
		this.edad = 0;
	}
	
	// Constructor con Parametros
	public Ninio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
	
	// To String
	@Override
	public String toString() {
		return "Ninio [nombre=" + nombre + ", edad=" + edad + "]";
	}
	// Metodo Leer Niño
    public void leerN() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("----------------> LEER-NINIO <----------------" );
    	
    	System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();
		
		System.out.println("----------------------------------------------" );
	}
    
    // Metodo Mostrar Niño
 	public void mostrarN() {
 		//System.out.println("********************************************************************************" );
 		System.out.println(toString());
 	}	
}
