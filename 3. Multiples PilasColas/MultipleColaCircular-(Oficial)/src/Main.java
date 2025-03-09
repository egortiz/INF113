import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		MColaCircular mcC = new MColaCircular();
		
		//Cargar Datos a la Multiple Cola Circular
		cargarDatos(mcC);
		mcC.mostrar();
		
		
	   // a) Mostrar los grupos que tienen la menor cantidad de niños
		System.out.println("\n.......................................... SOLUCION A ...............................................");
		solA(mcC);
		System.out.println(".....................................................................................................");
		
		
		// b) Mostrar a todo el grupo de niños donde se encuentre el niño (X) y sus Responsables
		System.out.println("\n.......................................... SOLUCION B ...............................................");
		System.out.print("Buscar Ninio (X)     ---> ");
		String x = teclado.nextLine();
		solB(mcC,x);
		System.out.println(".....................................................................................................");
	}

	// Procedimiento Cargar Datos
	public static void cargarDatos(MColaCircular MCD) {
		// Estructura mas interna
		ColaCircularNi c1 = new ColaCircularNi();
		c1.adicionar(new Ninio("Yazid",10));
		c1.adicionar(new Ninio("Juan",11));
		c1.adicionar(new Ninio("Fabio",10));
		
		ColaCircularNi c2 = new ColaCircularNi();
		c2.adicionar(new Ninio("Karim",12));
		c2.adicionar(new Ninio("Federico",12));
		
		ColaCircularNi c3 = new ColaCircularNi();
		c3.adicionar(new Ninio("Pedro",11));
		c3.adicionar(new Ninio("Celestino",10));
		
		ColaCircularNi c4 = new ColaCircularNi();
		c4.adicionar(new Ninio("Eddy",11));
		c4.adicionar(new Ninio("Fabio",12));
		c4.adicionar(new Ninio("Milenka",12));
		
		ColaCircularNi c5 = new ColaCircularNi();
		c5.adicionar(new Ninio("Gonzalo",10));
		c5.adicionar(new Ninio("Jazmin",12));
		
		ColaCircularNi c6 = new ColaCircularNi();
		c6.adicionar(new Ninio("Diego",11));
		
		
		// Seteamos el numero de colas a usar
		MCD.setNc(3);
		
		// Llenamos los datos de las colas creadas
		MCD.adicionar(1,new Datos("Ximena","Susy",c1));
		MCD.adicionar(1,new Datos("Paola","Juan",c2));
		MCD.adicionar(1,new Datos("Esteban","Luis",c3));
		
		MCD.adicionar(2,new Datos("Ignacio","Pablo",c4));
		MCD.adicionar(2,new Datos("Alberto","Joaquin",c5));
		
		MCD.adicionar(3,new Datos("Miriam","Raul",c6));
		
	}
	
	// SOLUCION A
	public static void solA(MColaCircular MCC) {
		int menorCN = obtenerMenorCN(MCC);
		int nc = MCC.getNc();            // Nro de elementos del Vector
		for(int i=1;i<=nc;i++) {         // Recorre todo el vector
			int cn = 0;
			int n = MCC.nroElem(i);     // Posicion de elementos de la Cola Circular
			for (int j=1;j<=n;j++) {    // Recorre cada elemento que tiene la Cola Circular
				Datos elem = MCC.eliminar(i);
				cn = cn + elem.getColaNinio().nroElem();
				MCC.adicionar(i, elem);
			}
			if(cn==menorCN) {
				System.out.println("Cantidad de Ninios: "+menorCN);
				MCC.mostrar(i);
			}
		}
	}

	// Funcion Obtener Menor cantidad de Niños
	public static int obtenerMenorCN(MColaCircular MCC) {
		int menor = Integer.MAX_VALUE;
		int nc = MCC.getNc();                   // Nro de elementos del Vector
		for(int i=1;i<=nc;i++) {                // Recorre todo el vector
			int cn = 0;
			int ne = MCC.nroElem(i);            // Posición de elementos de la Cola Circular
			for (int j=1;j<=ne;j++) {           // Recorre cada elemento que tiene la Cola Circular
				Datos elem = MCC.eliminar(i);
				cn = cn + elem.getColaNinio().nroElem();
				MCC.adicionar(i, elem);
			}
			if(cn<menor) {
				menor = cn;
			}
		}
		return menor;
	}
	
	// SOLUCION B
	public static void solB(MColaCircular MCC, String x) {
		int nc = MCC.getNc();            // Nro de elementos del Vector
		for(int i=1;i<=nc;i++) {
			int n = MCC.nroElem(i);     // Posicion de elementos de la Cola Circular
			for (int j=1;j<=n;j++) { 
				Datos elem = MCC.eliminar(i);
				if(existeNinioA(elem.getColaNinio(), x)) {
					elem.mostrarD();
				}
				MCC.adicionar(i, elem);
			}	
		}
	}
	
	// Funcion busca al ninio (X) A
	public static boolean existeNinioA(ColaCircularNi CN, String X) {
		int n = CN.nroElem();
		boolean sw = false;
		for(int i=1;i<=n;i++) {
			Ninio elem = CN.eliminar();
			if(elem.getNombre().equalsIgnoreCase(X)) {
				sw = true;
			}
			CN.adicionar(elem);
		}
		return sw;
	}
	
	// Funcion busca al ninio (X) B
		public static boolean existeNinioB(ColaCircularNi CN, String X) {
			int n = CN.nroElem();
			for(int i=1;i<=n;i++) {
				Ninio elem = CN.eliminar();
				if(elem.getNombre().equalsIgnoreCase(X)) {
					CN.adicionar(elem);
					for(int z=1;z<=n;z++) {
						CN.adicionar(CN.eliminar());
					}
					return true;
				}
				CN.adicionar(elem);
			}
			return false;
		}
}
