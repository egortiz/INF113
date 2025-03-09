import java.util.*;
public class Informe {
	private int nro;
	private int ci;
	private int nota;
	
	// Constructor por Defecto
	public Informe() {
		this.nro = 0;
		this.ci = 0;
		this.nota = 0;
	}
	// Constructor con Parametros
	public Informe(int nro, int ci, int nota) {
		super();
		this.nro = nro;
		this.ci = ci;
		this.nota = nota;
	}
	
	// Getters y Setters
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	// to string
	@Override
	public String toString() {
		return "Informe [nro=" + nro + ", ci=" + ci + ", nota=" + nota + "]";
	}
	
	// Metodo Leer Informe
	public void leerI() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nro.       -----> ");
		nro = teclado.nextInt();
		
		System.out.print("C.I.       -----> ");
		ci = teclado.nextInt();
		
		System.out.print("Nota       -----> ");
		nota = teclado.nextInt();
	}
	
	// Metodo Mostrar Informe
	public void mostrarI() {
		System.out.print(toString ());
	}
	
}
