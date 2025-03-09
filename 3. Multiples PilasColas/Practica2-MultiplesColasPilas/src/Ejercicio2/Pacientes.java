package Ejercicio2;
import java.util.*;

public class Pacientes {
	private String nombre;
	private String dolencia;
	private int edad;
	
	
	// Constructor por Defecto
	public Pacientes() {
		this.nombre = "";
		this.dolencia = "";
		this.edad = 0;
	}
	
	// Constructor con Parametros
	public Pacientes(String nombre, String dolencia, int edad) {
		super();
		this.nombre = nombre;
		this.dolencia = dolencia;
		this.edad = edad;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDolencia() {
		return dolencia;
	}

	public void setDolencia(String dolencia) {
		this.dolencia = dolencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//To string
	@Override
	public String toString() {
		return "Pacientes [nombre=" + nombre + ", dolencia=" + dolencia + ", edad=" + edad + "]";
	}
	
	// Metodo Leer Paciente
    public void leerP() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("---------------> LEER-PACIENTE <---------------" );
    	
    	System.out.print("Nombre                 ---> ");
    	this.nombre = teclado.nextLine();
    	
    	System.out.print("Dolencia               ---> ");
    	this.dolencia = teclado.nextLine();
    	
    	System.out.print("Edad                   ---> ");
    	this.edad = teclado.nextInt();	
    }
    
 // Metodo Mostrar Paciente
   	public void mostrarP() {
   		//System.out.println("********************************************************************************");
   		System.out.println(toString());
   	}
}
