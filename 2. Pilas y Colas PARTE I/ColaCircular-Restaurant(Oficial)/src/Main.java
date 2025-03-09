import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CCircularP ccP = new CCircularP();
		// Cargar Cola Circular
		cargarColaC(ccP);
		ccP.mostrar();
		
		// a) Cuantos Pedidos hay del plato (X)
		System.out.println(".......................................... SOLUCION A ...............................................");
		System.out.print("Buscar Plato(X)      ---> ");
		String x = teclado.nextLine();
		System.out.println();
		contarP1(ccP,x);
		
		int cantidad = contarP2(ccP,x);
		if(cantidad>0) {
			System.out.println("Cantidad de Plato(s),"+x+": "+cantidad);
		}
		else {
			System.out.println("El Plato(s),"+x+": "+"No hay Pedido!!!");
		}
		System.out.println(".....................................................................................................");
		
		// c) Agrupar todos los pedidos por el plato
		System.out.println(".......................................... SOLUCION B ...............................................");
		agruparPlatos1(ccP);
		ccP.mostrar();
		
		System.out.println(".....................................................................................................");
		
		
		// d) Mostrar los platos que se pidieron en mayor cantidad (Sin Contar con los platos agrupados)
		System.out.println(".......................................... SOLUCION C ...............................................");
		MayorCantidadP(ccP);
		System.out.println(".....................................................................................................");
	
		
		// d) Mostrar los platos que se pidieron en mayor cantidad
		System.out.println(".......................................... SOLUCION D ...............................................");
		MayorCantidadP(ccP);
		
		System.out.println(".....................................................................................................");
		
		
		
		
		
	}

	// Cargar Cola Circular
	public static void cargarColaC(CCircularP P) {
		P.adicionar(new Pedido("001","Sajta",2));
		P.adicionar(new Pedido("005","Thimpu",3));
		P.adicionar(new Pedido("004","Milaneza",1));
		P.adicionar(new Pedido("002","Almuerzo",5));
		P.adicionar(new Pedido("003","Silpancho",2));
		P.adicionar(new Pedido("007","Fricase",3));
		P.adicionar(new Pedido("009","Fricase",4));
		P.adicionar(new Pedido("006","Chicharron",1));
		P.adicionar(new Pedido("008","Sajta",2));
		P.adicionar(new Pedido("010","Saice",1));
		P.adicionar(new Pedido("011","Sajta",1));
	}
	
	// SOLUCION A1
	public static void contarP1(CCircularP P, String X) {
		int n = P.nroElem();
		int c = 0;
		for (int i=1;i<=n;i++) {
			Pedido elem = P.eliminar();
			if(elem.getPlato().equalsIgnoreCase(X)) {
				c++;
			}
			P.adicionar(elem);
		}
		System.out.println("Cantidad de Plato(s),"+X+": "+c);	
	}
	// SOLUCION A2
	public static int contarP2(CCircularP P, String X) {
		int n = P.nroElem();
		int c = 0;
		for (int i=1;i<=n;i++) {
			Pedido elem = P.eliminar();
			if(elem.getPlato().equalsIgnoreCase(X)) {
				c++;
			}
			P.adicionar(elem);
		}
		return c;
	}
	
	// SOLUCION B
	public static void agruparPlatos1(CCircularP P) {
		CCircularP aux = new CCircularP();
		CCircularP R = new CCircularP();
		while(!P.esVacia()) {
			Pedido elem1 = P.eliminar();
			R.adicionar(elem1);
			while (!P.esVacia()) {
				Pedido elem2 = P.eliminar();
				if(elem2.getPlato().equalsIgnoreCase(elem1.getPlato())) {
					R.adicionar(elem2);
				}
				else {
					aux.adicionar(elem2);
				}
			}
			P.vaciar(aux);
		}
		P.vaciar(R);
	}
	
	// SOLUCION C
	public static void MayorCantidadP(CCircularP P) {
		int mayorC = obtenerMayor(P);
	
		int n = P.nroElem();
		int mayor = Integer.MIN_VALUE;
		for (int i=1;i<=n;i++) {
			Pedido elem = P.eliminar();
			if(elem.getCantidad()== mayorC) {
				elem.mostrarP();
			}
			P.adicionar(elem);
		}
	}
	// Funcion Obtener mayor
	public static int obtenerMayor(CCircularP P) {
		int n = P.nroElem();
		int mayor = Integer.MIN_VALUE;
		for (int i=0;i<n;i++) {
			Pedido elem = P.eliminar();
			if(elem.getCantidad()>mayor) {
				mayor = elem.getCantidad();
			}
			P.adicionar(elem);
		}
		return mayor;
	}
	
	// SOLUCION D
	private static void solD(CCircularP A) {
		CCircularP B = new CCircularP();
		copiarSinRepetidos(B, A);
		int may = obtMayAgrupando(B, A);
		int n = B.nroElem();
		for (int i = 1; i <= n; i++) {
			Pedido x = B.eliminar();
			int cx = contarCantidades(A, x.getPlato());
			if (cx == may)
				System.out.println("Nombre del plato: " + x.getPlato());
			B.adicionar(x);
		}
	}

	private static int obtMayAgrupando(CCircularP B, CCircularP A) {
		int may = Integer.MIN_VALUE;
		int n = B.nroElem();
		for (int i = 1; i <= n; i++) {
			Pedido x = B.eliminar();
			int cx = contarCantidades(A, x.getPlato());
			if (cx > may)
				may = cx;
			B.adicionar(x);
		}
		return may;
	}

	private static int contarCantidades(CCircularP A, String px) {
		int n = A.nroElem();
		int c = 0;
		for (int i = 1; i <= n; i++) {
			Pedido x = A.eliminar();
			if (x.getPlato().equalsIgnoreCase(px))
				c += x.getCantidad();
			A.adicionar(x);
		}
		return c;
	}

	private static void copiarSinRepetidos(CCircularP B, CCircularP A) {
		int n = A.nroElem();
		for (int i = 1; i <= n; i++) {
			Pedido x = A.eliminar();
			if (contarP2(B, x.getPlato()) == 0) // existe(B,platoX)
				B.adicionar(x);
			A.adicionar(x);
		}
	}

	
	




}
