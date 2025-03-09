import java.util.Scanner;
public class Informe {
	private int ci;
	private int nroDoc;
	
	// Constructor por Defecto
	public Informe() {
		this.ci = 0 ;
		this.nroDoc = 0;
	}
	
	// Constructor con parametros
	public Informe(int ci, int nroDoc) {
		this.ci = ci;
		this.nroDoc = nroDoc;
	}

	// Getters y Setters
	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}

	// To String
	@Override
	public String toString() {
		return "Informe [ci=" + ci + ", nroDoc=" + nroDoc + "]";
	}
	
	// Metodo Leer Informe
	public void leerI() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("-----------------------------------------" );
		
		System.out.print("Cedula de Identidad  ---> ");
		this.ci = teclado.nextInt();
		
		System.out.print("Número Documento     ---> ");
		this.nroDoc = teclado.nextInt();
		
	}
	
	// Metodo Mostrar Informe
	public void mostrarI() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}

