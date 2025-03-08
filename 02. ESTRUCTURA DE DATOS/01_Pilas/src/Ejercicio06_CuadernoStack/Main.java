package Ejercicio06_CuadernoStack;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Stack<Cuaderno> c1 = new Stack<Cuaderno>();
		
		//leer Cuadernos
		//leerCuaderno(c1);
		
		//Cargar Cuaderno
		cargarCuaderno(c1);
		
		//mostrar Stack de cuaderno
		mostrarStack(c1);
		
		
		//b) Hallar la inversion total de los cuadernos
		//System.out.println("\nSOLUCION (B)");
		//solucionB(c1);
		
		//c) Dada una marca (Z) cuantos cuaderno existen
		//System.out.println("\nSOLUCION (C)");
		//solucionC(c1);
		
		//d) Mostrar el cuaderno con mas hojas
		System.out.println("\nSOLUCION (D)");
		solucionD(c1);
		
	}
	//SOLUCION_D
	public static void solucionD(Stack<Cuaderno> c1) {
		Stack<Cuaderno> stackAux = new Stack<>();
		int mayor = buscarMayor(c1);
		
		while(!c1.isEmpty()) {
			Cuaderno elementoCuaderno;
			elementoCuaderno = c1.pop();
			if(elementoCuaderno.getNroHojas() == mayor) {
				System.out.println(elementoCuaderno);
			}
			stackAux.add(elementoCuaderno);	
		}
		vaciarStack(c1, stackAux);
	}
	
	//Buscar Mayor
	public static int buscarMayor(Stack<Cuaderno> c1) {
		Stack<Cuaderno> stackAux = new Stack<>();
		Cuaderno elementoCuaderno;
		elementoCuaderno = c1.pop();
		int mayor= elementoCuaderno.getNroHojas();
		stackAux.add(elementoCuaderno);
		vaciarStack(c1, stackAux);
		
		while(!c1.isEmpty()) {
			elementoCuaderno = c1.pop();
			if(elementoCuaderno.getNroHojas()>mayor) {
				mayor=elementoCuaderno.getNroHojas();
			}
		stackAux.add(elementoCuaderno);	
		}
		vaciarStack(c1, stackAux);
		return mayor;
	}
	//SOLUCION_C
	public static void solucionC(Stack<Cuaderno> c1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Marca (k): ");
		String Z = teclado.nextLine();
		int contador = 0;
		
		Stack<Cuaderno> stackAux = new Stack<>();
		while (!c1.isEmpty()) {
			Cuaderno elementoCuaderno;
			elementoCuaderno = c1.pop();
			if(elementoCuaderno.getMarca().equalsIgnoreCase(Z)) {
				contador++;
			}
		stackAux.add(elementoCuaderno);	
		}
		vaciarStack(c1, stackAux);
		System.out.println("Existe, "+contador+" cuaderno(s)"+" de la Marca "+Z);
	}

	//SOLUCION_B
	public static void solucionB(Stack<Cuaderno> c1) {
		Stack<Cuaderno> stackAux = new Stack<>();
		double total = 0;
		while (!c1.isEmpty()) {
			Cuaderno elementoCuaderno;
			elementoCuaderno = c1.pop();
			total+=elementoCuaderno.getPrecio();
			
		stackAux.add(elementoCuaderno);
		}
		vaciarStack(c1,stackAux);
		System.out.println("Total inversion: "+total+" Bs.");
	}

	//Mostrar Stack
	public static void mostrarStack(Stack<Cuaderno> c1) {
		Stack<Cuaderno> stackAux = new Stack<>();
		System.out.println ("Cuaderno(s) de la Pila ");
		
		System.out.println("*************************************************************************************");
		while (!c1.isEmpty()) {
			Cuaderno elementoCuaderno;
			elementoCuaderno = c1.pop();
			System.out.println(elementoCuaderno);
			stackAux.push(elementoCuaderno);
		}
		vaciarStack(c1, stackAux);
		System.out.println("*************************************************************************************");
		
		
	}
	
	//Restaurar el stack original
	public static void vaciarStack(Stack<Cuaderno> c1, Stack<Cuaderno> stackAux) {
        while (!stackAux.isEmpty()) {
            c1.push(stackAux.pop());
        }
    }

	//Leer Cuaderno
	public static void leerCuaderno(Stack<Cuaderno> c1) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nro.Cuadernos: ");
		int n = teclado.nextInt();
		
		for (int i=1;i<=n;i++) {
			Cuaderno elementoCuaderno = new Cuaderno();
			elementoCuaderno.leerCuaderno();
			c1.push(elementoCuaderno); 
		}
	}
	
	//Cargar Cuaderno
	public static void cargarCuaderno(Stack<Cuaderno> C) {
		Cuaderno elementoCua1 = new Cuaderno("PapelBOL", 10.00, "Bolivia",800);
		Cuaderno elementoCua2 = new Cuaderno("ABC", 20.00, "Bolivia",200);
		Cuaderno elementoCua3 = new Cuaderno("TOP", 12.00, "Bolivia",200);
		Cuaderno elementoCua4 = new Cuaderno("Lider", 15.50, "Bolivia",100);
		Cuaderno elementoCua5 = new Cuaderno("La Papelera", 25.50, "Bolivia",200);

		C.push(elementoCua1);
		C.push(elementoCua2);
		C.push(elementoCua3);
		C.push(elementoCua4);
		C.push(elementoCua5);	
	}
}
