package Ejercicio03_CaracterRotarPila;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaCaracter e1 = new PilaCaracter();
		PilaCaracter e2 = new PilaCaracter();
		PilaCaracter e3 = new PilaCaracter();
		
		//Cargar Pila
		cargarPila(e1, e2, e3);
		
		//Mostrar Pila
		System.out.println("\n PILA ORIGINAL");
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		
		// Dadas 3 pilas de String con el mismo nuemro de elemntos 
		//////////////////////////////////////////////////////////////
		//a) Rotar (<---) los elemntos de la posicion i-esima k-veces
		solucionA(e1,e2,e3);
		System.out.println("PILA RESULTADO");
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		
		//b) Llevar el primer elemnto de la primera pila al ultimo de la segunda pila,
		// llevar el primer elemento de la segunda pila al último de la tercera pila y
		// llevar el primer elemento de la tercera pila al ultimo de la primera pila.
		//solucionB(e1,e2,e3);
		//System.out.println("\n PILA RESULTADO");
		//e1.mostrar();
		//e2.mostrar();
		//e3.mostrar();
		
	}
	//Solucion B
	public static void solucionB(PilaCaracter E1, PilaCaracter E2, PilaCaracter E3) {
		
		intercambiarB(E1, E2);
		intercambiarB(E2, E3);
		intercambiarB(E3, E1);
		
	}
	//intercambiar B
	public static void intercambiarB(PilaCaracter X, PilaCaracter Y) {
		PilaCaracter auxX = new PilaCaracter();
		PilaCaracter auxY = new PilaCaracter();
		
		int inicio = 1;
		int fin = X.nroElem();
		
		int contX = 1;
		int contY = 1;
		
		while (!X.esVacia()) {
			Caracter elementoX;
			elementoX = X.eliminar();
			if(contX==fin) {
				while (!Y.esVacia()) {
					Caracter elementoY;
					if(contY==inicio) {
						String aux = elementoX.getCaracter();
						Y.adicionar(elementoX);
					}
				elementoY = Y.eliminar();
				auxY.adicionar(elementoY);
				contY++;	
				}
				Y.vaciar(auxY);
			}
			else {
				auxX.adicionar(elementoX);
			}
		contX++;	
		}
		X.vaciar(auxX);
	}

	//Solucion A
	public static void solucionA(PilaCaracter E1, PilaCaracter E2, PilaCaracter E3) {
		Scanner teclado = new Scanner(System.in);
		int cantElem = E1.nroElem();
		int k, i;
		
		 do {
			 System.out.print("Ingrese un número (k) entre (1-3): ");
	            k = teclado.nextInt();
	            if (k < 1 || k> 3) {
	            	System.out.println("Número inválido. Debe ser 1, 2 o 3.");
	            }
	        }
		 while (k < 1 || k > 3);

		 // Validar la segunda variable: 1 
		 do {
			 System.out.print("Ingrese un número (i) entre (1-" + cantElem + "): ");
			 i = teclado.nextInt();

			 if (i < 1 || i > cantElem) {
				 System.out.println("Número inválido. Debe ser entre 1 - " + cantElem + ".");
			 }
		 } 
		 while (i < 1 || i > cantElem);
		 rotacionPilaA(E1,E2,E3, i, k);
	}
	//RotarPila
	public static void rotacionPilaA(PilaCaracter E1, PilaCaracter E2, PilaCaracter E3, int I, int P) {
	
		if(P==1) {
			intercambiarA(E1, E3, I);
			intercambiarA(E2, E1, I);
			intercambiarA(E3, E2, I);
		}
		if(P==2) {
			intercambiarA(E1, E2, I);
			intercambiarA(E2, E3, I);
			intercambiarA(E3, E1, I);
		}
		if(P==3) {
			System.out.println("Elementos rotan para volver al mismo sitio");
		}
		
		
	}
	// intercambiar_A
	public static void intercambiarA(PilaCaracter X, PilaCaracter Y, int K) {
		PilaCaracter auxX = new PilaCaracter();
		PilaCaracter auxY = new PilaCaracter();
		int contX = 1;
		int contY = 1;

		while (!X.esVacia()) {
			Caracter elementoX;
			elementoX = X.eliminar();
			if(contX==K) {
				while (!Y.esVacia()) {
					Caracter elementoY;
					elementoY = Y.eliminar();
					if(contY==K) {
						String AUX = elementoX.getCaracter();
						elementoX.setCaracter(elementoY.getCaracter());
						elementoY.setCaracter(AUX);
					}
					auxY.adicionar(elementoY);
					contY++;
				}
				Y.vaciar(auxY);
			}
		auxX.adicionar(elementoX);
		contX++;
		}
		X.vaciar(auxX);	
	}
	
	//Cargar Pila de Caracteres
	public static void cargarPila(PilaCaracter e1, PilaCaracter e2, PilaCaracter e3) {
		
		e1.adicionar(new Caracter("r"));
		e1.adicionar(new Caracter("a"));
		e1.adicionar(new Caracter("c"));
		e1.adicionar(new Caracter("s"));
		e1.adicionar(new Caracter("o"));
		
		e2.adicionar(new Caracter("o"));
		e2.adicionar(new Caracter("i"));
		e2.adicionar(new Caracter("r"));
		e2.adicionar(new Caracter("a"));
		e2.adicionar(new Caracter("m"));
		
		e3.adicionar(new Caracter("x"));
		e3.adicionar(new Caracter("a"));
		e3.adicionar(new Caracter("m"));
		e3.adicionar(new Caracter("a"));
		e3.adicionar(new Caracter("g"));		
	}

}
