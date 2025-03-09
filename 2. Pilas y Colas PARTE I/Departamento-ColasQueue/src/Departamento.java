import java.util.*;
public class Departamento {
	private int idDpto;
	private String nombre;
	private String capital;
	private double superficie;
	private double poblacion;
	
	//Constructor por Defecto
	public Departamento() {
		this.idDpto = 0;
		this.nombre = "";
		this.capital = "";
		this.superficie = 0;
		this.poblacion = 0;
	}
	// Constructor con Parametros
	public Departamento(int idDpto, String nombre, String capital, double superficie, double poblacion) {
		this.idDpto = idDpto;
		this.nombre = nombre;
		this.capital = capital;
		this.superficie = superficie;
		this.poblacion = poblacion;
	}
	
	// Getters y Setters
	public int getIdDpto() {
		return idDpto;
	}
	public void setIdDpto(int idDpto) {
		this.idDpto = idDpto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public double getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(double poblacion) {
		this.poblacion = poblacion;
	}
	
	//To String
	@Override
	public String toString() {
		return "Departamento [idDpto=" + idDpto + ", nombre=" + nombre + ", capital=" + capital + ", superficie=" + superficie + ", poblacion=" + poblacion + "]";
	}
	
	
	// Metodo Leer Departamento
	public void leerD() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("------------> LEER-DEPARTAMENTO <-------------" );
		
		System.out.print("Id Departamento      ---> ");
		this.idDpto = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();
			
		System.out.print("Capital              ---> ");
		this.capital = teclado.nextLine();
			
		System.out.print("Superficie (Km2)     ---> ");
		this.superficie = teclado.nextDouble();	
		
		System.out.print("Poblacion            ---> ");
		this.poblacion = teclado.nextDouble();
			
	} 
	
	// Metodo Mostrar Departamento
		public void mostrarD() {
			//System.out.println("********************************************************************************" );
			//System.out.println("-----------> MOSTRAR-DEPARTAMENTO <-----------" );
			System.out.println(toString());
		}
}
