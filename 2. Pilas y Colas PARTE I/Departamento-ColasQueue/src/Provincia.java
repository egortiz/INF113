import java.util.*;
public class Provincia {
	private int idProv;
	private String nombre;
	private String capital;
	private double superficie;
	private double poblacion;
	
	// Constructor por Defecto
	public Provincia() {
		super();
		this.idProv = 0;
		this.nombre = "";
		this.capital = "";
		this.superficie = 0;
		this.poblacion = 0;
	}
	
	
	// Constructor con Parametros 
	public Provincia(int idProv, String nombre, String capital, double superficie, double poblacion) {
		
		this.idProv = idProv;
		this.nombre = nombre;
		this.capital = capital;
		this.superficie = superficie;
		this.poblacion = poblacion;
	}
	
	// Getters y Setters
	public int getIdProv() {
		return idProv;
	}
	public void setIdProv(int idProv) {
		this.idProv = idProv;
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

	// To String
	@Override
	public String toString() {
		return "Provincia [idProv=" + idProv + ", nombre=" + nombre + ", capital=" + capital + ", superficie="+ superficie + ", poblacion=" + poblacion + "]";
	}
	
	// Metodo Leer Provincia
	public void leerP() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-PROVINCIA <--------------" );
		
		System.out.print("Id Provincia         ---> ");
		this.idProv = teclado.nextInt();
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
	

		// Metodo Mostrar Provincia
		public void mostrarP() {
			//System.out.println("********************************************************************************" );
			//System.out.println("-------------> MOSTRAR-PROVINCIA <------------" );
			System.out.println(toString());
		}
}
