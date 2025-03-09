import java.util.*;

public class Comensal {
	private String nombComenzal;
	
	// Constructor por Defecto
	public Comensal() {
		this.nombComenzal = "";
	}
	
	// Constructor con parametros
	public Comensal(String nombComenzal) {
		super();
		this.nombComenzal = nombComenzal;
	}
	
	// Getters y Setters
	public String getNomComenzal() {
		return nombComenzal;
	}

	public void setNomComenzal(String nombComenzal) {
		this.nombComenzal = nombComenzal;
	}
	
	// To String 
	@Override
	public String toString() {
		return "Comensal [nombComenzal=" + nombComenzal + "]";
	}
	
	// Metodo Leer Comensal
	public void leerCO() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-COMENZAL <--------------" );
		
		System.out.print("Nombre Comenzal      ---> ");
		this.nombComenzal = teclado.nextLine();
	}
	// Metodo Mostrar Comenzal
	public void mostrarCO() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
