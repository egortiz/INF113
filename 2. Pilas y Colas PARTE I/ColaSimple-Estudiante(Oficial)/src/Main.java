import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CSimpleE csE = new CSimpleE();
		
		//Cargar Cola
		cargarCola(csE);
		csE.mostrar();
		
		// a) Verificar si el estudiante de nombre (X) se encuentra en la cola
		System.out.println(".......................................... SOLUCION A ...............................................");
		System.out.print("Buscar Estudiante(X) ---> ");
		String x = teclado.nextLine();
		System.out.println();
		
		if(verificarEstudiante(csE, x)) {
			System.out.println("Si, Existe el Estudiante: "+x);
		}
		else {
			System.out.println("No, Existe el Estudiante: "+x);
		}
		System.out.println(".....................................................................................................");
		
		
		// b) Mostrar los estudiantes que tengan mas de 20 años
		System.out.println(".......................................... SOLUCION B ...............................................");
		int y = 20;
		buscarMenorE(csE, y);
		System.out.println(".....................................................................................................");
		
		
		// c) Eliminar a los estudiantes que tengan menos de 25 años
		System.out.println(".......................................... SOLUCION C ...............................................");
		int z = 25;
		eliminarMenorE(csE, z);
		System.out.println(".....................................................................................................");
		
		
		
		

	}

	// Cargar Cola
	public static void cargarCola(CSimpleE E) {
		E.adicionar(new Estudiante("3469141","Gonzalo",25));
		E.adicionar(new Estudiante("2370878","Rufina",34));
		E.adicionar(new Estudiante("43045892","Susy",24));
		E.adicionar(new Estudiante("2211441","Pedro",22));
		E.adicionar(new Estudiante("4569878","Eddy",23));
		E.adicionar(new Estudiante("6491417","Carlos",34));
		E.adicionar(new Estudiante("44691141","Juan",17));
		E.adicionar(new Estudiante("56987521","Yazid",18));
		E.adicionar(new Estudiante("22145585","German",36));
		E.adicionar(new Estudiante("3369140","Miriam",18));
	}
	
	// SOLUCION A
	public static boolean verificarEstudiante(CSimpleE E, String X) {
		CSimpleE aux = new CSimpleE();	
		while(!E.esVacia()) {
			Estudiante elem = E.eliminar();
			if(elem.getNombre().equalsIgnoreCase(X)) {
				aux.adicionar(elem);
				aux.vaciar(E);
				E.vaciar(aux);
				return true;
			}
			else {
				aux.adicionar(elem);
			}
		}
		E.vaciar(aux);
		return false;
	}
	
	// SOLUCION B
	public static void buscarMenorE(CSimpleE E, int Y) {
		CSimpleE auxE = new CSimpleE();	
		while(!E.esVacia()) {
			Estudiante elem = E.eliminar();
			if(elem.getEdad()>20) {
				elem.mostrarE();
			}
			auxE.adicionar(elem);
		}
		E.vaciar(auxE);
	}
	
	// SOLUCION C
	public static void eliminarMenorE(CSimpleE E, int Z) {
		CSimpleE auxE = new CSimpleE();	
		CSimpleE auxR = new CSimpleE();
		while(!E.esVacia()) {
			Estudiante elemE = E.eliminar();
			if(elemE.getEdad()>= Z) {
				auxR.adicionar(elemE);	
			}
			auxE.adicionar(elemE);
		}
		E.vaciar(auxE);
		auxR.mostrar();
	}
	
	
}
