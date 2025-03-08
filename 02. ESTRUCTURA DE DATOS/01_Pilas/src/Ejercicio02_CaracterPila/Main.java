package Ejercicio02_CaracterPila;
import java.util.*;

import Ejercicio01_EnteroPila.Entero;

public class Main {
	
	public static void main(String[] args) {
		PilaCaracter c1 = new PilaCaracter();
		
		//Leer Pila Caracteres
		//leerCaracter(c1);
		
		//Cargar Pila de Caracteres
		cargarPila(c1);
		
		//Mostrar Pila
		System.out.println("\nPILA ORIGINAL");
		c1.mostrar();
		
		//Dada una pila de Datos que contiene Caracteres eliminar las vocales.
		solucion(c1);
		System.out.println("\nPILA RESULTADO");
		c1.mostrar();

	}
	
	// Solucion
	public static void solucion(PilaCaracter C1) {
		PilaCaracter aux = new PilaCaracter();
		String vocales = "aeiouAEIOU";
		Caracter dato;
		
		while (!C1.esVacia()) {
			dato=C1.eliminar();
			if (vocales.indexOf(dato.getCaracter()) == -1) {
			    aux.adicionar(dato);
			} 
		}
		C1.vaciar(aux);	
	}	

	//Cargar Caracteres
	public static void cargarPila(PilaCaracter C1) {
		C1.adicionar(new Caracter('o'));
		C1.adicionar(new Caracter('t'));
		C1.adicionar(new Caracter('o'));
		C1.adicionar(new Caracter('r'));
		C1.adicionar(new Caracter('r'));
		C1.adicionar(new Caracter('i'));
		C1.adicionar(new Caracter('n'));
		C1.adicionar(new Caracter('o'));
		C1.adicionar(new Caracter('l'));
		C1.adicionar(new Caracter('a'));
		C1.adicionar(new Caracter('r'));
		C1.adicionar(new Caracter('i'));
		C1.adicionar(new Caracter('n'));
		C1.adicionar(new Caracter('g'));
		C1.adicionar(new Caracter('o'));
		C1.adicionar(new Caracter('l'));
		C1.adicionar(new Caracter('o'));
		C1.adicionar(new Caracter('g'));
		C1.adicionar(new Caracter('o'));
	}
	
	//Leer Caracter
	public static void leerCaracter(PilaCaracter C1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cant. Caracteres (n): ");
		int n = teclado.nextInt();
		
		for(int i=1;i<=n;i++) {
			Caracter elemento = new Caracter();
			elemento.leerCaracter();
			C1.adicionar(elemento);	
		}
		
	}
}
