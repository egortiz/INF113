package Ejercicio1;
import java.nio.charset.CoderMalfunctionError;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaCSimpeLI pi= new PilaCSimpeLI();
		
		//System.out.print("Cant. de Elementos (Pila): ");
		//int n = teclado.nextInt();
		//pi.llenar(n);
		//pi.mostrar();
		
		//Cargar Pila de Colas
		cargarPila(pi);
		pi.mostrar();
		
		//a) Mostrar el titulo de los libros que fueron escritos por el autor X.
		System.out.println("\n.......................................... SOLUCION A ...............................................");
		System.out.print("Buscar Autor (X)     ---> ");
		String x = teclado.nextLine();
		solA(pi,x);
		pi.mostrar();
		System.out.println(".....................................................................................................");

		
		//b) Mostrar los Libros que tienen nro_paginas múltiplo de 7.
		System.out.println("\n.......................................... SOLUCION B ...............................................");
		solB(pi);
		System.out.println(".....................................................................................................");
		
		//c) Verificar si el autor X escribió el libro Y
		System.out.println("\n.......................................... SOLUCION C ...............................................");
		System.out.print("Nombre Autor (Y)     ---> ");
		String y = teclado.nextLine();
		System.out.print("Libro        (Z)     ---> ");
		String z = teclado.nextLine();
		
		if(solC(pi,y,z)) {
			System.out.println("Si, Existe el Autor: "+y+", Y su Libro: "+z);
		}
		else {
			System.out.println("No, Existe el Autor: "+y+", Y su Libro: "+z);
		}
		System.out.println(".....................................................................................................");
		
	}

	// Cargar Pila
	public static void cargarPila(PilaCSimpeLI PI) {
		
		Libro l1 = new Libro("Iliada","Homero",350);
		Libro l2 = new Libro("Odisea","Homero",250);
		Libro l3 = new Libro("Opera","Juan",150);
		Libro l4 = new Libro("Java","Percy",450);
		Libro l5 = new Libro("Pyhton","Jorge",125);
		Libro l6 = new Libro("C++","Juan",455);
		Libro l7 = new Libro("C#","Rigoberto",155);
		Libro l8 = new Libro("Algebra","Baldor",555);
		Libro l9 = new Libro("Fisica","Huayta",415);
		Libro l10 = new Libro("Informatica","Tellez",655);
		
		
		CSimpleLI cs1 = new CSimpleLI();
		cs1.adicionar(l1);
		
		CSimpleLI cs2 = new CSimpleLI();
		cs2.adicionar(l2);
		cs2.adicionar(l3);
		
		CSimpleLI cs3 = new CSimpleLI();
		cs3.adicionar(l4);
		cs3.adicionar(l5);
		cs3.adicionar(l6);
		
		CSimpleLI cs4 = new CSimpleLI();
		cs4.adicionar(l7);
		cs4.adicionar(l8);
		cs4.adicionar(l9);
		cs4.adicionar(l10);
		
		PI.adicionar(cs1);
		PI.adicionar(cs2);
		PI.adicionar(cs3);
		PI.adicionar(cs4);
	}
	
	// SOLUCION A
	public static void solA(PilaCSimpeLI PI, String X) {
		PilaCSimpeLI auxPI = new PilaCSimpeLI();
		CSimpleLI auxCS = new CSimpleLI();
		while (!PI.esVacia()) {
			CSimpleLI elemCS = PI.eliminar();
			while (!elemCS.esVacia()) {
				Libro elemLI = elemCS.eliminar();
				if(elemLI.getAutor().equalsIgnoreCase(X)) {
					System.out.println("Titulo: "+elemLI.getTitulo());
				}
				auxCS.adicionar(elemLI);
			}
			elemCS.vaciar(auxCS);
			auxPI.adicionar(elemCS);
		}
		PI.vaciar(auxPI);	
	}
	// SOLUCION B
	public static void solB(PilaCSimpeLI PI) {
		PilaCSimpeLI auxPI = new PilaCSimpeLI();
		CSimpleLI auxCS = new CSimpleLI();
		while (!PI.esVacia()) {
			CSimpleLI elemCS = PI.eliminar();
			while (!elemCS.esVacia()) {
				Libro elemLI = elemCS.eliminar();
				if(verificarMultiplo(elemLI.getNreoPaginas(),7)) {
					System.out.println("Titulo: "+elemLI.getTitulo()+"\n"+"Autor: "+elemLI.getAutor()+"\n"+"Nro. Paginas: "+elemLI.getNreoPaginas()+"<---");
				}
				auxCS.adicionar(elemLI);
			}
			elemCS.vaciar(auxCS);
			auxPI.adicionar(elemCS);
		}
		PI.vaciar(auxPI);	
	}
	
	// Funcion Verificar multiplo de Siete
	public static boolean verificarMultiplo(int PA, int X) {
		if(PA % 7 == 0) {
			return true;
		}
	return false;
	}
	
	// SOLUCION C
	public static boolean solC(PilaCSimpeLI PI, String A, String L) {
		PilaCSimpeLI auxPI = new PilaCSimpeLI();
		CSimpleLI auxCS = new CSimpleLI();
		boolean sw = false;
		while (!PI.esVacia()) {
			CSimpleLI elemCS = PI.eliminar();
			while (!elemCS.esVacia()) {
				Libro elemLI = elemCS.eliminar();
				if(elemLI.getAutor().equalsIgnoreCase(A) && elemLI.getTitulo().equalsIgnoreCase(L)) {
					sw = true;
				}
				auxCS.adicionar(elemLI);
			}
			elemCS.vaciar(auxCS);
			auxPI.adicionar(elemCS);
		}
		PI.vaciar(auxPI);	
		return sw;
	}
	
	
}


