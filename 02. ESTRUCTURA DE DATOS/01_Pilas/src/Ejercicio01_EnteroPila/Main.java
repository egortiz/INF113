package Ejercicio01_EnteroPila;

import java.lang.classfile.ClassFile.DebugElementsOption;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		PilaEntero e1 = new PilaEntero();

		// Cargar Datos
		// cargarDatos(e1);

		// Leer Datos
		leerDatos(e1);

		// Mostrar Pila
		System.out.println("PILA ORIGINAL");
		e1.mostrar();

		// Dada una pila que contiene datos enteros, duplicar los mas pequeños datos
		Solucion(e1);
		System.out.println("PILA RESULTADO");
		e1.mostrar();
	}

	// Leer_Datos
	public static void leerDatos(PilaEntero E1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca Cant. Enteros (n): ");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			Entero elemento = new Entero();
			elemento.leerEntero();
			E1.adicionar(elemento);
		}

	}

	// Solucion
	public static void Solucion(PilaEntero E1) {
		int menor = buscarMenor(E1);
		PilaEntero aux = new PilaEntero();
		Entero dato;

		while (!E1.esVacia()) {
			dato = E1.eliminar();
			if (dato.getNumero() == menor) {
				int k = dato.getNumero() * 2;
				dato.setNumero(k);
			}
			aux.adicionar(dato);
		}
		E1.vaciar(aux);
	}

	// Buscar Menor
	public static int buscarMenor(PilaEntero E1) {
		PilaEntero aux = new PilaEntero();
		Entero dato;

		dato = E1.eliminar();
		int menor = dato.getNumero();
		aux.adicionar(dato);

		while (!E1.esVacia()) {
			dato = E1.eliminar();
			if (dato.getNumero() <= menor) {
				menor = dato.getNumero();
			}
			aux.adicionar(dato);
		}
		E1.vaciar(aux);
		return menor;
	}

	// Cargar Datos
	public static void cargarDatos(PilaEntero E1) {
		E1.adicionar(new Entero(3));
		E1.adicionar(new Entero(8));
		E1.adicionar(new Entero(1));
		E1.adicionar(new Entero(4));
		E1.adicionar(new Entero(1));
		E1.adicionar(new Entero(3));
		E1.adicionar(new Entero(9));
	}

}
