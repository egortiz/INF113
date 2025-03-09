import java.util.*;
public class mainColores {

	public static void main(String[] args) {
		// Crear un stack de String (Colores)
		Stack<String> A = new Stack<String>();
		
		A.push("Rojo");
		A.push("Verde");
		A.push("Morado");
		A.push("Rojo");
		A.push("Amarillo");
		A.push("Violeta");
		A.push("Cafe");
		
		System.out.println("--------- DATOS DE LA PILA ---------");
		System.out.print("");
		mostrarP(A);
		
		// a) Verificar si existe el color X en la Pila
		System.out.println("--------- SOLUCION A ---------");
		verificarColor(A,"Naranja");
		if(solFun(A,"Naranja")) {
			System.out.println("Existe el color ");
		}
		else {
			System.out.println("No Existe el color ");
		}
		mostrarP(A);
		// b) Agrupar la Pila por colores
		System.out.println("--------- SOLUCION B ---------");
		agruparColores(A);
		mostrarP(A);
		
		// c) (Ejercicios para la clase) Mostrar cuantas veces se repite cada color
		System.out.println("--------- SOLUCION C ---------");
		mostrarP(A);
		System.out.println("------------------------------");
		contarColores(A);
		
	}
	// Procedimiento contar colores
	public static void contarColores(Stack<String> A) {
		
		Stack<String> aux = new Stack<String>();
		Stack<String> R = new Stack<String>();
		while (!A.empty()) {
			int contador = 1;
			String x = A.pop();
			R.push(x);
			while (!A.empty()) {
				String y = A.pop();
				if(x.equalsIgnoreCase(y)){
					contador ++;
					R.push(y);
				}
				else {
					aux.push(y);
				}
				
			}
			vaciarP(A,aux);
			System.out.println(x +" = "+contador);
		}
		vaciarP(A,R);
		
	}
	// Procedimiento Agrupar por colores
	public static void agruparColores(Stack<String> A) {
		Stack<String> aux = new Stack<String>();
		Stack<String> R = new Stack<String>();
		while (!A.empty()) {
			String x = A.pop();
			R.push(x);
			while (!A.empty()) {
				String y = A.pop();
				if(x.equalsIgnoreCase(y)){
					R.push(y);
				}
				else {
					aux.push(y);
				}
			}
			vaciarP(A,aux);
		}
		vaciarP(A,R);
	}
	// Funcion Verificar color
	public static boolean solFun(Stack<String> A, String cx) {
		Stack<String> aux = new Stack<String>();
		while(!A.empty()) {
			String y = A.pop();
			if(y.equalsIgnoreCase(cx)) {
				A.push(y);
				vaciarP(A,aux);
				return true;
			}
			aux.push(y);
		}
		vaciarP(A,aux);
		return false;
	}
	// Procedimiento Verificar Color
	public static void verificarColor(Stack<String> A, String x) {
		Stack<String> aux =new Stack<String>();
		boolean sw = false;
		while(!A.empty()) {
			String y = A.pop();
			if(y.equalsIgnoreCase(x)) {
				sw =true;
			}
			aux.push(y);
		}
		vaciarP(A,aux);
		if(sw) {
			System.out.println("Existe el color "+x);
		}
		else {
			System.out.println("No Existe el color "+x);
			
		}
	}
	
	// Procedimiento Mostrar Pila
	public static void mostrarP(Stack<String> A) {
		Stack<String> aux =new Stack<String>();
		while(!A.empty()) {
			String x = A.pop();
			System.out.println(x+" ");
			aux.push(x);
		}
		vaciarP(A,aux);
	}

	// Procedimiento VaciarPila
	public static void vaciarP(Stack<String> b, Stack<String> aux) {
		while(!aux.empty()) {
			b.push(aux.pop());
		}	
	}

}
