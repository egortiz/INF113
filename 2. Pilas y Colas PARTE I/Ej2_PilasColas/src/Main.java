import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		colaSimpleAlimentos ca = new colaSimpleAlimentos();
		
		llenar(ca);
		ca.mostrar();
		
		// a) Ordenar de forma ascendente segun el precio
		System.out.println("\n.......................................... SOLUCION A ...............................................");
		solA(ca);
		ca.mostrar();
		System.out.println(".....................................................................................................");
		
		// b) Ordenar de forma descendente Segun el precio
		System.out.println("\n.......................................... SOLUCION B ...............................................");
		solB(ca);
		ca.mostrar();
		System.out.println(".....................................................................................................");
		
		// c) Mostrar el (los) alimentos con mayor precio
		System.out.println("\n.......................................... SOLUCION C ...............................................");
		solC(ca);
		System.out.println(".....................................................................................................");
		

	}
	
	
	// Procedimiento LLenar
	public static void llenar(colaSimpleAlimentos CA) {
		CA.adicionar(new Alimentos("Carne",24.5));
		CA.adicionar(new Alimentos("Leche",6.5));
		CA.adicionar(new Alimentos("Huevo",1.5));
		CA.adicionar(new Alimentos("Pescado",35));
		CA.adicionar(new Alimentos("Pollo",25.5));
		CA.adicionar(new Alimentos("Arroz",2.5));
		CA.adicionar(new Alimentos("Fideo",62.5));
		CA.adicionar(new Alimentos("Azucar",62.5));
		CA.adicionar(new Alimentos("Lenteja",22.6));
	}
	
	// SOLUCION B
	public static void solA(colaSimpleAlimentos A) {
		colaSimpleAlimentos auxA = new colaSimpleAlimentos();
		colaSimpleAlimentos R = new colaSimpleAlimentos();
		
		while(!A.esVacia()) {
			Alimentos menor = A.eliminar();
			while (!A.esVacia()) {
				Alimentos elem = A.eliminar();
				if(elem.getPrecio() < menor.getPrecio()) {
					auxA.adicionar(menor);
					menor = elem;	
				}
				else {
					auxA.adicionar(elem);
				}
			}
			A.vaciar(auxA);
			R.adicionar(menor);
		}
		A.vaciar(R);
	}
	
	// SOLUCION C
	public static void solB(colaSimpleAlimentos A) {
		colaSimpleAlimentos auxA = new colaSimpleAlimentos();
		colaSimpleAlimentos R = new colaSimpleAlimentos();
		
		while(!A.esVacia()) {
			Alimentos mayor = A.eliminar();
			while (!A.esVacia()) {
				Alimentos elem = A.eliminar();
				if(elem.getPrecio() > mayor.getPrecio()) {
					auxA.adicionar(mayor);
					mayor = elem;	
				}
				else {
					auxA.adicionar(elem);
				}
			}
			A.vaciar(auxA);
			R.adicionar(mayor);
		}
		A.vaciar(R);
	}
	
	// SOLUCION D
	public static void solC(colaSimpleAlimentos A) {
		double mayor = Double.MIN_VALUE;
		colaSimpleAlimentos auxA = new colaSimpleAlimentos();
		while(!A.esVacia()) {
			Alimentos elemA = A.eliminar();
			if( elemA.getPrecio()>= mayor) {
				mayor = elemA.getPrecio();
				System.out.println(elemA);
			}
			auxA.adicionar(elemA);
		}
		A.vaciar(auxA);
	}
		
}