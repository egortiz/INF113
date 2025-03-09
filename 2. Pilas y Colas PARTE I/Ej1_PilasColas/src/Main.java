import java.util.*;
public class Main {
	Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		pilaL pl = new pilaL();
		
		pl.adicionar(new Libro("La Iliada", "Homero",100));
		pl.adicionar(new Libro("La Odisea", "Homero",150));
		pl.adicionar(new Libro("100 años de Soledad", "Gabriel Garcia",140));
		pl.adicionar(new Libro("Cordillera", "Antonio Paredes Candia",100));
		pl.adicionar(new Libro("Edipo Rey", "Homero",500));
		pl.adicionar(new Libro("La Politica", "Evo Moralez",250));
		pl.mostrar();
		
		
		// a) Elimiminar al libro en la posicion k-esima
		System.out.println("................................................................................" );
		Scanner teclado = new Scanner(System.in);
		System.out.print("Posición(k) eliminar ---> ");
		int x = teclado.nextInt();
		teclado.nextLine();
		eliminarLibro(pl,x);
		pl.mostrar();
		
		
		
		// b) Insertar un nuevo libro despues de cada libro con menos de 100 paginas
		System.out.println("................................................................................" );
		int w = 100;
		insertarLibro(pl,w);
		pl.mostrar();
		
		
		// c) Verificar si existe mas de un libro del autor X
		System.out.println("................................................................................" );
		System.out.print("Autor Verificar (x)  ---> ");	
		String y = teclado.nextLine();
		contarLibroAutor(pl,y);
		

	}
	

	// SOLUCION A
	public static void eliminarLibro(pilaL PL, int X) {
		pilaL aux = new pilaL();
		while(!PL.esVacia()) {
			Libro elem = PL.eliminar();
			aux.adicionar(elem);
			if (PL.nroElem() == X) {
				PL.eliminar();
			}
		}
		PL.vaciar(aux);
	}
	
	// SOLUCION B
	public static void insertarLibro(pilaL PL, int W) {
		pilaL aux1 = new pilaL();
		pilaL aux2 = new pilaL();
		
		aux1.vaciar(PL);
		aux2.vaciar(aux1);
		PL.vaciar(aux2);
		while(!PL.esVacia()) {
			Libro elem1 = PL.eliminar();
			aux1.adicionar(elem1);
			if (elem1.getNroPaginas() == W) {
				Libro elem2 = new Libro();
				elem2.leerL();
				aux1.adicionar(elem2);
			}
		}
		aux2.vaciar(aux1);
		PL.vaciar(aux2);
	}

	
	// SOLUCION C
	public static void contarLibroAutor(pilaL PL, String X) {
		pilaL aux1 = new pilaL();
		int contador = 0;
		boolean sw = false;
		while(!PL.esVacia()) {
			Libro elem1 = PL.eliminar();
			aux1.adicionar(elem1);
			if(elem1.getAutor().equalsIgnoreCase(X)) {
				contador++;
				sw = true;
			}
		}
		PL.vaciar(aux1);
		if(contador >= 1) {
			System.out.print("El Autor :"+X+" Si, tiene mas de un libro : "+contador+" Libro(s)");
		}
		if(contador == 0) {
			System.out.print("El Autor :"+X+" No, tiene Libros");
		}
	}
}