import java.util.*;
public class Repaso1 {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		Vector v3 = new Vector();
		
		v1.add(27);
		v1.addElement(23);
		v1.add(22);
		v1.add("Hola");
		v1.add(28);
		
		
		System.out.println(v1);
		// Casteo ya que vectores lo guarda como objeto
		int x=(int)v1.get(1);
		
		// Index ----> posicion de un elemento 
		System.out.println(v1.indexOf("Hola"));
		
		// Is Empty ----> verifica si esta vacio el elemento
		System.out.println(v1.isEmpty());
		
		// Size ----> Muestra cantidad de elementos
		System.out.println(v1.size());
		
		// lastElement ----> Quien es el ultimo elemento
		System.out.println(v1.lastElement());
		
		
		
		// Llenar el vector con n elementos
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.print("Número de Elemento --> ");
		
		int n=teclado.nextInt();
		
		
		
		// Procedimiento LLenado
		llenado(v2,n);
		System.out.println(v2);
		
		llenado(v3,n/2);
		System.out.println(v3);
		
		
		
	}

	public static void llenado(Vector a, int n) {
		Scanner teclado = new Scanner (System.in);
		for(int i=1;i<=n;i++) {
			System.out.print("Ingrese Elemento ----> ");
			a.add(teclado.next());
		}
	}

}
