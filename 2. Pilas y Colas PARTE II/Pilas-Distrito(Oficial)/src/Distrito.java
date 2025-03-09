import java.util.*;

public class Distrito {
	private int nroDistrito;
	private String ubicacion;
	
	//Constructor por defecto
	public Distrito() {
		this.nroDistrito = 0;
		this.ubicacion = "";
	}
	
	//Constructor con Parametros
	public Distrito(int nroDistrito, String ubicacion) {
		super();
		this.nroDistrito = nroDistrito;
		this.ubicacion = ubicacion;
	}
		
	// Getters Setters
	public int getNroDistrito() {
		return nroDistrito;
	}
	
	public void setNroDistrito(int nroDistrito) {
		this.nroDistrito = nroDistrito;
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
		return "Distrito [nroDistrito=" + nroDistrito + ", ubicacion=" + ubicacion + "]";
	}
	
	// Metodo Leer Distrito
	public void leerD() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-DISTRITO <---------------" );
		
		System.out.print("Nro. Distrito        ---> ");
		this.nroDistrito = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Ubicacion            ---> ");
		this.ubicacion = teclado.nextLine();
	}
	//Metodo Mostrar Distrito
	public void mostrarD() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}
}
