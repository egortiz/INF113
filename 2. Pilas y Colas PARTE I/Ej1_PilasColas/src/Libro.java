import java.util.*;
public class Libro {
	private String titulo;
	private String autor;
	private int nroPaginas;
	
	// Constructor por defecto
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.nroPaginas = 0;
	}
	
	// Constructor con parametros
	public Libro(String titulo, String autor, int nroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
	}
	
	// Getters y Setters
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

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	
	// To String
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nroPaginas=" + nroPaginas + "]";
	}
	
	// Metodo Leer Libro
	public void leerL() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------" );
		System.out.print("Titulo               ---> ");
		this.titulo = teclado.nextLine();
		
		System.out.print("Autor                ---> ");
		this.autor = teclado.nextLine();
		
		System.out.print("Nro. Paginas         ---> ");
		this.nroPaginas = teclado.nextInt();
	}
	
	// Metodo Mostrar Libro
	public void mostrarL() {
		System.out.println("********************************************************************************" );
		System.out.println(toString());
	}
	
}
