package Ejercicio06_CuadernoStack;
import java.util.*;

public class Cuaderno {
	private String marca;
	private double precio;
	private String industria;
	private int nroHojas;
	
	
	// Constructor por default
	public Cuaderno() {
		this.marca = "";
		this.precio = 0;
		this.industria = "";
		this.nroHojas = 0;
	}

	// Constructor con parametros
	public Cuaderno(String marca, double precio, String industria, int nroHojas) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.industria = industria;
		this.nroHojas = nroHojas;
	}
	

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIndustria() {
		return industria;
	}

	public void setIndustria(String industria) {
		this.industria = industria;
	}

	public int getNroHojas() {
		return nroHojas;
	}

	public void setNroHojas(int nroHojas) {
		this.nroHojas = nroHojas;
	}

	//TO String
	@Override
	public String toString() {
		return "Cuaderno [marca=" + marca + ", precio=" + precio + ", industria=" + industria + ", nroHojas=" + nroHojas + "]";
	}
	
	//Leer_Cuaderno
	public void leerCuaderno() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-CUADERNO <-------------" );
		System.out.print("Marca      --->: ");
		this.marca = teclado.nextLine();

		System.out.print("Precio     --->: ");
		this.precio = teclado.nextDouble();
		
		System.out.print("Industria --->: ");
		this.industria = teclado.next();
		
		System.out.print("Nro.Hojas --->: ");
		this.nroHojas = teclado.nextInt();
	}

	//Mostrar_Cuaderno
	public void mostrarCuaderno() {
		System.out.println(toString());
	}
	
}
