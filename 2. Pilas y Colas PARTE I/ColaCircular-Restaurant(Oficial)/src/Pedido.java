import java.util.*;
public class Pedido {
	private String cliente;
	private String plato;
	private int cantidad;
	
	// Constructor por defecto
	public Pedido() {
		super();
		this.cliente = "";
		this.plato = "";
		this.cantidad = 0;
	}
	
	// Constructor por defecto
	public Pedido(String cliente, String plato, int cantidad) {
		this.cliente = cliente;
		this.plato = plato;
		this.cantidad = cantidad;
	}
	
	// Getters y Setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
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
		return "Pedido [cliente=" + cliente + ", plato=" + plato + ", cantidad=" + cantidad + "]";
	}
	
	// Metodo Leer Cliente
	public void leerP() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-CLIENTE <--------------" );
			
		System.out.print("Cliente              ---> ");
		this.cliente = teclado.nextLine();
		
		System.out.print("Plato                ---> ");
		this.plato = teclado.nextLine();
		
		System.out.print("Cantidad             ---> ");
		this.plato = teclado.nextLine();	
	}
	
	// Metodo Mostrar Cliente
	public void mostrarP() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
