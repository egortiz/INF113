import java.util.*;
public class Pedido {
	private int nroCombo;
	private int cantidad;
	
	// Constructor por defecto
	public Pedido() {
		this.nroCombo = 0;
		this.cantidad = 0;
	}
	
	// Constructor con parametros
	public Pedido(int nroCombo, int cantidad) {
		super();
		this.nroCombo = nroCombo;
		this.cantidad = cantidad;
	}
	
	// Getters y Setters
	public int getNroCombo() {
		return nroCombo;
	}

	public void setNroCombo(int nroCombo) {
		this.nroCombo = nroCombo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	// To String 
	@Override
	public String toString() {
		return "Pedido [nroCombo=" + nroCombo + ", Cantidad=" + cantidad + "]";
	}
	
	// Metodo Leer Pedido
	public void leerP() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------------> LEER-PEDIDO <---------------" );
			
		System.out.print("Nro. Combo           ---> ");
		this.nroCombo = teclado.nextInt();
		
		System.out.print("Cantidad             ---> ");
		this.cantidad = teclado.nextInt();
	}
	// Metodo Mostrar Pedido
	public void mostrarP() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
