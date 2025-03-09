import java.util.*;
public class Parcial {
	private String ci;
	private int nota;
	private int nroPar;
	
	// Constructor por Defecto
	public Parcial() {
		super();
		this.ci = "";
		this.nota = 0;
		this.nroPar = 0;
	}
	
	// Constructor con Parametros
	public Parcial(String ci, int nota, int nroPar) {
		this.ci = ci;
		this.nota = nota;
		this.nroPar = nroPar;
	}
	
	// Getters y Setters
	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getNroPar() {
		return nroPar;
	}

	public void setNroPar(int nroPar) {
		this.nroPar = nroPar;
	}

	// To String
	@Override
	public String toString() {
		return "Parcial [ci=" + ci + ", nota=" + nota + ", nroPar=" + nroPar + "]";
	}
	
	// Metodo Leer Parcial
	public void leerP() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Cedula de Identidad  ---> ");
		this.ci = teclado.nextLine();
		
		System.out.print("Nota                 ---> ");
		this.nota= teclado.nextInt();
		
		System.out.print("Nro. Parcial         ---> ");
		this.nroPar = teclado.nextInt();
			
	}
	
	// Metodo Mostrar Parcial
	public void mostrarP() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}
