package Ejercicio2;
import java.util.*;

public class Medicamentos {
	private String nombre;
	private String fabricante;
	private int stock;
	
	// Constructor por Defecto
	public Medicamentos() {
		this.nombre = "";
		this.fabricante = "";
		this.stock = 0;
	}
	
	// Constructores con Parametros
	public Medicamentos(String nombre, String fabricante, int stock) {
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.stock = stock;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// To String
	@Override
	public String toString() {
		return "Medicamentos [nombre=" + nombre + ", fabricante=" + fabricante + ", stock=" + stock + "]";
	}
	
	// Metodo Leer Medicamento
    public void leerM() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("--------------> LEER-MEDICAMENTO <-------------" );
    	
    	System.out.print("Nombre                 ---> ");
    	this.nombre = teclado.nextLine();
    	
    	System.out.print("Fabricante             ---> ");
    	this.fabricante = teclado.nextLine();
    	
    	System.out.print("stock                  ---> ");
    	this.stock = teclado.nextInt();
    }
 // Metodo Mostrar Isla Verde
  	public void mostrarM() {
  		//System.out.println("********************************************************************************");
  		System.out.println(toString());
  	}	
}
