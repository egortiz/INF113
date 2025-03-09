import java.util.*;
public class Macrodistrito {
	private String nombreMacro;
	private PilaI p = new PilaI();
	
	// Constructores con Parametros
	public Macrodistrito() {
		super();
		this.nombreMacro = "";
		this.p = new PilaI();
	}
	
	// Constructores con Parametros
	public Macrodistrito(String nombreMacro, PilaI p) {
		super();
		this.nombreMacro = nombreMacro;
		this.p = p;
	}
	
	// Getters y setters
	public String getNombreMacro() {
		return nombreMacro;
	}

	public void setNombreMacro(String nombreMacro) {
		this.nombreMacro = nombreMacro;
	}

	public PilaI getP() {
		return p;
	}

	public void setP(PilaI p) {
		this.p = p;
	}
	
	// to String
	@Override
	public String toString() {
		return "Macrodistrito [nombreMacro=" + nombreMacro + "]";
	}
	
	// Metodo Leer Isla Verde
    public void leerM() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("------------> LEER-MACRODISTRITO <-------------" );
    	
    	System.out.print("Nombre Macrodistrito   ---> ");
    	this.nombreMacro = teclado.nextLine();
    	
    	System.out.print("Cant. Islas Adicionar  ---> ");
		int n = teclado.nextInt();
		p.llenar(n);
    }
    
 // Metodo Mostrar Isla Verde
  	public void mostrarM() {
  		//System.out.println("********************************************************************************");
  		System.out.println(toString());
  		System.out.println("\n[Cola Islas Verdes:]");
  		p.mostrar();
  	}	
}
