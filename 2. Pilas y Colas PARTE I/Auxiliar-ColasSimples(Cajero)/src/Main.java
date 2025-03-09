import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		colaSimpleCliente csc = new colaSimpleCliente();
		
		colaSimpleTransaccion cst = new colaSimpleTransaccion();
		
		
		// Procedimiento llenar Cola de Clientes
		llenarCola(csc);
		//csc.mostrar();
		
		// Procedimiento llenar Cola de Transaccione
		llenarTransaccion(cst);
		//cst.mostrar();
		
		/*
		// Dar Prioridad a los adultos mayores de 65 años
		System.out.println("..................................................................." );
		System.out.println("--------------------- SOLUCION A ---------------------");
		int x = 65;
		buscarEdad(csc,x);
		csc.mostrar();
		
		
		// Sobre el anterior ejercicio agregar una cola de Transacciones (Deposito)
		// a) Mostrar las transacciones hechas por el Clientes ci:"X"
		System.out.println("..................................................................." );
		System.out.println("--------------------- SOLUCION A ---------------------");
		System.out.print("Buscar C.I.     (X)  ---> ");
		
		int y = teclado.nextInt();
		//buscarCi1(cst,csc,y);
		buscarCi2(cst,csc,y);
		*/
		
		// b) Mostrar al cliente, que tenga mas transacciones
		System.out.println("..................................................................." );
		System.out.println("--------------------- SOLUCION B ---------------------");
		buscarCliente(csc, cst);
		csc.mostrar();
		cst.mostrar();
		
		
	
	}



	// Procedimiento Llenar colaCliente
	public static void llenarCola(colaSimpleCliente CSC1) {
		CSC1.adicionar(new Cliente("Gonzalo",3469141,34));
		CSC1.adicionar(new Cliente("Yazid",75346141,12));
		CSC1.adicionar(new Cliente("Rufina",2370878,66));
		CSC1.adicionar(new Cliente("Pedro",2211441,51));
		CSC1.adicionar(new Cliente("Carlos",43489141,34));
	}
	
	// Procedimiento llenar colaTransaccion
	public static void llenarTransaccion(colaSimpleTransaccion CST1) {
		CST1.adicionar(new Transaccion(3469141,1500,"25/04/2022"));
		CST1.adicionar(new Transaccion(75346141,150.50,"27/04/2022"));
		CST1.adicionar(new Transaccion(2370878,2500.60,"27/04/2022"));
		CST1.adicionar(new Transaccion(2211441,15.00,"28/04/2022"));
		CST1.adicionar(new Transaccion(3469141,320,"29/04/2022"));
	}
		
	// SOLUCION B
	public static void buscarEdad(colaSimpleCliente CSC1, int X) {
		colaSimpleCliente aux1 = new colaSimpleCliente ();
		colaSimpleCliente aux2 = new colaSimpleCliente ();
		
		while(!CSC1.esVacia()) {
			Cliente elem = CSC1.eliminar();
			if(elem.getEdad() > X) {
				aux2.adicionar(elem);
				System.out.println("--> "+elem+" <--");
			}
			else {
				aux1.adicionar(elem);
			}
		}
		CSC1.vaciar(aux2);
		CSC1.vaciar(aux1);
	}
	
	
	// Procedimiento Buscar Cedula de Identidad 1
	public static void buscarCi(colaSimpleTransaccion CST, colaSimpleCliente CSC, int Y) {
		colaSimpleTransaccion auxT1 = new colaSimpleTransaccion ();
		colaSimpleTransaccion auxT2 = new colaSimpleTransaccion ();
		
		colaSimpleCliente auxC1 = new colaSimpleCliente ();
		colaSimpleCliente auxC2 = new colaSimpleCliente ();
		boolean sw = false;
		while(!CSC.esVacia()) {
			Cliente elem1 = CSC.eliminar();
			auxC1.adicionar(elem1);
			if(elem1.getCi()== Y) {
				auxC2.adicionar(elem1);
				while(!CST.esVacia()) {
					Transaccion elem2 = CST.eliminar();
					auxT1.adicionar(elem2);
					if(elem2.getCi()== Y) {
						sw=true;
						auxT2.adicionar(elem2);
					}
				}
				CST.vaciar(auxT1);
			}
		}
		CSC.vaciar(auxC1);
		auxC2.mostrar();
		auxT2.mostrar();
		if(!sw) {
			System.out.println("La Cedula de Identidad :"+Y+" ,No tiene Transacciones");
			
		}
	}
	// Procedimiento Buscar Cedula de Identidad 2
		public static void buscarCi2(colaSimpleTransaccion CST, colaSimpleCliente CSC, int Y) {
			colaSimpleCliente auxC1 = new colaSimpleCliente ();
			colaSimpleTransaccion auxT1 = new colaSimpleTransaccion ();
			
			boolean sw = true;
			while(!CSC.esVacia()) {
				Cliente elem1 = CSC.eliminar();
				auxC1.adicionar(elem1);
				if(elem1.getCi()==Y) {
					elem1.mostrarC();
					sw = false;
					while(!CST.esVacia()) {
						Transaccion elem2 = CST.eliminar();
						auxT1.adicionar(elem2);
						if(elem2.getCi() == Y) {
							elem2.mostrarT();
						}
					}
					CST.vaciar(auxT1);
				}
			}
			CSC.vaciar(auxC1);
			if(sw) {
				System.out.println("La Cedula de Identidad :"+Y+" ,No tiene Transacciones");
				
			}
		}
		
	
	// Funcion cantidad
		public static int cantidadDepositos(colaSimpleCliente CSC , colaSimpleTransaccion CST, int X) {
			colaSimpleCliente auxC1 = new colaSimpleCliente ();
			colaSimpleTransaccion auxT1 = new colaSimpleTransaccion ();
			int cont = 0;
			while(!CSC.esVacia()){
				Cliente elem1 = CSC.eliminar();
				auxC1.adicionar(elem1);
				if(elem1.getCi()== X) {
					while(!CST.esVacia()) {
						Transaccion elem2 = CST.eliminar();
						auxT1.adicionar(elem2);
						if(elem2.getCi() == X) {
							cont++;
						}
					}
					CST.vaciar(auxT1);
				}
			}
			CSC.vaciar(auxC1);
			return cont;

		}
		
	// Procedimiento Buscar Cantidad con mas Transacciones
	public static void buscarCantidad(colaSimpleTransaccion CST, colaSimpleCliente CSC) {
		colaSimpleTransaccion auxT1 = new colaSimpleTransaccion ();
		colaSimpleTransaccion auxT2 = new colaSimpleTransaccion ();
		colaSimpleTransaccion auxT3 = new colaSimpleTransaccion ();
		
		colaSimpleCliente auxC1 = new colaSimpleCliente ();
		colaSimpleCliente auxC2 = new colaSimpleCliente ();
		colaSimpleCliente auxC3 = new colaSimpleCliente ();
		int cont=0;
		while(!CSC.esVacia()) {
			Cliente elem1 = CSC.eliminar();
			auxC1.adicionar(elem1);//guarda cola Clientes
			while(!CST.esVacia()) {
				Transaccion elem2 = CST.eliminar();
				auxT1.adicionar(elem2);	//guarda cola de transacciones
				if(elem1.getCi() == elem2.getCi()) {
					int w = elem1.getCi();
					while(!auxC1.esVacia()) {
						Cliente x = auxC1.eliminar();
						CSC.adicionar(x);
						if(x.getCi() == w) {
							elem1.mostrarC();
						}
					}
					while(!auxT1.esVacia()) {
						Transaccion y = auxT1.eliminar();
						auxT3.adicionar(y);
						
						if(y.getCi() == w) {
							cont++;
						}
					}	
				}
			}
		}
		System.out.println(cont);
	}
	// Procedimiento Buscar Cliente con mas transacciones <--
	public static void buscarCliente(colaSimpleCliente CSC, colaSimpleTransaccion CST) {
		colaSimpleCliente auxC1 = new colaSimpleCliente ();
		colaSimpleCliente auxC2 = new colaSimpleCliente ();
		
		colaSimpleTransaccion auxT1 = new colaSimpleTransaccion ();
		colaSimpleTransaccion auxT2 = new colaSimpleTransaccion ();
		int aux = 0;
		while(!CSC.esVacia()) {
			Cliente elem1 = CSC.eliminar();
			auxC1.adicionar(elem1);
			while(!CST.esVacia()) {
				Transaccion elem2 = CST.eliminar();
				auxT1.adicionar(elem2);
				if(elem1.getCi()==elem2.getCi()) {
					int w = elem1.getCi();
					int cont =0 ;
					
					while(!auxT1.esVacia()) {
						Transaccion a = auxT1.eliminar();
						auxT2.adicionar(a);
						if(a.getCi()== w) {
							cont++;
							//System.out.println(a.getCi());
							//System.out.println(may);
							aux = cont;
						}
					}
					auxT1.vaciar(auxT2);
				}
			}
			System.out.println(aux);
			CST.vaciar(auxT1);
			int mayor = aux;
			
		}
	}
}
	
	
	
		



	
	


