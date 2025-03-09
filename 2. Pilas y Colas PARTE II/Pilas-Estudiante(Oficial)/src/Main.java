import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaE pe = new PilaE();
		
		// Cargar Pila Estudiantes
		cargarEstudiante(pe);
		pe.mostrar();
		
		// Mostrar los estudiantes del semestre X
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION A .....................................");
		System.out.print("Buscar Semestre (X)  ---> ");
		int x = teclado.nextInt();
		buscarEstX(pe,x);
		
		System.out.println(".....................................................................................");
		
		
		//b) Verificar si existe el estudiante de nombre (X)
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION B .....................................");
		System.out.print("Buscar Estudiante (X)---> ");
		String y = teclado.next();
		
		if(ExisteE(pe,y)) {
			System.out.println("Si Existe, el Estudiante de Nombre: "+y);
		}
		else {
			System.out.println("No Existe, el Estudiante de Nombre: "+y);
			
		}
		System.out.println(".....................................................................................");
		

		//c) Mostrar a los mejores estudiantes
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION C .....................................");
		mostrarMejoresE(pe);
		pe.mostrar();
		System.out.println(".....................................................................................");
		
		
		//d) Ordenar la pila segun el promedio
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION D .....................................");
		ordenarPromedio(pe);
		pe.mostrar();
		System.out.println(".....................................................................................");
		
		//e) Adicionar un nuevo estudiante en el Tope de la pila
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION E .....................................");
		adicionarEst(pe);
		pe.mostrar();
		System.out.println(".....................................................................................");
		
		
		//e) Adicionar un nuevo estudiante en el Tope de la pila
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION F .....................................");
		System.out.print("Semestre          (X)---> ");
		int z = teclado.nextInt();
		eliminarEst(pe,z);
		pe.mostrar();
		System.out.println(".....................................................................................");
		
		
		//g) Incrementar el promedio a 100 a todos los estudiantes que tengan un promedio actual de mayor a 95
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION G .....................................");
		double w = 95;
		incrementar(pe,w);
		pe.mostrar();
		
		
	}

	// Cargar Estudiantes
	public static void cargarEstudiante(PilaE PE) {
		PE.adicionar(new Estudiante("Eddy","Ortiz","3469141",2,55.6));
		PE.adicionar(new Estudiante("Carlos","Ortiz","4346141",1,85.5));
		PE.adicionar(new Estudiante("Yazid","Pañuni","78469141",3,51.5));
		PE.adicionar(new Estudiante("Rufina","Mamani","2370878",5,60.8));
		PE.adicionar(new Estudiante("Juan","Machicado","4304698",2,98.0));
		PE.adicionar(new Estudiante("Gonzalo","Ortiz","3569141",2,74.6));
		PE.adicionar(new Estudiante("Pedro","Arenas","237087",6,56.6));
		PE.adicionar(new Estudiante("Miriam","Quispe","3304698",2,98.0));
		
	}
	
	// SOLUCION A
	public static void buscarEstX(PilaE PE, int X) {
		PilaE aux = new PilaE();
		Estudiante elem;
		while (!PE.esVacia()) {
			elem = PE.eliminar();
			if(elem.getSemestre()==X) {
				elem.mostrarE();
			}
			aux.adicionar(elem);
		}
		PE.vaciar(aux);		
	}
	// SOLUCION B
	public static boolean ExisteE(PilaE PE, String y) {
		PilaE aux = new PilaE();
		while(!PE.esVacia()) {
			Estudiante elem = PE.eliminar();
			if(elem.getNombre().equalsIgnoreCase(y)) {
				PE.adicionar(elem);
				PE.vaciar(aux);
				return true;
			}
			else {
				aux.adicionar(elem);
			}
		}
		PE.vaciar(aux);
		return false;
	}
	// SOLUCION C
	public static void mostrarMejoresE(PilaE PE) {
		double mayor = mayorNota(PE);
		PilaE aux = new PilaE();
		while(!PE.esVacia()) {
			Estudiante elem = PE.eliminar();
			if(elem.getPromedio()== mayor) {
				elem.mostrarE();
			}
			aux.adicionar(elem);
		}
		PE.vaciar(aux);	
	}
	// Funcion devuelve mayor nota
	public static double mayorNota(PilaE PE) {
		double mayor = Double.MIN_VALUE;
		PilaE aux = new PilaE();
		while(!PE.esVacia()) {
			Estudiante elem = PE.eliminar();
			if(elem.getPromedio()>mayor) {
				mayor = elem.getPromedio();
			}
			aux.adicionar(elem);	
		}
		PE.vaciar(aux);
		return mayor;
	}
	// SOLUCION D
	public static void ordenarPromedio(PilaE PE) {
		PilaE aux = new PilaE();
		PilaE R = new PilaE();
		while(!PE.esVacia()) {
			Estudiante mayor = PE.eliminar();
			while (!PE.esVacia()) {
				Estudiante elem = PE.eliminar();
				if(elem.getPromedio() > mayor.getPromedio()) {
					aux.adicionar(mayor);
					mayor = elem;	
				}
				else {
					aux.adicionar(elem);
				}
			}
			PE.vaciar(aux);
			R.adicionar(mayor);
		}
		PE.vaciar(R);
	}
	
	// SOLUCION E
	public static void adicionarEst(PilaE PE) {
		Estudiante nuevo = new Estudiante();
		nuevo.leerE();
		PE.adicionar(nuevo);	
	}
	
	// SOLUCION F
	public static void eliminarEst(PilaE PE, int Z) {
		PilaE aux = new PilaE();
		while(!PE.esVacia()) {
			Estudiante elem = PE.eliminar();
			if(elem.getSemestre()!= Z) {
				aux.adicionar(elem);	
			}
		}
		PE.vaciar(aux);	
	}	
	// SOLUCION G
	public static void incrementar(PilaE PE, double W) {
		PilaE aux = new PilaE();
		while(!PE.esVacia()) {
			Estudiante elem = PE.eliminar();
			if(elem.getPromedio() >= W) {
				elem.setPromedio(100);
			}
			aux.adicionar(elem);
		}
		PE.vaciar(aux);
	}
}




	
	
	



