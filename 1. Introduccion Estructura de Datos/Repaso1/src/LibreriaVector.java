import java.util.*;

public class LibreriaVector {

	public static void main(String[] args) {
	// Vectores = v[]
		int z[] = new int[20];
		System.out.println(z.length);
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0;i<10;i++) {
			v.add(i+10);	
		}
		
		System.out.println(v.size());
		System.out.println(v);
		
		// Verificar si existe el numero X
		if(verificaNum(v,12)) {
			System.out.println("Existe");
			}
		else {
			System.out.println("No Existe");
		}
		
		// Adicionar el numero 7,10 antes del vector
		v.add(0,7);
		v.add(1,10);
		System.out.println(v);
		
		// Adicionar n elementos al principio de mi vector
		adicionarNElementos(v,5);
		System.out.println(v);
		
		// Eliminar el elemento X de nuestro vector
		eliminarXElemento(v,4);
		System.out.println(v);
	}
	// Procedimiento eliminar
	public static void eliminarXElemento(Vector<Integer> v, int x) {
		v.remove(x);
	}
	

	// Procedimiento adicionar n elementos
	public static void adicionarNElementos(Vector<Integer> v, int n) {
		for(int i=0;i<n;i++) {
			v.add(i,i+1*2);	
		}
		
	}
	// Procedimiento para verificar numero
	public static boolean verificaNum(Vector<Integer> v, int x) {
		if(v.contains(x)) {
			return true;
		}
		else {
			return false;
		}

		
	}
	
	
	

}
