package Ejercicio05_CuadernoPila;
import java.lang.classfile.attribute.NestHostAttribute;
import java.util.*;

import Ejercicio04_LibroPila.Libro;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		PilaCuaderno c = new PilaCuaderno();
		
		//leerLibro(c);
		//c.mostrar();
		
		cargarLibro(c);
		System.out.println("PILA-ORIGINAL");
		c.mostrar();
		
		//a) Mostrar las marcas de los cuadernos mas caros que tenga k hojas)
		//System.out.println("\nSOLUCION (A)");
		//solucionA(c);
		
		//b) Hallar la inversion total de los cuadernos
		//System.out.println("\nSOLUCION (B)");
		//solucionB(c);
		
		//c) Dada una marcaa (Z) cuantos cuaderno existen
		//System.out.println("\nSOLUCION (C)");
		//solucionC(c);
		
		//d) Mostrar el cuaderno con mas hojas
		//System.out.println("\nSOLUCION (D)");
		//solucionD(c);
		
	}
	
	//Solucion_D
	public static void solucionD(PilaCuaderno C) {
		PilaCuaderno aux = new PilaCuaderno();
		int mayor = buscarMayor(C);
		
		while(!C.esVacia()) {
			Cuaderno elemento;
			elemento = C.eliminar();
			if(elemento.getNroHojas()== mayor) {
				System.out.println(elemento);
			}
			
		aux.adicionar(elemento);	
		}
		C.vaciar(aux);
	}
	
	//Buscar_Mayor_Cantidad_hojas
	public static int buscarMayor(PilaCuaderno c) {
		PilaCuaderno aux = new PilaCuaderno();
		Cuaderno elemento;
		elemento = c.eliminar();
		int mayor= elemento.getNroHojas();
		aux.adicionar(elemento);
		c.vaciar(aux);
		
		while(!c.esVacia()) {
			elemento = c.eliminar();
			if(elemento.getNroHojas()>mayor) {
				mayor=elemento.getNroHojas();
			}
		aux.adicionar(elemento);	
		}
		c.vaciar(aux);
		return mayor;
	}

	//Solucion_C
	public static void solucionC(PilaCuaderno C) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Marca (k): ");
		String Z = teclado.nextLine();
		int contador = 0;
		
		PilaCuaderno aux = new PilaCuaderno();
		while(!C.esVacia()) {
			Cuaderno elemento;
			elemento = C.eliminar();
			if(elemento.getMarca().equalsIgnoreCase(Z)) {
				contador++;
			}
		aux.adicionar(elemento);	
		}
		C.vaciar(aux);
		System.out.println("Existe, "+contador+" cuaderno(s)"+" de la Marca "+Z);	
	}

	//Solucion_B
	public static void solucionB(PilaCuaderno C) {
		PilaCuaderno aux = new PilaCuaderno();
		double total = 0;
	
		while(!C.esVacia()) {
			Cuaderno elemento;
			elemento = C.eliminar();
			total+= elemento.getPrecio();
		aux.adicionar(elemento);
		}
		C.vaciar(aux);
		System.out.println("Total inversion: "+total+" Bs.");
	}

	//Solucion_A
	public static void solucionA(PilaCuaderno C) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Buscar (k) nroHojas: ");
		int k = teclado.nextInt();
		
		PilaCuaderno aux1 = new PilaCuaderno();
		PilaCuaderno aux2 = new PilaCuaderno();
		
		while(!C.esVacia()) {
			Cuaderno elemento;
			elemento = C.eliminar();
			if(elemento.getNroHojas()==k) {
				Cuaderno elementoCopia;
				elementoCopia = elemento;
				aux2.adicionar(elementoCopia);
			}
			aux1.adicionar(elemento);
		}	
		C.vaciar(aux1);
		
		mostrarMayores(aux2);	
	}
	
	//MUESTRA LOS MAYORES DE UNA LISTA
	public static void mostrarMayores(PilaCuaderno Z) {
		//ordenacionBurbuja(Z);
		ordenacionSimple(Z);
		int cantElementos = Z.nroElem();
		int fin= (cantElementos / 2)+1;
		
		PilaCuaderno aux = new PilaCuaderno();
		int iterador = 1;
		
		while (!Z.esVacia()) {
			Cuaderno elemento;
			elemento = Z.eliminar();
			if(iterador<=fin) {
				elemento.mostrarCuaderno();
			}
		aux.adicionar(elemento);
		iterador++;
		}
		Z.vaciar(aux);
	}
	
	//ORDENACION_SIMPLE
	public static void ordenacionSimple(PilaCuaderno C) {
		PilaCuaderno auxOrdenada = new PilaCuaderno();  
	    PilaCuaderno auxTemporal = new PilaCuaderno();  

	    while (!C.esVacia()) {
	        Cuaderno mayor;
	        mayor = C.eliminar();
	        PilaCuaderno aux = new PilaCuaderno();
	        
	        while (!C.esVacia()) {
	            Cuaderno actual = C.eliminar();
	            if (actual.getPrecio() > mayor.getPrecio()) {
	                aux.adicionar(mayor);
	                mayor = actual;
	            } else {
	                aux.adicionar(actual);
	            }
	        }
	        auxOrdenada.adicionar(mayor);  

	        while (!aux.esVacia()) {
	            C.adicionar(aux.eliminar());
	        }
	    }
	    while (!auxOrdenada.esVacia()) {
	        C.adicionar(auxOrdenada.eliminar());
	    }
	}

	//ORDENACION_BURBUJA
	public static void ordenacionBurbuja(PilaCuaderno X) {
		PilaCuaderno pilaAux = new PilaCuaderno();
		PilaCuaderno pilaTemporal = new PilaCuaderno();
		
		int n = X.nroElem();
		boolean huboIntercambio = true;
		int iterador = 0;

		while (huboIntercambio) {
			huboIntercambio = false;

			int comparaciones = (n - 1) - iterador;
			int contador = 0;

			Cuaderno anterior = X.eliminar();  
			while (contador < comparaciones) {
				Cuaderno actual = X.eliminar(); 
				if (anterior.getPrecio() < actual.getPrecio()) {
					
					pilaTemporal.adicionar(anterior);
					pilaAux.adicionar(actual);
					huboIntercambio = true;
				} else {
					
					pilaTemporal.adicionar(actual);
					pilaAux.adicionar(anterior);
				}
				anterior = pilaTemporal.eliminar();
				contador++;
			}
			pilaAux.adicionar(anterior);

			while (!pilaAux.esVacia()) {
				X.adicionar(pilaAux.eliminar());
			}
			iterador++;
		}
	}
		
	//Leer_Cuaderno
	public static void leerLibro(PilaCuaderno C) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nro.Cuadernos: ");
		int n = teclado.nextInt();
		
		for (int i=1;i<=n;i++) {
			Cuaderno elemento = new Cuaderno();  
	        elemento.leerCuaderno(); 
	        C.adicionar(elemento);    
		}
	}
	
	//Cargar_Cuadernos
	public static void cargarLibro(PilaCuaderno C) {
		C.adicionar(new Cuaderno("PapelBOL", 10.00, "Bolivia",80));
		C.adicionar(new Cuaderno("ABC", 20.00, "Bolivia",200));
		C.adicionar(new Cuaderno("TOP", 12.00, "Bolivia",200));
		C.adicionar(new Cuaderno("Lider", 15.50, "Bolivia",100));
		C.adicionar(new Cuaderno("La Papelera", 25.50, "Bolivia",200));
		
	}
}
