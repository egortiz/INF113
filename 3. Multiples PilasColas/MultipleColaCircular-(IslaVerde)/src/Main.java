import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CSimpleMA csM = new CSimpleMA();
		MultiColaCZO mcZ = new MultiColaCZO();
		
		// Cargar Multicola Circular Zona
		cargarDatos(csM, mcZ);
		csM.mostrar();
		mcZ.mostrar();
		
		
		// Mostrar los nombres de los Macrodistritos que tienen mas de dos Islas Verdes
		System.out.println("\n.......................................... SOLUCION A ...............................................");
		int x = 2;
		solA(csM, x);
		System.out.println(".....................................................................................................");
	
		// Cuantas Zonas tienen contenedores de color amarillo
		System.out.println("\n.......................................... SOLUCION B ...............................................");
		//System.out.print("Buscar contenedor color (Y) ---> ");
		String y = "Amarillo";
		solB(mcZ, y);
		System.out.println(".....................................................................................................");

		// Del macrodistrito con nombre (X), determinar el numero de contenedores de color amarillos
		System.out.println("\n.......................................... SOLUCION C ...............................................");
		System.out.print("Buscar Macrodistrito (m)      ---> ");
		String z = "Amarillo";
		String m = teclado.nextLine();
		solC(csM, mcZ, m, z);
		System.out.println(".....................................................................................................");
		
		
		// Cuantos Macrodistritos tienen menos de dos islas Verde
		System.out.println("\n.......................................... SOLUCION D ...............................................");
		int a = 2;
		System.out.println("Los Macrodistritos que tienen menos de 2 Islas son; "+solD(csM, a));
		System.out.println(".....................................................................................................");
		
		
		// Mostrar los nombres de Zonas que no tienen contenedores de color azul
		System.out.println("\n.......................................... SOLUCION E ...............................................");
		System.out.print("Color (b)                     ---> ");
		String b = "Azul";
		System.out.println(b);
		solE(mcZ, b);
		System.out.println(".....................................................................................................");
		
		
		// Del i-esimo Macrodistrito mostrar su nombre y el nombre de sus Zonas que tienen contenedores de Color "Azul"
		System.out.println("\n.......................................... SOLUCION F ...............................................");
		System.out.print("Macrodistrito(i)-esimo        ---> ");
		int c = teclado.nextInt();
		System.out.print("Color (d)                     ---> ");
		String d = "Azul";
		System.out.println(d);
		solF(mcZ, csM, c, d);
		System.out.println(".....................................................................................................");
		
		
		
		
		
	}
	
	

	// Cargar Multicola
	public static void cargarDatos(CSimpleMA csM, MultiColaCZO mcZ) {
		PilaI p1 = new PilaI();
		PilaI p2 = new PilaI();
		PilaI p3 = new PilaI();
		PilaI p4 = new PilaI();
	
		
		p1.adicionar(new IslaV("San Jorge","6 de Agosto"));
		p1.adicionar(new IslaV("Alto Obrajes","Sector B"));
		p1.adicionar(new IslaV("Alto Obrajes","Gran Bretaña"));
		
		p2.adicionar(new IslaV("Pura Pura","Playa Verde"));
		
		p3.adicionar(new IslaV("Gran Poder","Vicente Ochoa"));
		p3.adicionar(new IslaV("San Pedro","Plaza Gilberto Rojas"));
		p3.adicionar(new IslaV("Miraflores","Plaza Uyuni"));
		p3.adicionar(new IslaV("Miraflores","Estado Mayor"));
		
		p4.adicionar(new IslaV("Obrajes","Estado Mayor"));
		p4.adicionar(new IslaV("Achumani","Estado Mayor"));
		

		csM.adicionar(new Macrodistrito("Portada",p1));
		csM.adicionar(new Macrodistrito("Cotahuma",p2));
		csM.adicionar(new Macrodistrito("Max Paredes",p3));
		csM.adicionar(new Macrodistrito("Sur",p4));
		
		
		
		mcZ.setNc(4); // Cantidad de CCircularCO
		
		CCircularCO cc1 = new CCircularCO();
		cc1.adicionar(new Contenedor("Verde","Vicente Ochoa",25.5));
		cc1.adicionar(new Contenedor("Amarillo","Plaza Gran Poder",35.5));
		
		CCircularCO cc2 = new CCircularCO();
		cc2.adicionar(new Contenedor("Amarillo","Cuarto Centenario",25.4));
		cc2.adicionar(new Contenedor("Amarillo","Sector B",26.5));
		
		CCircularCO cc3 = new CCircularCO();
		cc3.adicionar(new Contenedor("Verde","Plaza Uyuni",25.5));
		cc3.adicionar(new Contenedor("Amarillo","Estado Mayor",26.4));
		cc3.adicionar(new Contenedor("Azul","Stadium",24.5));
		
		CCircularCO cc4 = new CCircularCO();
		cc4.adicionar(new Contenedor("Azul","Calle 5",35.5));
		cc4.adicionar(new Contenedor("Amarillo","Stadium Tigre",26.4));
		
		
		mcZ.adicionar(1, new Zona("Gran Poder",cc1));
		mcZ.adicionar(2, new Zona("Alto Obrajes",cc2));
		mcZ.adicionar(3, new Zona("Miraflores",cc3));
		mcZ.adicionar(4, new Zona("Sur",cc4));
		
	}
	
	// SOLUCION A
	public static void solA(CSimpleMA csM, int x) {
		CSimpleMA auxC = new CSimpleMA();
		while(!csM.esVacia()) {
			Macrodistrito elem = csM.eliminar();
			if(elem.getP().nroElem() >= x) {
				System.out.println("[Nombre Macrodistito]: "+elem.getNombreMacro());
			}
			auxC.adicionar(elem);
		}
		csM.vaciar(auxC);
	}
	
	// SOLUCION B
	public static void solB(MultiColaCZO MCZ, String Y) {
		int nc = MCZ.getNc();
		int c = 0;
		for(int i=1;i<=nc;i++) {
			int n = MCZ.nroElem(i);
			for(int j=1;j<=n;j++) {


				if(ContarColorX(elem.getCc(),Y) >= 1) {
					c++;
				}
				MCZ.adicionar(i, elem);	
			}
		}
		System.out.println("Existen: "+"("+c+")"+" Zonas que tienen Contenedores Amarillos");
	}
	
	// Funcion contar
	public static int ContarColorX(CCircularCO CC, String Y) {
		int n = CC.nroElem();
		int c = 0;
		for(int i=1;i<=n;i++) {
			Contenedor elem = CC.eliminar();
			if(elem.getColor().equalsIgnoreCase(Y)) {
				c++;
			}
			CC.adicionar(elem);
		}
		return c;
	}
	
	// SOLUCION C
	public static void solC(CSimpleMA MA, MultiColaCZO ZO, String MX, String CO) {
		int c = 0;
		CSimpleMA aux = new CSimpleMA();
		while(!MA.esVacia()) {
			Macrodistrito elem = MA.eliminar();
			c++;
			if(elem.getNombreMacro().equalsIgnoreCase(MX)) {
				aux.adicionar(elem);
				aux.vaciar(MA);
				int cca = 0;
				int n = ZO.nroElem(c);
				for(int i=1; i<=n;i++) {
					Zona elemZO = ZO.eliminar(c);
					cca = cca + ContarColorX(elemZO.getCc(), CO);
					ZO.adicionar(c,elemZO);
				}
				System.out.println("El Macrodistrito de nombre: "+"("+CO+")"+" Tiene: "+"("+cca+")"+" Contenedores "+CO+"(s)");	
			}
			else {
				aux.adicionar(elem);
			}
	    }
		MA.vaciar(aux);
		System.out.println("El Macrodistrito de nombre: "+"("+CO+")"+" No, Tiene "+" Contenedores "+CO+"(s)");
	}
	
	// SOLUCION D
	public static int solD(CSimpleMA MA, int A) {
		int c = 0;
		CSimpleMA auxMA = new CSimpleMA();
		while (!MA.esVacia()) {
			Macrodistrito elem = MA.eliminar();
			if(elem.getP().nroElem()< A) {
				c++;
			}
			auxMA.adicionar(elem);
		}
		MA.vaciar(auxMA);
		return c;
	}
	
	// SOLUCION E
	private static void solE(MultiColaCZO mcZO, String B) {
		int nc = mcZO.getNc();
		for(int i=1;i<=nc;i++) {
			int n = mcZO.nroElem(i);
			for(int j=1;j<=n;j++) {
				Zona elem = mcZO.eliminar(i);
				if(!existeColorX(elem.getCc(),B)) {
					System.out.println("Nombre de la Zona: "+elem.getNomZona());
				}
				mcZO.adicionar(i, elem);	
			}
		}
	}
	
	// Funcion Existe
	public static boolean existeColorX(CCircularCO ccCO, String b) {
		int n = ccCO.nroElem();
		boolean sw = false;
		for(int i=1;i<=n;i++) {
			Contenedor elem = ccCO.eliminar();
			ccCO.adicionar(elem);
			if(elem.getColor().equalsIgnoreCase(b)) {
				sw = true;
			}
		}
		return sw;
	}
	
	// SOLUCION F
	public static void solF(MultiColaCZO ZO, CSimpleMA MA, int IE, String CO) {
		if(IE <= MA.nroElem()) {
			CSimpleMA auxMA = new CSimpleMA();
			Macrodistrito elem = new Macrodistrito();
			for(int i=1;i<=IE;i++) {
				elem = MA.eliminar();
				auxMA.adicionar(elem);	
			}
			System.out.println("Nombre del Macrodistrito en la Posicion: "+"("+IE+"): "+elem.getNombreMacro());
			auxMA.vaciar(MA);
			MA.vaciar(auxMA);
			
			int n = ZO.nroElem(IE);
			for(int i=1;i<=n;i++) {
				Zona elemZO = ZO.eliminar(IE);
				if(existeColorX(elemZO.getCc(), CO)) {
					System.out.println("Zona: "+elemZO.getNomZona()+"tiene Contenedores: "+"("+CO+")");	
				}
				else {
					System.out.println("La Zona: "+elemZO.getNomZona()+" No, tiene contenedores de Color: "+"("+CO+")");	
					
				}
			}
		}
		else {
			System.out.println("La estructura no cuenta con la Posición: "+"("+IE+")");
		}
	}
}

