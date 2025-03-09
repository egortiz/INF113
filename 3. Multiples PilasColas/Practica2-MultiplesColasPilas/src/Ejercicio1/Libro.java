package Ejercicio1;
import java.util.*;

public class Libro {
	private String titulo;
	private String autor;
	private int nroPaginas;
	
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.nroPaginas = 0;
	}
	
	// Constructores con parametros
	public Libro(String titulo, String autor, int nroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
	}
	
	// Getters y Settesr
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

	public int getNreoPaginas() {
		return nroPaginas;
	}

	public void setNreoPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	
	// To String 
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nroPaginas=" + nroPaginas + "]";
	}
	
	// Metodo para Leer Libro
	public void leerL() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------> LEER-LIBRO <-----------------"); 	
		System.out.print("Titulo                 ---> ");
		this.titulo = teclado.nextLine();
		
		System.out.print("Autor                  ---> ");
		this.autor = teclado.nextLine();
		
		System.out.print("Nro. Paginas           ---> ");
		this.nroPaginas = teclado.nextInt();
	}
	
	// Metodo para Mostrar Libro
	public void mostrarL() {
		//System.out.println("********************************************************************************");
		System.out.println(toString());
	}	
}
