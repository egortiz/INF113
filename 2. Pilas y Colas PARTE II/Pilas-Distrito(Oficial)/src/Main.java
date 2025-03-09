import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaD pD = new PilaD();	
		PilaZ pZ = new PilaZ();
		
		//Cargar Pilas
		cargar(pD,pZ);
		pD.mostrar();
		pZ.mostrar();
		
		//b) Mostrar a los Distritos con mayor numero de Zonas
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION B .....................................");
		mostrarMayor(pD,pZ);
		
		System.out.println("\n.....................................................................................");
		
		//c) Mostrar las Zonas con mayor Superficie de cada Distrito
		System.out.println("\n.....................................................................................");
		System.out.println(".................................... SOLUCION C .....................................");
		mostrarZonaMayorS(pD, pZ);
		System.out.println("\n.....................................................................................");
		
		
	}
	
	// Cargar Pila
	public static void cargar(PilaD D, PilaZ Z) {
		D.adicionar(new Distrito(1001,"Max Paredes"));
		D.adicionar(new Distrito(1004,"Cotahuma"));
		D.adicionar(new Distrito(1003,"Perifierica"));
		D.adicionar(new Distrito(1006,"Llojeta"));
		D.adicionar(new Distrito(1005,"Palca"));
		D.adicionar(new Distrito(1002,"Zona Sur"));
		
		Z.adicionar(new Zona(1001,256.52,"Ciudadela"));
		Z.adicionar(new Zona(1001,156.52,"Pura Pura"));
		Z.adicionar(new Zona(1001,256.52,"Achachicala"));
		Z.adicionar(new Zona(1002,86.57,"Alto Seguencoma"));
		Z.adicionar(new Zona(1002,96.57,"Bajo Seguencoma"));
		Z.adicionar(new Zona(1002,16.57,"El Carmen"));
		Z.adicionar(new Zona(1003,36.57,"Villa Fatima"));
		Z.adicionar(new Zona(1004,78.57,"Tacahua"));
	}
	// SOLUCION B
	public static void mostrarMayor(PilaD D, PilaZ Z) {
		int mayor = obtenerMayor(D,Z);
		PilaD auxD = new PilaD();
		Distrito elem;
		while(!D.esVacia()) {
			elem = D.eliminar();
			int cz = contadorZonas(Z, elem.getNroDistrito());
			if(cz == mayor) {
				elem.mostrarD();
				System.out.println("El Distrito cuenta con: "+"("+mayor+")"+" Zonas");
			}
			auxD.adicionar(elem);
		}
		D.vaciar(auxD);
	}

	// Funcion Obtener Mayor
	public static int obtenerMayor(PilaD D, PilaZ Z) {
		int mayor = Integer.MIN_VALUE;
		PilaD auxD = new PilaD();
		Distrito elem;
		while (!D.esVacia()) {
			elem = D.eliminar();
			int cz = contadorZonas(Z,elem.getNroDistrito());
			if(cz > mayor) {
				mayor = cz;
			}
			auxD.adicionar(elem);
		}
		D.vaciar(auxD);
		return mayor;
	}
	// Funcion contador Zonas
	public static int contadorZonas(PilaZ Z, int nd) {
		int c = 0;
		PilaZ auxZ = new PilaZ();
		Zona elem;
		while (!Z.esVacia()) {
			elem = Z.eliminar();
			if(elem.getNroDistrito() == nd) {
				c++;
			}
			auxZ.adicionar(elem);
		}
		Z.vaciar(auxZ);
		return c;
	}
	
	// SOLUCION C
	public static void mostrarZonaMayorS(PilaD D, PilaZ Z) {
		int mayor = obtenerMayor(D,Z);
		PilaD auxD = new PilaD();
		while (!D.esVacia()) {
			Distrito elem = D.eliminar();
			System.out.println("\nZonas con Mayor Superficie del Distrito:"+elem.getNroDistrito());
			mostrarZonasMayorS(Z, elem.getNroDistrito());
			auxD.adicionar(elem);
		}
		D.vaciar(auxD);
	}
		
	// Funcion muestra Zonas con mayor superficie
	public static void mostrarZonasMayorS(PilaZ Z, int nd) {
		double mayorSZona = ObtenerMayorS(Z, nd);
		PilaZ auxZ = new PilaZ();
		while (!Z.esVacia()) {
			Zona elem = Z.eliminar();
			if(elem.getNroDistrito() == nd && elem.getSuperficie() == mayorSZona ) {
				elem.mostrarZ();;
			}
			auxZ.adicionar(elem);
		}
		Z.vaciar(auxZ);	
	}
	
	// Funcion Obtener mayor superficie zona
		public static double ObtenerMayorS(PilaZ Z, int nd) {
			double mayor = Double.MIN_VALUE;
			PilaZ auxZ = new PilaZ();
			while (!Z.esVacia()) {
				Zona elem = Z.eliminar();
				if(elem.getNroDistrito() == nd) {
					if(elem.getSuperficie() > mayor) {
						mayor = elem.getSuperficie();
					}
				}auxZ.adicionar(elem);
			}
			Z.vaciar(auxZ);	
			return mayor;
		}
	
}

