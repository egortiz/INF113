import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Colas
			CSimpleD csd = new CSimpleD();	
			CCircularP  ccp = new CCircularP();
			
		// Queues
		Queue<Departamento> qd = new LinkedList<Departamento>();
		Queue<Provincia> qp = new LinkedList<Provincia>();
			
		System.out.println("\n......................................................................................................" );
		System.out.println(".............................................. COLAS .................................................");
		//Llenar Cola
		llenarColas(csd,ccp);
		csd.mostrar();
		ccp.mostrar();
		
		/* System.out.println("\n....................................................................................................." );
		System.out.println(".............................................. QUEUES ...............................................");
		//Llenar Queue
		llenarQueue(qd,qp);
		mostrarQueue(qd,qp); */
		
		//a) Mostrar Cada Departamento con sus Provincias
		System.out.println("\n....................................................................................................." );
		System.out.println("............................................ SOLUCION A .............................................");
		mostrarDeptoP(csd,ccp);
		
		//b) Ordenar los departamentos por Poblacion
		System.out.println("\n....................................................................................................." );
		System.out.println("............................................ SOLUCION B .............................................");
		ordenarPoblacionM(csd);
		csd.mostrar();
		
	}


	// Llenar Colas Simples, Circular
	public static void llenarColas(CSimpleD CSD, CCircularP CCP) {
		CSD.adicionar(new Departamento(1,"La Paz","Murillo",133.985,2706.351));
		CSD.adicionar(new Departamento(2,"Cochabamba","Cercado",55.631,1758.143));
		CSD.adicionar(new Departamento(3,"Oruro","Oruro",53.631,494.178));
		CSD.adicionar(new Departamento(4,"Potosi","Potosi",118.218,823.517));
		CSD.adicionar(new Departamento(5,"Chuquisaca","Sucre",51.524,576.153));
		CSD.adicionar(new Departamento(6,"Santa Cruz","Murillo",370.621,2655.084));
		CSD.adicionar(new Departamento(7,"Beni","Trinidad",213.564,421.196));
		CSD.adicionar(new Departamento(8,"Pando","Cobija",63.827,110.436));
		CSD.adicionar(new Departamento(9,"Tarija","Tarija",37.623,482.196));
		
		
		CCP.adicionar(new Provincia(1,"Muñecas","Chuma",4.965,17.820));
		CCP.adicionar(new Provincia(1,"Omasuyos","Achacachi",4.510,73.703));
		CCP.adicionar(new Provincia(1,"Aroma","Sica Sica",98.378,65.730));
		CCP.adicionar(new Provincia(1,"Murillo","La Paz",2030.422,1156.423));
		CCP.adicionar(new Provincia(1,"Caranavi","Caranavi",55.492,43.093));
		CCP.adicionar(new Provincia(1,"Nor Yungas","Coroico",25.790,20.433));
		CCP.adicionar(new Provincia(6,"Montero","Santistevan",90.837,35.563));
		CCP.adicionar(new Provincia(6,"Warnes","Warnes",47.188,369.236));
		CCP.adicionar(new Provincia(2,"Arani","Arani",506,25.696));
		CCP.adicionar(new Provincia(5,"Zudañes","Zudañes",3.738,23.658));
			
	}
	
	// LLenar Queues 
	public static void llenarQueue(Queue<Departamento> qD, Queue<Provincia> qP) {
		qD.add(new Departamento(1,"La Paz","Murillo",133.985,2706.351));
		qD.add(new Departamento(2,"Cochabamba","Cercado",55.631,1758.143));
		qD.add(new Departamento(3,"Oruro","Oruro",53.631,494.178));
		qD.add(new Departamento(4,"Potosi","Potosi",118.218,823.517));
		qD.add(new Departamento(5,"Chuquisaca","Sucre",51.524,576.153));
		qD.add(new Departamento(6,"Santa Cruz","Murillo",370.621,2655.084));
		qD.add(new Departamento(7,"Beni","Trinidad",213.564,421.196));
		qD.add(new Departamento(8,"Pando","Cobija",63.827,110.436));
		qD.add(new Departamento(9,"Tarija","Tarija",37.623,482.196));
		
		qP.add(new Provincia(1,"Muñecas","Chuma",4.965,17.820));
		qP.add(new Provincia(1,"Omasuyos","Achacachi",4.510,73.703));
		qP.add(new Provincia(1,"Aroma","Sica Sica",98.378,65.730));
		qP.add(new Provincia(1,"Murillo","La Paz",2030.422,1156.423));
		qP.add(new Provincia(1,"Caranavi","Caranavi",55.492,43.093));
		qP.add(new Provincia(1,"Nor Yungas","Coroico",25.790,20.433));
		qP.add(new Provincia(6,"Montero","Santistevan",90.837,35.563));
		qP.add(new Provincia(6,"Warnes","Warnes",47.188,369.236));
		qP.add(new Provincia(2,"Arani","Arani",506,25.696));
		qP.add(new Provincia(5,"Zudañes","Zudañes",3.738,23.658));
	}
	// Mostrar Queues
	public static void mostrarQueue(Queue<Departamento> qD, Queue<Provincia> qP) {
		while(!qD.isEmpty()) {
			Departamento elem = qD.remove();
			elem.mostrarD();
		}
		System.out.println("\n....................................................................................................." );
		while(!qP.isEmpty()) {
			Provincia elem = qP.remove();
			elem.mostrarP();
		}
	}
	
	// SOLUCION A
	public static void mostrarDeptoP(CSimpleD csD, CCircularP ccP) {
		CSimpleD auxD = new CSimpleD();
		while (!csD.esVacia()){
			Departamento elem = csD.eliminar();
			elem.mostrarD();
			auxD.adicionar(elem);
			elemProvincia(elem.getIdDpto(), ccP);
			System.out.println("*******************************************************************************************************" );
			
		}
		csD.vaciar(auxD);
	}

	// Buscar Provincia
	public static void elemProvincia(int X, CCircularP CCP) {
		CCircularP auxP = new CCircularP();
		while (!CCP.esVacia()) {
			Provincia elem = CCP.eliminar();
			auxP.adicionar(elem);
			if(elem.getIdProv()== X) {
				elem.mostrarP();
			}
		}
		CCP.vaciar(auxP);	
	}
	
	// SOLUCION B
	public static void ordenarPoblacionM(CSimpleD CSD) {
		CSimpleD aux = new CSimpleD();
		CSimpleD r = new CSimpleD();
		
		while (!CSD.esVacia()) {
			Departamento menor = CSD.eliminar();
			while (!CSD.esVacia()) {
				Departamento  elem = CSD.eliminar();
				if(elem.getPoblacion() <= menor.getPoblacion()) {
					aux.adicionar(menor);
					menor = elem;
				}
				else {
					aux.adicionar(elem);
				}
			}
			r.adicionar(menor);
			CSD.vaciar(aux);
		}
		CSD.vaciar(r);
	}


}
