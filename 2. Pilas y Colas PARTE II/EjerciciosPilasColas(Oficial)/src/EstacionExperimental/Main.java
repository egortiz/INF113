package EstacionExperimental;
import java.util.*;

import javax.lang.model.element.Element;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CSimpleEE csE = new CSimpleEE();
		CCircularP ccP = new CCircularP();
		PilaA pA = new PilaA();
		
		
		System.out.println(".......................................... SOLUCION A ...............................................");
		// Cargar Colas, Pilas
		cargarCola(csE, ccP, pA);
		// Mostrar
		csE.mostrar();
		ccP.mostrar();
		pA.mostrar();
		System.out.println(".....................................................................................................");
		
	    // b) En la estacion experimental de nombre (X), mostrar los datos de la produccion del producto (P) en este anio
		System.out.println(".......................................... SOLUCION B ...............................................");
		System.out.print("Buscar Estacion (X)  ---> ");
		String e = teclado.nextLine();
		System.out.print("Buscar Producto (Y)  ---> ");
		String p = teclado.nextLine();
		String anio = "2022";
		System.out.println("Estacion: "+e+"\n"+"Producto: "+p+"\n"+"Año: "+anio);
		
		solB(csE,ccP, e, p, anio);
		System.out.println(".....................................................................................................");
		
		// c) Mostrar Nombre y variedad de los animales en mayor cantidad de cada estacion experimental
		System.out.println(".......................................... SOLUCION C ...............................................");
		solC(csE, pA);
		
		// d) Llevar a la Estacion experimental (X), su producción y crianza al final de cada Estructura
		System.out.println(".......................................... SOLUCION C ...............................................");
		System.out.print("Estacion (X)         ---> ");
		String x = teclado.nextLine();
		solD(x, csE, pA, ccP);
		ccP.mostrar();
		pA.mostrar();
		System.out.println(".....................................................................................................");
	
	}
	

	// Cargar 
	public static void cargarCola(CSimpleEE E, CCircularP P, PilaA A) {
		E.adicionar(new EstacionExperimental("1001","Cota Cota","Cota Cota"));
		E.adicionar(new EstacionExperimental("1004","Patacamaya","Patacamaya"));
		E.adicionar(new EstacionExperimental("1002","Viacha","Viacha"));
		E.adicionar(new EstacionExperimental("1003","Sapecho","Sapecho"));
		
		P.adicionar(new Producto("1001","(19/05/2022)","Lechuga","Vegetal","V1",10));
		P.adicionar(new Producto("1001","(19/05/2022)","Repollo","Vegetal","V2",20));
		P.adicionar(new Producto("1001","(20/06/2021)","Huevo","Legumbre","V5",100));
		P.adicionar(new Producto("1001","(20/06/2022)","Huevo-Codorniz","Legumbre","V6",150));
		P.adicionar(new Producto("1003","(10/05/2022)","Mazorca","Vegetal","V11",120));
		P.adicionar(new Producto("1003","(11/05/2021)","Sandia","Fruta","F2",20));
		P.adicionar(new Producto("1004","(21/05/2022)","Naranja","Fruta","F1",200));
		P.adicionar(new Producto("1004","(21/05/2022)","Mandarina","Fruta","F1",300));
		P.adicionar(new Producto("1004","(21/07/2022)","Repollo","Vegetal","V1",15));
		P.adicionar(new Producto("1001","(19/05/2021)","Sandia","Fruta","F2",10));
		
		A.adicionar(new Animal("1001","Gallina","Ave",60,1));
		A.adicionar(new Animal("1001","Codorniz","Ave",30,2));
		A.adicionar(new Animal("1001","Perro","Mamifero",10,4));
		A.adicionar(new Animal("1004","Caballo","Mamifero",1,3));
		A.adicionar(new Animal("1005","Cerdo","Mamifero",10,2));
		A.adicionar(new Animal("1003","Vaca","Mamifero",5,10));
		A.adicionar(new Animal("1012","Oveja","Mamifero",12,2));
		A.adicionar(new Animal("1002","Pavo","Mamifero",24,2));
		A.adicionar(new Animal("1002","Vicuña","Mamifero",23,3));
	}
	
	// SOLUCION B
	public static void solB(CSimpleEE E, CCircularP P, String e, String p, String anioA) {
		CSimpleEE auxE = new CSimpleEE();
		while(!E.esVacia()) {
			EstacionExperimental elemE = E.eliminar();
			if(elemE.getNombre().equalsIgnoreCase(e)) {
				mostrarDatosP(P, elemE.getIdEstudiante(), p, anioA);
			}
			auxE.adicionar(elemE);	
		}
		E.vaciar(auxE);
	}
	
	// Funcion mostrar Datos
	public static void mostrarDatosP(CCircularP P, String E, String pp, String anioA) {
		int n = P.nroElem();
		for (int i=0;i<n;i++) {
			Producto elemP = P.eliminar();
			if(elemP.getIdEstudiante().equalsIgnoreCase(E) && elemP.getProducto().equalsIgnoreCase(pp) && elemP.getFecha().contains(anioA)) {
				elemP.mostrarP();
			}
			P.adicionar(elemP);
		}
	}
	
	// SOLUCION C
	public static void solC(CSimpleEE E, PilaA A) {
		CSimpleEE auxE = new CSimpleEE();
		while(!E.esVacia()) {
			EstacionExperimental elemE = E.eliminar();
			System.out.println("Estacion Experimental: "+elemE.getNombre());
			mostrarNombreVariedad(elemE.getIdEstudiante(),A);
			
			auxE.adicionar(elemE);
		}
		E.vaciar(auxE);
		
	}
	// Funcion Muestra Nombre y variedad
	public static void mostrarNombreVariedad(String IE, PilaA A) {
		PilaA auxA = new PilaA();
		int mayor = obtenerMayor(IE,A);
		while (!A.esVacia()) {
			Animal elemA = A.eliminar();
			if(elemA.getIdEstudiante().equalsIgnoreCase(IE) && elemA.getCantidad()== mayor) {
				System.out.println("Nombre: "+elemA.getNombre()+"\n"+"Variedad: "+elemA.getVariedad());
			}
			auxA.adicionar(elemA);	
		}
		A.vaciar(auxA);	
	}
	// Funcion Obtiene el Mayor
	public static int obtenerMayor(String iE, PilaA A) {
		int mayor = Integer.MIN_VALUE;
		PilaA auxA = new PilaA();
		while(!A.esVacia()) {
			Animal elemA = A.eliminar();
			if(elemA.getIdEstudiante().equalsIgnoreCase(iE) && elemA.getCantidad()> mayor) {
				mayor = elemA.getCantidad();
			}
			auxA.adicionar(elemA);
		}
		A.vaciar(auxA);
		return mayor;
	}
	
	// SOLUCION D
	public static void solD(String X, CSimpleEE CSE, PilaA PA, CCircularP CCP) {
		CSimpleEE auxE = new CSimpleEE();
		while (!CSE.esVacia()) {
			EstacionExperimental elemE = CSE.eliminar();
			if(elemE.getNombre().equalsIgnoreCase(X)) {
				System.out.println("Estacion Experimental: "+X+"\n"+"Id: "+elemE.getIdEstudiante());
				AgrupatCProductos(elemE.getIdEstudiante(),CCP);
				AgruparPAnimales(elemE.getIdEstudiante(), PA);
			}
			auxE.adicionar(elemE);	
		}
		CSE.vaciar(auxE);
	}

	// Funcion Agrupar Pila de Animales
	public static void AgruparPAnimales(String IE, PilaA PA) {
		PilaA auxA = new PilaA();
		PilaA R = new PilaA();
		while(!PA.esVacia()) {
			Animal elemA = PA.eliminar();
			if(elemA.getIdEstudiante().equalsIgnoreCase(IE)) {
				R.adicionar(elemA);
			}
			else {
				auxA.adicionar(elemA);
			}
		}
		PA.vaciar(auxA);
		PA.vaciar(R);
	}
	
	// Funcion Agrupar Cola circular de Productos
	public static void AgrupatCProductos(String IE, CCircularP CCP) {
		int n = CCP.nroElem();
		CCircularP auxC = new CCircularP();
		for (int i=0;i<n;i++) {
			Producto elemP = CCP.eliminar();
			if(elemP.getIdEstudiante().equalsIgnoreCase(IE)) {
				auxC.adicionar(elemP);
			}
			else {
				CCP.adicionar(elemP);
			}
		}
		llevarFinalE(CCP,auxC);
	}
	// Funcion Mover al Final Animales
	public static void llevarFinalE(CCircularP CCP, CCircularP auxC) {
		int w = auxC.nroElem();
		int z = CCP.nroElem();
		for (int i=z;i<(w+z);i++) {
			Producto elemP = auxC.eliminar();
			CCP.adicionar(elemP);
		}
	}	
}
