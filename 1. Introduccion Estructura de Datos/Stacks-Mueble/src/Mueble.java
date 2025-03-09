import java.util.*;
public class Mueble {
	private int codigo;
	private String nombre;
	private String material;
	private String color;
	
	// Constructor por defecto
	public Mueble() {
		this.codigo = 0;
		this.nombre = "";
		this.material = "";
		this.color = "";
	}
	
	// Constructor con parametros
	public Mueble(int codigo, String nombre, String material, String color) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Mueble [codigo=" + codigo + ", nombre=" + nombre + ", material=" + material + ", color=" + color + "]";
	}
	
	// Metodo Leer
	public void leerM() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Codigo          ---> ");
		this.codigo = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Nombre          ---> ");
		this.nombre = teclado.nextLine();
		
		System.out.print("Material        ---> ");
		this.material = teclado.nextLine();
		
		System.out.print("Color           ---> ");
		this.color = teclado.nextLine();	
	}
	// Metodo Mostrar
	public void mostrarM() {
		System.out.println("*******************************************************************" );
		System.out.println(toString());
	}
}
