*import java.util.*;
public class mainCola {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		colaSimpleEstudiantes ce = new colaSimpleEstudiantes();
		llenar(ce);
		ce.mostrar();
		
		// a) Verificar si el estudiante (X) esta en la cola
		System.out.println("................................................................................" );
		System.out.println("--------------------- SOLUCION A ---------------------");
		System.out.print("Verificar Nombre(X)  ---> ");
		String x = teclado.nextLine();
		
		if(verificarEst(ce,x)) {
			System.out.println("Si, Existe el Estudiante "+"("+x+")"+" en la cola");
		}
		else {
			System.out.println("No, Existe el Estudiante "+"("+x+")"+" en la cola");
		}
		ce.mostrar();
		
		// b) Mostrar los estudiantes que tengas menos de 20 años
		System.out.println("................................................................................" );
		System.out.println("--------------------- SOLUCION B ---------------------");
		int y = 20;
		mostrarEst(ce,y);
		ce.mostrar();
		
		
		// c) Eliminar los estudiantes que tengas menos de 25 años
		System.out.println("................................................................................" );
		System.out.println("--------------------- SOLUCION C ---------------------");
		int z = 25;
		eliminarEst(ce,z);
		ce.mostrar();
		
		
	}

	// Procedimiento LLenar
	public static void llenar(colaSimpleEstudiantes CE) {
		CE.adicionar(new Estudiante("Gonzalo","3469141",24));
		CE.adicionar(new Estudiante("Rufina","2370878",26));
		CE.adicionar(new Estudiante("Carlos","43499141",28));
		CE.adicionar(new Estudiante("Yazid","93469141",17));
		CE.adicionar(new Estudiante("Eddy","53469134",19));
		CE.adicionar(new Estudiante("Juan","443469141",20));
		CE.adicionar(new Estudiante("Pedro","2211441",34));
	}
	// a) Procedimiento Verificar Estudiante
	public static boolean verificarEst(colaSimpleEstudiantes CE, String X) {
		colaSimpleEstudiantes aux = new colaSimpleEstudiantes();
		while(!CE.esVacia()) {
			Estudiante elem = CE.eliminar();
			if(elem.getNombre().equalsIgnoreCase(X)) {
				aux.adicionar(elem);
				aux.vaciar(CE);
				CE.vaciar(aux);
				return true;
			}
			else {
				aux.adicionar(elem);
				}
		}
		CE.vaciar(aux);
		return false;
	}
	// b) Mostrar Estudiantes mas de 20 años
	public static void mostrarEst(colaSimpleEstudiantes CE, int Y) {
		colaSimpleEstudiantes aux = new colaSimpleEstudiantes();
		while(!CE.esVacia()) {
			Estudiante elem = CE.eliminar();
			aux.adicionar(elem);
			if(elem.getEdad()>= Y) {
				elem.mostrarE();
			}
		}
		CE.vaciar(aux);
	}

	
	// c) Eliminar los Estudiantes menores 25 años
	public static void eliminarEst(colaSimpleEstudiantes CE, int Z) {
		colaSimpleEstudiantes aux = new colaSimpleEstudiantes();
		while(!CE.esVacia()) {
			Estudiante elem = CE.eliminar();
			if(elem.getEdad()>= Z) {
				aux.adicionar(elem);
			}
		}
		CE.vaciar(aux);	
	}

}
