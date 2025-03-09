import java.util.*;

public class Datos {
	private String Responsable1;
	private String Responsable2;
	private ColaCircularNi colaNinio = new ColaCircularNi(); // Instanciar ColaCircular de ninios
	
	// Constructor por defecto
	public Datos() {
		super();
		this.Responsable1 = "";
		this.Responsable2 = "";
		this.colaNinio = new ColaCircularNi();
	}
	
	// Constructor con parametros
	public Datos(String responsable1, String responsable2, ColaCircularNi colaNinio) {
		super();
		this.Responsable1 = responsable1;
		this.Responsable2 = responsable2;
		this.colaNinio = colaNinio;
	}
	
	// Getters y Setters
	public String getResponsable1() {
		return Responsable1;
	}
	public void setResponsable1(String responsable1) {
		Responsable1 = responsable1;
	}
	public String getResponsable2() {
		return Responsable2;
	}
	public void setResponsable2(String responsable2) {
		Responsable2 = responsable2;
	}
	public ColaCircularNi getColaNinio() {
		return colaNinio;
	}
	public void setColaNinio(ColaCircularNi colaNinio) {
		this.colaNinio = colaNinio;
	}
	
	// To String
	@Override
	public String toString() {
		return "Datos [Responsable1=" + Responsable1 + " Responsable2=" + Responsable2 + "]";
	}
	
	// Metodo Leer Datos
    public void leerD() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("----------------> LEER-DATOS <----------------" );
    	
    	System.out.print("Responsable 1          ---> ");
		this.Responsable1 = teclado.nextLine();
		
		System.out.print("Responsable 2          ---> ");
		this.Responsable2 = teclado.nextLine();
		
		System.out.print("Cant. Ninios Adicionar ---> ");
		int n = teclado.nextInt();
		colaNinio.llenar(n);
    }
    
    
    // Metodo Mostrar Datos
 	public void mostrarD() {
 		//System.out.println("********************************************************************************");
 		System.out.println(toString());
 		System.out.println("\n[Cola Ninios:]");
 		colaNinio.mostrar();
 	}	
}
