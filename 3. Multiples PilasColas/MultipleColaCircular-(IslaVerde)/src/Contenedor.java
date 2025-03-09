import java.util.Scanner;
public class Contenedor {
	private String color;
	private String ubicacion;
	private double capacidad;
	
	
	// Constructor por Defecto
	public Contenedor() {
		this.color = "";
		this.ubicacion = "";
		this.capacidad = 0;
	}
	
	// Constructor con Parametros
	public Contenedor(String color, String ubicacion, double capacidad) {
		super();
		this.color = color;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}
	
	// Getter y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	// To String
	@Override
	public String toString() {
		return "Contenedor [color=" + color + ", ubicacion=" + ubicacion + ", capacidad=" + capacidad + "]";
	}
	
	// Metodo Leer Contenedor
    public void leerC() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("--------------> LEER-CONTENEDOR <--------------" );
    	
    	System.out.print("Color                  ---> ");
    	this.color = teclado.nextLine();
    	
    	System.out.print("Ubicacion              ---> ");
    	this.ubicacion = teclado.nextLine();
    	
    	System.out.print("Capacidad              ---> ");
    	this.capacidad = teclado.nextDouble();
    	
    }
    
    // Metodo Mostrar Contenedor
  	public void mostrarC() {
  		//System.out.println("********************************************************************************");
  		System.out.println(toString());
  	}
}
