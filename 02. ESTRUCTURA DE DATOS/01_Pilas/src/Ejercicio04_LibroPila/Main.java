package Ejercicio04_LibroPila;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaLibro L1 = new PilaLibro();
		
		//Leer_Libro
		//leerLibro(L1);
		
		//Cargar_Libro
		cargarLibro(L1);
		
		//Mostrar Pila
		System.out.println("\nPILA ORIGINAL\n");
		L1.mostrar();
		
		//Sea una pila de Objetos Libro <titulo, autor, nroPaginas>
		//a) Eliminar al libro en la posicion k-esima.
		//b) Insertar un nuevo libro despues de cada libro con menos de 100 paginas
		//c) Verificar si existe mas de un libro del autor X
		
		//SOLUCION A
		//solucionA(L1);
		//System.out.println("PILA RESULTADO");
		//L1.mostrar();
		
		//SOLUCION B
		//solucionB(L1, 100);
		//System.out.println("\nPILA RESULTADO\n");
		//L1.mostrar();
		
		//SOLUCION C
		solucionC(L1);
		
	}
	
	//Solucion_A
	public static void solucionA(PilaLibro L1) {
		Scanner teclado = new Scanner(System.in);
		int cont = L1.nroElem();
		System.out.println("*************************************************************************************");
		int k;
		do {
		    System.out.print("Eliminar Libro Posicion (k): ");
		    k = teclado.nextInt();
		    
		    if (k < 1 || k >cont) {
		        System.out.println("Número fuera de rango. (Debe estar entre 1 y " + cont+")");
		    }
		} while (k < 1 || k > cont);
		System.out.println("*************************************************************************************");
		
		PilaLibro aux = new PilaLibro();
		while(!L1.esVacia()) {
			Libro elemento;
			elemento = L1.eliminar();
			if(cont!=k) {
				aux.adicionar(elemento);
			}
		cont--;	
		}
		L1.vaciar(aux);
	}
	
	//Solucion_B
	public static void solucionB(PilaLibro L1, int P) {
		PilaLibro aux = new PilaLibro();
		int cont = 1;
		
		aux.vaciar(L1);
		while (!aux.esVacia()) {
			Libro elemento;
			elemento = aux.eliminar();
			L1.adicionar(elemento);
			if(elemento.getNroPag() < P) {
				Libro nuevoElemento = new Libro();
				nuevoElemento.leerLibro();
				L1.adicionar(nuevoElemento);
			}
		cont++;	
		}
	}
	
	//Solucion_C
	public static void solucionC(PilaLibro L1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Buscar (AUTOR): ");
		String x = teclado.nextLine();
		PilaLibro aux = new PilaLibro();
		int cont = 0;
		
		while(!L1.esVacia()) {
			Libro elemento;
			elemento = L1.eliminar();
			if(elemento.getAutor().equalsIgnoreCase(x)) {
				cont++;	
			}
		aux.adicionar(elemento);	
		}
		L1.vaciar(aux);
		
		if(cont > 1) {
			System.out.println("El autor "+x+", si tiene mas de dos Libros");
		}
		else {
			System.out.println("El autor "+x+", no tiene mas de 1 Libros o no existe");
		}
		
	}
	
	//Leer_Libro
	public static void leerLibro(PilaLibro L1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cantidad-Libro: ");
		int n = teclado.nextInt();
		
		for (int i=1;i<=n;i++) {
			Libro elemento = new Libro();  
	        elemento.leerLibro();         
	        L1.adicionar(elemento);    
		}
	}
	
	//Cargar Libro
	public static void cargarLibro(PilaLibro L1) {
		L1.adicionar(new Libro("Odisea","Homero",1600));
		L1.adicionar(new Libro("Fisica I","Huayta",800));
		L1.adicionar(new Libro("Iliada","Homero",50));
		L1.adicionar(new Libro("Algebra","Baldor",1500));
		L1.adicionar(new Libro("Matilde","Pepo",30));
		L1.adicionar(new Libro("Calculo I","Chungara",500));
		L1.adicionar(new Libro("Calculo II","Chungara",600));
	}
}
