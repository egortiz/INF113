import java.util.*;
public class mainEstudiante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Queue<Estudiante> e1 = new LinkedList<Estudiante>();
		
		e1.add(new Estudiante("3469141","Eddy",21));
		e1.add(new Estudiante("73469141","Miriam",22));
		e1.add(new Estudiante("93469141","Carlos",19));
		e1.add(new Estudiante("853469141","Pedro",21));
		e1.add(new Estudiante("72469141","Juan",18));
		e1.add(new Estudiante("72469141","Yazid",17));
		mostrarE(e1);
		
		Queue<Parcial> p1 = new LinkedList<Parcial>();
		p1.add(new Parcial("3469141",80,2));
		p1.add(new Parcial("73469141",80,3));
		p1.add(new Parcial("93469141",80,7));
		p1.add(new Parcial("853469141",80,1));
		p1.add(new Parcial("72469141",80,5));
		p1.add(new Parcial("772469141",80,4));
		p1.add(new Parcial("469141",80,1));
		p1.add(new Parcial("853469141",80,1));
		
		mostrarP(p1);
		
		
		
		// Busqueda ci y Mostrar sus datos
		System.out.println("..................................................................." );
		System.out.print("Buscar  C.I.         ---> ");
		int x = teclado.nextInt();
		busqueda(e1,x);
		
		// Mostrar los parciales del Estudiante con C.I. X 
		mostrarPar(e1,p1,x);
		
		

	}
	// Procedimiento Mostrar Estudiante-Parciales
	public static void mostrarPar(Queue<Estudiante> E, Queue<Parcial> P, int X) {
		Queue<Estudiante> auxE = new LinkedList<Estudiante>();
		Queue<Parcial> auxP = new LinkedList<Parcial>();
		boolean sw = true;
		while(!E.isEmpty()) {
			Estudiante est = E.poll();	
			auxE.add(est);
			String y = Integer.toString(X);
			if(est.getCi().equalsIgnoreCase(y)) {
				est.mostrarE();
				sw = false;
				while(!P.isEmpty()) {
					Parcial par = P.poll();
					auxP.add(par);
					if(par.getCi().equalsIgnoreCase(y)) {
						par.mostrarP();
					}
				}
				vaciarP(P,auxP);
			}
		}
		vaciarE(E,auxE);
		if(sw) {
			System.out.print("No Existe el Estudiante con C.I.: "+X);
		}
		
	}
	// Procedimiento Mostrar Parcial
	public static void mostrarP(Queue<Parcial> P) {
		Queue<Parcial> aux = new LinkedList<Parcial>();
		while(!P.isEmpty()) {
			Parcial w = P.poll();
			w.mostrarP();
			aux.add(w);
			}
		vaciarP(P,aux);
	}
	
	// Procedimiento Vaciar Parcial
	public static void vaciarP(Queue<Parcial> P, Queue<Parcial> aux) {
		while(!aux.isEmpty()) {
			P.add(aux.poll());
			}	
	}
		
	// Procedimiento Buscar Estudiante
	public static void busqueda(Queue<Estudiante> E, int X) {
		Queue<Estudiante> aux = new LinkedList<Estudiante>();
		boolean sw = true;
		while(!E.isEmpty()) {
			Estudiante est = E.poll();
			String y = Integer.toString(X);
			if(est.getCi().equalsIgnoreCase(y)) {
				System.out.println("Nombre: "+est.getNombre());
				sw = false;
			}
			aux.add(est);
		}
		vaciarE(E,aux);
		if(sw) {
			System.out.print("No Existe el Estudiante con C.I.: "+X);
		}
		
	}
	// Procedimiento Mostrar
	public static void mostrarE(Queue<Estudiante> E) {
		Queue<Estudiante> aux = new LinkedList<Estudiante>();
		while(!E.isEmpty()) {
			Estudiante w = E.poll();
			w.mostrarE();
			aux.add(w);
			}
			vaciarE(E,aux);
	}
	// Procedimiento Vaciar
	public static void vaciarE(Queue<Estudiante> E, Queue<Estudiante> AUX) {
		while(!AUX.isEmpty()) {
			E.add(AUX.poll());
			}	
	}

}

