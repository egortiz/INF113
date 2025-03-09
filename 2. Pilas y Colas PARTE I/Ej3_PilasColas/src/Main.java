import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CSimplePE csP = new CSimplePE();
		Combo c = new Combo();
		CCircularCO cC = new CCircularCO();
		

		// Cargar Cola Circular1
		cargarCC1(c, cC);
		cC.mostrar();
		
		
		//Cargar Pilas y Colas
		cargarCola(csP,cC);
		csP.mostrar();
		
		// a) Calcular el costo que debe pagar cada comensal
		System.out.println(".......................................... SOLUCION A ...............................................");
		solA(csP,cC);
		System.out.println(".....................................................................................................");
		
		// b) Mostrar el Combo mas pedido (El que mayor pedido tiene), en el restaurant
		System.out.println(".......................................... SOLUCION B ...............................................");
		solB(csP,cC);
		System.out.println(".....................................................................................................");
	

	}
	
	// Cargar Cola Circular Combo
	private static void cargarCC1(Combo C,  CCircularCO cC1) {
		Combo c1 = new Combo(1, "Sajta", 15.50);
		Combo c2 = new Combo(2, "Hamburgueza", 25.50);
		Combo c3 = new Combo(3, "Hamburgueza", 25.50);
		Combo c4 = new Combo(4, "Pollo", 25.50);
		Combo c5 = new Combo(5, "Sajta", 15.50);
		Combo c6 = new Combo(6, "Thimpu", 15.50);
		Combo c7 = new Combo(7, "Hamburgueza", 25.50);
		Combo c8 = new Combo(8, "Pizza", 55);
		Combo c9 = new Combo(9, "Pizza", 55);
		Combo c10 = new Combo(10, "Jolke", 30);
		
		CCircularCO cC = new CCircularCO();
		cC1.adicionar(new Combo(1, "Sajta", 15.50));
		cC1.adicionar(new Combo(2, "Hamburgueza", 25.50));
		cC1.adicionar(new Combo(3, "Hamburgueza", 25.50));
		cC1.adicionar(new Combo(4, "Pollo", 25.50));
		cC1.adicionar(new Combo(5, "Sajta", 15.50));
		cC1.adicionar(new Combo(6, "Thimpu", 15.50));
		cC1.adicionar(new Combo(7, "Hamburgueza", 25.50));
		cC1.adicionar(new Combo(8, "Pizza", 55));
		cC1.adicionar(new Combo(9, "Pizza", 55));
		cC1.adicionar(new Combo(10, "Jolke", 30));
	
	}

	// Cargar Cola Simple
	public static void cargarCola(CSimplePE CSP , CCircularCO CC) {
		
		Pedido p1 = new Pedido(1,2);
		Pedido p2 = new Pedido(2,1);
		Pedido p3 = new Pedido(3,3);
		Pedido p4 = new Pedido(4,4);
		Pedido p5 = new Pedido(5,1);
		Pedido p6 = new Pedido(6,1);
		Pedido p7 = new Pedido(7,3);
		Pedido p8 = new Pedido(8,6);
		Pedido p9 = new Pedido(9,4);
		Pedido p10 = new Pedido(10,3);
		
		
		PilaPE pp1 = new PilaPE();
		pp1.setNombre("Gonzalo Ortiz");
		pp1.adicionar(p1);
		pp1.adicionar(p2);
		pp1.adicionar(p3);
		pp1.adicionar(p4);
		pp1.adicionar(p5);
		
		PilaPE pp2 = new PilaPE();
		pp2.setNombre("Eddy Machicado");
		pp2.adicionar(p6);
		pp2.adicionar(p7);
		pp2.adicionar(p8);
		pp2.adicionar(p9);
		pp2.adicionar(p10);
		
		CSP.adicionar(pp2);
		CSP.adicionar(pp1);
	}

	// SOLUCION A
	public static void solA(CSimplePE CSP, CCircularCO CC) {
		CSimplePE auxCSP = new CSimplePE();
		PilaPE auxPP = new PilaPE();
		
		while (!CSP.esVacia()) {  // Cola Simple
			PilaPE elemP = CSP.eliminar();
			auxCSP.adicionar(elemP);
			double suma = 0;
			while(!elemP.esVacia()) {  // Pila de pedidos
				Pedido elemPE = elemP.eliminar();
				auxPP.adicionar(elemPE);
				int n = CC.nroElem(); // Cola Circular
				double contador = 0;
				
				for(int i=0;i<n;i++) {
					Combo elemCC = CC.eliminar();
					if(elemPE.getNroCombo() == elemCC.getNroCombo()) {
						contador = contador+(elemPE.getCantidad()*elemCC.getPrecio());
						System.out.println("Nro.: "+elemPE.getNroCombo()+"    "+"Plato: "+elemCC.getNombre()+".........."+"Total: "+contador+" Bs.");
						suma = suma+contador;
					}
					CC.adicionar(elemCC);
				}
			}
			elemP.vaciar(auxPP);
			System.out.println("\t          \t         -----------------------");
			System.out.println("\t          \t         TOTAL "+suma+" Bs.");
		}
		CSP.vaciar(auxCSP);
	}
	
	// SOLUCION B
	public static void solB(CSimplePE CSP, CCircularCO CC) {
		CSimplePE auxPP = new CSimplePE();
		PilaPE auxPE = new PilaPE();
		while (!CSP.esVacia()) {  // Cola Simple
			PilaPE elemPP = CSP.eliminar();
			auxPP.adicionar(elemPP);
			int mayor = obtenerMayor(elemPP);
			while(!elemPP.esVacia()) {  // Pila de pedidos
				Pedido elemPE = elemPP.eliminar();
				auxPE.adicionar(elemPE);
				if(elemPE.getCantidad() == mayor) {
					elemPE.mostrarP();
				}
			}
			elemPP.vaciar(auxPE);
		}
		CSP.vaciar(auxPP);
	}

	// Funcion Obtener Mayor
	public static int obtenerMayor(PilaPE PP) {
		int mayor = Integer.MIN_VALUE;
		PilaPE auxPP = new PilaPE();
		while(!PP.esVacia()) {
			Pedido elemPE = PP.eliminar();
			auxPP.adicionar(elemPE);
			if(elemPE.getCantidad() >= mayor) {
				mayor = elemPE.getCantidad();	
			}	
		}
		PP.vaciar(auxPP);
		return mayor;	
	}
}
	


	

