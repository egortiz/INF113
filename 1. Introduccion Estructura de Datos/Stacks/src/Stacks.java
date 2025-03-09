import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> A =new Stack<Integer>();
		System.out.println(A.size());
		
		Stack<Integer> B =new Stack<Integer>();
		B.push(1);
		B.push(2);
		B.push(3);
		B.push(15);
		B.push(9);
		B.push(7);
		
		
		// Pusch(dato): Introduce un dato al final de la pila
		A.push(1);
		A.push(2);
		A.push(3);
		A.push(4);
		A.push(5);
		A.push(6);
		
		System.out.println(A.size());
		System.out.println(A);
		
		// Peek(): Devuelve el ultimo dato que fue introducido en la pila.
		System.out.println("Sacando ----> "+ A.peek());
		System.out.println(A.size());
		
		// Pop (): Devuelve y elimina el ultimo dato que fue introducido en la pila
		System.out.println("Sacando ----> "+ A.pop());
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		System.out.println(A.size());
		
		// empty(): Devuelve true (verdadero)si la pila esta vacia, es decir no contiene ningun elemento.
		// Caso contrario devulve false (Falso)
		
		System.out.println(A.empty());
		
		// Size: Devuelve la cantidad de elementos en la pila, es decir el numero de elementos que contiene
		System.out.println(A.size());
		
		// -------------------EJERCICIOS--------------------
		// a) Crear el metodo mostrar respetando LIFO
		System.out.println("-----------SOLUCION A -------------");
		mostrarP(B);
		System.out.println();
		System.out.println(B.size());
		
		// b) Intercambiar los elementos de la Pila
		System.out.println("-----------SOLUCION B -------------");
		intercambiar(B);
		mostrarP(B);
		System.out.println("");
		
		// c) Mostrar los numero pares de la Pila
		System.out.println("-----------SOLUCION C -------------");
		mostrarPares(B);
		System.out.println("");
		// d) Ordenar los datos de la pila
		System.out.println("-----------SOLUCION D -------------");
		ordenarDatos(B);
		mostrarP(B);
		

	}
	//Procedimiento ordenar datos
	public static void ordenarDatos(Stack<Integer> b) {
		Stack<Integer> aux = new Stack<Integer>();
		Stack<Integer> R = new Stack<Integer>();
		while(!b.empty()) {
			int may = b.pop();
			while(!b.empty()) {
				int x = b.pop();
				if(x<may) {
					aux.push(may);
					may = x;
				}
				else {
					aux.push(x);
				}
			}
			vaciar(b,aux);
			R.push(may);
		}
		vaciar(b,R);
	}
	// Procedimiento mostrar Pares
	public static void mostrarPares(Stack<Integer> b) {
		Stack<Integer> aux =new Stack<Integer>();
		while(!b.empty()) {
			int x = b.pop();
			if(x%2 == 0) {
				System.out.print(x+" ");
			}
			aux.push(x);
		}
		vaciar(b,aux);
	}
		
		
	
	//Procedimiento intercambiar extremos
	public static void intercambiar(Stack<Integer> b) {
		int x = b.pop();
		Stack<Integer> aux = new Stack<Integer>();
		// Vaciar aux, lo que tengo en b
		vaciar(aux,b);
		
		int y = aux.pop();
		b.push(x);
		vaciar(b,aux);
		b.push(y);
		
	}
	// Procedimiento Mostrar Pila
	public static void mostrarP(Stack<Integer> b) {
		Stack<Integer> aux =new Stack<Integer>();
		while(!b.empty()) {
			int x = b.pop();
			System.out.print(x+" ");
			aux.push(x);
		}
		vaciar(b,aux);
	}
	
	// Procedimiento Vaciar
	private static void vaciar(Stack<Integer> b, Stack<Integer> aux) {
		while(!aux.empty()) {
			b.push(aux.pop());
		}	
	}
	

}
