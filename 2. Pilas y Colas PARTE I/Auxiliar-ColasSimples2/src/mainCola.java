import java.util.*;
public class mainCola {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		colaSimple cs = new colaSimple();
		
		cs.adicionar("mama");
		cs.adicionar("perro");
		cs.adicionar("casa");
		cs.adicionar("polo");
		cs.adicionar("vaca");
		cs.adicionar("gallo");
		cs.mostrar();
		
		// Verificar si existe algunas cadena que termine con "A" o "a"
		System.out.println("................................................................................" );
		String x = "a";
		String y = "A";
		verificarCadena(cs,x,y);
		
		// Eliminar todas las cadenas que contengan a alguna letra X (Variable)
		System.out.println("................................................................................" );
		char z = 'a';
		eliminarCaracter(cs,z);
		cs.mostrar();
		
		

	}

	// SOLUCION A
	public static void verificarCadena(colaSimple CS, String X, String Y) {
		colaSimple aux = new colaSimple();
		boolean sw = false;
		while(!CS.esVacia()) {
			String elem = CS.eliminar();
			aux.adicionar(elem);
			if(elem.charAt(elem.length()-1)== 'X' || elem.charAt(elem.length()-1)== 'Y' ) {
				sw = true;	
			}
		}
		CS.vaciar(aux);
		if(sw=true) {
			System.out.println("Si, Existe!!");
		}
		else {
			System.out.println("No, Existe!!");
		}
	}
	
	// SOLUCION B
	public static void eliminarCaracter(colaSimple CS, char X) {
		colaSimple aux = new colaSimple();
		while(!CS.esVacia()) {
			String elem = CS.eliminar();
			if(!verifica(elem,X)) {
				aux.adicionar(elem);
			}
		}
		CS.vaciar(aux);
	}
	// Funcion Verifica
	public static boolean verifica(String X, char C) {
		boolean sw = false;
		for(int i=0;i<X.length();i++) {
			if(X.charAt(i)== C) {
				sw = true;	
			}
		}
		return sw;
	}
}
