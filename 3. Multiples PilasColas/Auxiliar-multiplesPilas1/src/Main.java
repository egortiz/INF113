import java.util.*;
import java.util.zip.ZipEntry;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		multiplePilaMateria mpm = new multiplePilaMateria();
		
		// Llenar Multiple Pila
		llenarMultPila(mpm);
		// Mostrar Multiple Pila
		mpm.mostrar();
		
		
		// a) Mostrar las Materias con la cantidad Mayor a Estudiantes
		System.out.println("\n................................................................................" );
		System.out.println("................................. SOLUCION A ...................................");
		System.out.print("Nro. Estudiantes     ---> ");
		int x = teclado.nextInt();
		buscarCantidadE(mpm,x);
		
		System.out.println("................................................................................" );
		
		
		// b) Mostrar la(s) Materia con mas Estudiantes
		System.out.println("\n................................................................................" );
		System.out.println("................................. SOLUCION B ...................................");
		buscarMateriaMayorE(mpm);
		
		System.out.println("................................................................................" );
		
		
		// c) Eliminar la Semestre del Segundo Semestre si existe
		System.out.println("\n................................................................................" );
		System.out.println("................................. SOLUCION C ...................................");
		/*System.out.print("Ingrese Nro.Pilas (X)---> ");
		int y = teclado.nextInt();*/
		int y = 2;
		
		eliminarSemestre(mpm,y);
		
		
		
		

	}

	// Procedimiento LLenar Multiple Pila de Materias
	public static void llenarMultPila(multiplePilaMateria MPM) {
		Scanner teclado = new Scanner(System.in);
		/*System.out.print("Ingrese Nro.Pilas (X)---> ");
		int x = teclado.nextInt();*/
		int x = 3;
		MPM.setNp(x);
		
		MPM.setSemestre(0, "Primer Semestre"); //<--- Parametro
		MPM.adicionar(0, new Materia("Estadistica","EST-111",100));
		MPM.adicionar(0, new Materia("Calculo I","MAT-111",150));
		MPM.adicionar(0, new Materia("Calculo II","EST-112",180));
		MPM.adicionar(0, new Materia("Fisica I","FIS-111",120));
		MPM.adicionar(0, new Materia("Fisica II","FIS-112",110));
		
		MPM.setSemestre(1, "Segundo Semestre"); //<--- Parametro
		MPM.adicionar(1, new Materia("Quimica I","QMC-111",90));
		MPM.adicionar(1, new Materia("Lenguaje I","LIN-111",150));
		MPM.adicionar(1, new Materia("Laboratorio I","LAB-112",80));
		MPM.adicionar(1, new Materia("Laboratorio II","LAB-113",180));
		
		MPM.setSemestre(2, "Tercer Semestre"); //<--- Parametro
		MPM.adicionar(2, new Materia("Ingles I","ING-111",80));
		MPM.adicionar(2, new Materia("Literatura","LIT-118",160));
		MPM.adicionar(2, new Materia("Ingles II ","ING-112",80));
	}
	
	// SOLUCION A
	public static void buscarCantidadE(multiplePilaMateria MPM, int X) {
		pilaMateria aux = new pilaMateria();	
		for (int i=0;i<MPM.getNp();i++) {
			while (!MPM.esVacia(i)) {
				Materia elem = MPM.eliminar(i);
				aux.adicionar(elem);
				if(elem.getNroEst() > X) {
					elem.mostrarM();
				}
			}
			MPM.vaciar(i, aux);
		}
	}
	
	// SOLUCION B
	public static void buscarMateriaMayorE(multiplePilaMateria MPM) {
		pilaMateria aux = new pilaMateria();
		int mayor = 0;
		for (int i=0;i<MPM.getNp();i++){
			while (!MPM.esVacia(i)) {
				Materia elem = MPM.eliminar(i);
				aux.adicionar(elem);
				if(elem.getNroEst()> mayor) {
					mayor = elem.getNroEst();
				}
			}
			MPM.vaciar(i, aux);
		}
		for (int i=0;i<MPM.getNp();i++){
			while (!MPM.esVacia(i)) {
				Materia elem = MPM.eliminar(i);
				aux.adicionar(elem);
				if(elem.getNroEst() == mayor) {
					elem.mostrarM();
				}
			}
			MPM.vaciar(i, aux);
		}
	}
	
	//SOLUCION C
	public static void eliminarSemestre(multiplePilaMateria MPM, int Y) {
		while(!MPM.esVacia(1)) {
			Materia elem = MPM.eliminar(1);
		}
		for (int i=1;i< MPM.getNp(); i++) {
			MPM.vaciar(i, i+1);	
			String semestre = MPM.getSemestre(i+1);
			MPM.setSemestre(i, semestre);
		}
		MPM.setNp(MPM.getNp()-1);
		MPM.mostrar();
	}
}
