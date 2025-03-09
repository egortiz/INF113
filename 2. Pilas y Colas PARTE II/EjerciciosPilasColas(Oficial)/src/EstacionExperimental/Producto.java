package EstacionExperimental;

import java.util.Scanner;

public class Producto {
	private String idEstudiante;
	private String fecha;
	private String producto;
	private String tipo;
	private String variedad;
	private int cantidad;
	
	// Constructor por Defecto
	public Producto() {
		this.idEstudiante = "";
		this.fecha = "";
		this.producto = "";
		this.tipo = "";
		this.variedad = "";
		this.cantidad = 0;
	}
	
	// Constructor con Parametros
	public Producto(String idEstudiante, String fecha, String producto, String tipo, String variedad, int cantidad) {
		this.idEstudiante = idEstudiante;
		this.fecha = fecha;
		this.producto = producto;
		this.tipo = tipo;
		this.variedad = variedad;
		this.cantidad = cantidad;
	}
		
	// Getters Setters
	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
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
		return "Producto [idEstudiante=" + idEstudiante + ", fecha=" + fecha + ", producto=" + producto + ", tipo=" + tipo + ", variedad=" + variedad + ", cantidad=" + cantidad + "]";
	}
	
	// Metodo leer Producto
	public void leerP() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------------> LEER-PRODUCTO <--------------" );
		
		System.out.print("Id Estudiante        ---> ");
		this.idEstudiante = teclado.nextLine();
		
		System.out.print("Fecha(dd/mm/aaaa)    ---> ");
		this.fecha = teclado.nextLine();
		
		System.out.print("Producto             ---> ");
		this.producto = teclado.nextLine();
		
		System.out.print("Tipo                 ---> ");
		this.tipo = teclado.nextLine();
		
		System.out.print("Variedad             ---> ");
		this.variedad = teclado.nextLine();
		
		System.out.print("Cantidad             ---> ");
		this.cantidad = teclado.nextInt();
	}

	// Metodo Mostrar Estacion Experimental
	public void mostrarP() {
		//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
