import java.util.*;
public class Zona {
	private String nomZona;
	private CCircularCO cc = new CCircularCO();
	
	// Constructor Por Defecto
	public Zona() {
		this.nomZona = "";
		this.cc = new CCircularCO();
	}
	
	// Constructor Con Parametros
	public Zona(String nomZona, CCircularCO cc) {
		super();
		this.nomZona = nomZona;
		this.cc = cc;
	}
	
	// Getters y Setters
	public String getNomZona() {
		return nomZona;
	}

	public void setNomZona(String nomZona) {
		this.nomZona = nomZona;
	}

	public CCircularCO getCc() {
		return cc;
	}

	public void setCc(CCircularCO cc) {
		this.cc = cc;
	}
	
	// To String 
	@Override
	public String toString() {
		return "Zona [nomZona=" + nomZona + "]";
	}
	
	// Metodo para Leer Zona
	 public void leerZ() {
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("-----------------> LEER-ZONA <-----------------");
	    	
		 System.out.print("Nombre Zona            ---> ");
		 this.nomZona = teclado.nextLine();
		 
		 System.out.print("Cant. Colas CircularCO ---> ");
		 int n = teclado.nextInt();
		 cc.llenar(n);	 
	 }
	 
	 // Metodo para Mostrar Zona
	 public void mostrarZ() {
	 	//System.out.println("********************************************************************************");
	 	System.out.println(toString());
	 	System.out.println("\n[Cola Circular de Contenedores: ]");
	 	cc.mostrar();
	 }	

}
