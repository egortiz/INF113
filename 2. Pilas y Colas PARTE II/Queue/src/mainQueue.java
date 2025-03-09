import java.util.*;
public class mainQueue {

	public static void main(String[] args) {
		Stack<String> miStack = new Stack<String>();
		miStack.push("Pedro"); // Adiciona
		miStack.pop(); // Elimina
		miStack.empty(); // es Vacio	
		
		//Cola o Queue
		Queue<String> cola = new LinkedList<String>();
		cola.add("uno");
		cola.add("dos");
		cola.add("tres");
		cola.add("cuatro");
		cola.add("cinco");
		cola.add("Seis");
		cola.add("Siete");
		//System.out.println(cola);
		
		mostrarCola(cola);
		System.out.println("**********************");
		mostrarCola(cola);
	}
	
	// Procedimiento Mostrar
	public static void mostrarCola(Queue<String> C) {
		Queue<String> aux = new LinkedList<String>();
		while(!C.isEmpty()) {
			String q = C.poll();
			System.out.println(q);
			aux.add(q);
			}
		vaciarCola(C,aux);
	}
	// Procedimiento Vaciar
	public static void vaciarCola(Queue<String> C, Queue<String> AUX) {
		while(!AUX.isEmpty()) {
			C.add(AUX.poll());
			}	
	}
}
