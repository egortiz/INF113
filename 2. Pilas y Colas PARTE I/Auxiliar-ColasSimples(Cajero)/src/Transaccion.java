import java.util.*;
public class Transaccion {
	private int ci;
	private double monto;
	private String fecha;
	
	// Constructor por Defecto
	public Transaccion() {
		this.ci = 0;
		this.monto = 0;
		this.fecha = "";
	}
	
	// Constructor con Parametros
	public Transaccion(int ci, double monto, String fecha) {
		this.ci = ci;
		this.monto = monto;
		this.fecha = fecha;
	}
	
	// Getters y Setters
	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	// To String
	@Override
	public String toString() {
		return "Transaccion [ci=" + ci + ", monto=" + monto + ", fecha=" + fecha + "]";
	}
	
	// Metodo Leer Transaccion
	public void leerT() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("------------------------ LEER-TRANSACCION -------------------------");
	
	
	System.out.print("Cedula de Identidad  ---> ");
	this.ci = teclado.nextInt();
	
	System.out.print("Monto                ---> ");
	this.monto = teclado.nextDouble();
	teclado.nextLine();
	
	System.out.print("Nombre               ---> ");
	this.fecha= teclado.nextLine();
		
	}
	
	// Metodo Mostrar Cliente
	public void mostrarT() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}
