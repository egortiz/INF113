import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaZ pZ = new PilaZ();
		PilaA pA = new PilaA();
		
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION A .....................................");
		// Cargar Pilas
		cargarPilas(pZ, pA);
		pZ.mostrar();
		pA.mostrar();
		
		// b) Mostrar los estudiantes del semestre X
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION B .....................................");
		System.out.print("Buscar Zona (X)      ---> ");
		String x = teclado.nextLine();
		mostrarArbolesZX(pZ, pA, x);
		
		System.out.println(".....................................................................................");
		
		// c) Mostrar el nombre de la zona con mayor cantidad de arboles
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION C .....................................");
		mostrarZonaMA(pZ, pA);
		System.out.println(".....................................................................................");
						
		
	}

	// Cargar Pilas
	public static void cargarPilas(PilaZ Z, PilaA A) {
		Z.adicionar(new Zona(1,"Ciudadela","Max Paredes"));
		Z.adicionar(new Zona(2,"Pura Pura","Max Paredes"));
		Z.adicionar(new Zona(3,"Achachicala","Max Paredes"));
		Z.adicionar(new Zona(4,"Alto Ciudadela","Max Paredes"));
		Z.adicionar(new Zona(7,"Sopocachi","Cotahuma"));
		Z.adicionar(new Zona(6,"Tembladerani","Cotahuma"));
		Z.adicionar(new Zona(5,"Tacahua","Cotahuma"));
		Z.adicionar(new Zona(10,"Munaypata","Portada"));
		Z.adicionar(new Zona(11,"Portada","Portada"));
		Z.adicionar(new Zona(8,"El Tejar","Portada"));
		Z.adicionar(new Zona(9,"Portada","Portada"));
		Z.adicionar(new Zona(12,"Cota Cota","Zona Sur"));
		
		A.adicionar(new Arbol(2, "Eucalipto", 15.50, 15, "Bosquecillo"));
		A.adicionar(new Arbol(2, "Eucalipto", 25.15, 30, "Bosquecillo"));
		A.adicionar(new Arbol(2, "Eucalipto", 20.65, 20, "Bosquecillo"));
		A.adicionar(new Arbol(1, "Acacia", 10.2, 5, "Rieles"));
		A.adicionar(new Arbol(1, "Pino", 20.4, 12, "Rieles"));
		A.adicionar(new Arbol(12, "Eucalipto", 30.5, 9, "Cota Cota"));
		A.adicionar(new Arbol(12, "Pino", 21.5, 4, "Cota Cota"));
		A.adicionar(new Arbol(10, "Acacia", 5.0, 5, "Bosquecillo"));
		A.adicionar(new Arbol(6, "Kiswara", 2.10, 8, "San Luis"));
		A.adicionar(new Arbol(5, "Nogal", 35.5, 10, "Alto Tacahua"));	
	}
	
	// SOLUCION B
	public static void mostrarArbolesZX(PilaZ Z, PilaA A, String X) {
		PilaZ auxZ = new PilaZ();
		PilaA auxA = new PilaA();
		while (!Z.esVacia()) {
			Zona elemZ = Z.eliminar();
			if(elemZ.getNombre().equalsIgnoreCase(X)) {
				elemZ.mostrarZ();
				System.out.println("*************************************************************************************");
				while(!A.esVacia()) {
					Arbol elemA = A.eliminar();
					if(elemZ.getIdZona( )== elemA.getIdZona()) {
						elemA.mostrarA();
					}
					auxA.adicionar(elemA);
				}
				A.vaciar(auxA);
			}
			auxZ.adicionar(elemZ);
		}
		Z.vaciar(auxZ);
	}
	
	// SOLUCION C
	public static void mostrarZonaMA(PilaZ Z, PilaA A) {
		int mayorCA = obtenerMayorCA(Z,A);
		PilaZ auxZ = new PilaZ();
		while (!Z.esVacia()) {
			Zona elemZ = Z.eliminar();
			int ca = contadorArboles(A, elemZ.getIdZona());
			if(ca == mayorCA) {
				elemZ.mostrarZ();
			}
			auxZ.adicionar(elemZ);
		}
		Z.vaciar(auxZ);	
	}
	// Funcion obtener mayor
	public static int obtenerMayorCA(PilaZ Z, PilaA A) {
		int mayor = Integer.MIN_VALUE;
		PilaZ auxZ = new PilaZ();
		while (!Z.esVacia()) {
			Zona elemZ = Z.eliminar();
			int ca = contadorArboles(A,elemZ.getIdZona());
			if(ca > mayor) {
				mayor = ca;
			}
			auxZ.adicionar(elemZ);
		}
		Z.vaciar(auxZ);
		return mayor;
	}
	// Funcion contador de Arboles
	public static int contadorArboles(PilaA A, int I) {
		int c = 0;
		PilaA auxA = new PilaA();
		while (!A.esVacia()) {
			Arbol elemA = A.eliminar();
			if(elemA.getIdZona() == I) {
				c++;
			}
			auxA.adicionar(elemA);
		}
		A.vaciar(auxA);
		return c;
	}

	
}
