package Practica02_EnteroPila;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		PilaEntero e1 = new PilaEntero();
		
		//Llenar Enteros
		//llenarEntero(e1);
		
		//Cargar Enteros
		cargarDatos(e1);
		
		//Mostrar Pila
		System.out.println("PILA ORIGINAL");
		e1.mostrar();
		 
		// Dada una pila con numeros enteros eliminar el primer y ultimo número entero "impar", si existiera.
		eliminarImpar(e1);
		System.out.println("PILA RESULTADO");
		e1.mostrar();
		

	}
	//Llenar Entero
	public static void llenarEntero(PilaEntero e1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cant. Entero (n): ");
		int n = teclado.nextInt();
		
		for(int i=1;i<=n;i++) {
			Entero entero = new Entero();
			entero.leerEntero();
			e1.adicionar(entero);
		}
		
	}
	
	//Solucion
	private static void eliminarImpar(PilaEntero E1) {
		if(verificarImparPila(E1)==true) {
			eliminarElemento(E1);
		}
		else {
			System.out.println("NO TIENE IMPARES EN EL 1er y ultimo ELEMENTO DE LA PILA");
		}
	}


	// Elimina elementos IMPAR
	public static void eliminarElemento(PilaEntero E1) {
		PilaEntero aux = new PilaEntero();
		int cont=1;
		int inicio=1;
		int fin = E1.nroElem();
	
		Entero elemento;
		while (!E1.esVacia()) {
			elemento=E1.eliminar();
			if(cont==inicio || cont==fin  ) {
				System.out.println(elemento+" "+"<== eliminado");
			}
			else {
				aux.adicionar(elemento);
			}
			cont++;
		}
		E1.vaciar(aux);
		
		
	}
	// Verificar Pila IMPAR
	public static boolean verificarImparPila(PilaEntero E1) {
		PilaEntero aux = new PilaEntero();
		int cont=1, k=0;
		int z = E1.nroElem();
		Entero elemento;

		while (!E1.esVacia()) {
			elemento=E1.eliminar();
			aux.adicionar(elemento);
			if(cont==1 || cont==z) {
				if(verificarImpar(elemento.getNumero())==false) {
					k++;	
				}
			}
			cont++;
		}
		E1.vaciar(aux);
		
		if(k==2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Verificar numero IMPAR
	public static boolean verificarImpar(int E) {
		if(E % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Llenar Pila de Enteros
	public static void cargarDatos(PilaEntero e1) {
		e1.adicionar( new Entero(1));
		e1.adicionar( new Entero(2));
		e1.adicionar( new Entero(3));
		e1.adicionar( new Entero(4));
		e1.adicionar( new Entero(5));
		e1.adicionar( new Entero(6));
		e1.adicionar( new Entero(7));
		e1.adicionar( new Entero(8));
		e1.adicionar( new Entero(9));
		e1.adicionar( new Entero(10));
		e1.adicionar( new Entero(11));
	}

}
