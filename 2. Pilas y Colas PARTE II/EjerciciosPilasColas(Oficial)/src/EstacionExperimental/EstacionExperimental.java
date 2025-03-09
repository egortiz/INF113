package EstacionExperimental;
import java.util.*;
public class EstacionExperimental {
	private String idEstudiante;
	private String nombre;
	private String direccion;
	
	// Constructor por defecto
	public EstacionExperimental() {
		this.idEstudiante = "";
		this.nombre = "";
		this.direccion = "";
	}
	
	// Constructor con Parametros
	public EstacionExperimental(String idEstudiante, String nombre, String direccion) {
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.direccion = direccion;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// To String
	@Override
	public String toString() {
		return "EstacionExperimental [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	// Metodo leer Estacion Experimental
	public void leerE() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------------> LEER-ESTACION <--------------" );
		System.out.print("Id Estudiante        ---> ");
		this.idEstudiante = teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Direccion            ---> ");
		this.direccion = teclado.nextLine();
	}
	
	// Metodo Mostrar Estacion Experimental
	public void mostrarE() {
	//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
