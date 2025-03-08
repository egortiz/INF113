package Ejercicio04_LibroPila;
import java.util.*;

public class Libro {
	private String titulo;
	private String autor;
	private int nroPag;
	
	//Constructor_por_defecto
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.nroPag = 0;
	}
	
	//Constructor_con_parametros
	public Libro(String titulo, String autor, int nroPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nroPag = nroPag;
	}
	
	
	// Getters_y_Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNroPag() {
		return nroPag;
	}

	public void setNroPag(int nroPag) {
		this.nroPag = nroPag;
	}
	
	//To_String
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nroPag=" + nroPag + "]";
	}
	
	//Leer_Libro
	public void leerLibro() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-LIBRO <-------------" );
		System.out.print("Titulo    --->: ");
		this.titulo = teclado.nextLine();
		
		System.out.print("Autor     --->: ");
		this.autor = teclado.nextLine();
		
		System.out.print("Nro.Pag   --->: ");
		this.nroPag = teclado.nextInt();
		
	}

	//Mostrar_Libro
	public void mostrarLibro() {
		System.out.println(toString());
	}

}
