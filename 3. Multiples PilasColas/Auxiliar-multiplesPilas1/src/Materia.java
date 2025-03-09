import java.util.*;
public class Materia {
	private String nombre;
	private String sigla;
	private int nroEst;
	
	//Constructor por Defecto
	public Materia() {
		this.nombre = "";
		this.sigla = "";
		this.nroEst = 0;
	}
	
	//Constructor con Parametros
	public Materia(String nombre, String sigla, int nroEst) {
		this.nombre = nombre;
		this.sigla = sigla;
		this.nroEst = nroEst;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getNroEst() {
		return nroEst;
	}

	public void setNroEst(int nroEst) {
		this.nroEst = nroEst;
	}
	
	// To String
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", sigla=" + sigla + ", nroEst=" + nroEst + "]";
	}
	
	// Metodo Leer Estudiante
	public void leerM() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------------> LEER-MATERIA <---------------" );
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Sigla                ---> ");
		this.sigla = teclado.nextLine();
		
		System.out.print("Número Estudiantes   ---> ");
		this.nroEst = teclado.nextInt();
		
		} 
	
	// Metodo Mostrar Estudiante
		public void mostrarM() {
			//System.out.println("********************************************************************************" );
			//System.out.println("--------------> MOSTRAR-MATERIA <-------------" );
			System.out.println(toString());
		}
}
