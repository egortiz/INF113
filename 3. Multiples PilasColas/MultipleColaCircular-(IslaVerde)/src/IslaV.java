import java.util.*;
public class IslaV {
	private String nomZona;
	private String ubicacion;
	
	// Constructor por de Defecto
	public IslaV() {
		this.nomZona = "";
		this.ubicacion = "";
	}
	
	// Constructor por de Defecto
	public IslaV(String nomZona, String ubicacion) {
		super();
		this.nomZona = nomZona;
		this.ubicacion = ubicacion;
	}
	
	// Getters Setters
	public String getNombreZona() {
		return nomZona;
	}

	public void setNombreZona(String nomZona) {
		this.nomZona = nomZona;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	// To String
	@Override
	public String toString() {
		return "IslaV [nomZona=" + nomZona + ", ubicacion=" + ubicacion + "]";
	}
	
	// Metodo Leer Isla Verde
    public void leerI() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("--------------> LEER-ISLA VERDE <--------------" );
    	
    	System.out.print("Nombre Zona            ---> ");
		this.nomZona = teclado.nextLine();
		
		System.out.print("Ubicacion              ---> ");
		this.ubicacion = teclado.nextLine();	
    }
    
    // Metodo Mostrar Isla Verde
 	public void mostrarI() {
 		//System.out.println("********************************************************************************");
 		System.out.println(toString());
 	}	
}
