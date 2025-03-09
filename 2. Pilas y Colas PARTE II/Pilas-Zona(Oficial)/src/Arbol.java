import java.util.Scanner;

public class Arbol {
	private int idZona;
	private String nombre;
	private double altura;
	private int edad;
	private String ubicacion;
	
	//Constructor por defecto
	public Arbol() {
		super();
		this.idZona = 0;
		this.nombre = "";
		this.altura = 0;
		this.edad = 0;
		this.ubicacion = "";
	}
	
	//Constructor con Parametros
	public Arbol(int idZona, String nombre, double altura, int edad, String ubicacion) {
		this.idZona = idZona;
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
		this.ubicacion = ubicacion;
	}
	
	// Getters y Setters
	public int getIdZona() {
		return idZona;
	}

	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	// To String
	@Override
	public String toString() {
		return "Arbol [idZona=" + idZona + ", nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", ubicacion=" + ubicacion + "]";
	}
	
	//Metodo Leer Arbol
	public void leerA() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-ARBOL <----------------" );
		
		System.out.print("Id. Zona             ---> ");
		this.idZona = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Nombre               ---> ");
		this.nombre = teclado.nextLine();	
		
		System.out.print("Altura               ---> ");
		this.altura = teclado.nextDouble();
		
		System.out.print("Edad                 ---> ");
		this.edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Ubicacion            ---> ");
		this.ubicacion = teclado.nextLine();	
	}
	
	//Metodo Mostrar Arbol
	public void mostrarA() {
	//System.out.println("********************************************************************************" );
		System.out.println(toString());
	}	
}
