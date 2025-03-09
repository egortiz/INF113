import java.util.*;
public class EjemploStack {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		Stack A = new Stack ();
		
		// Adicionar
		
		A.push("uno");
		A.push("dos");
		A.push("tres");
		A.push("cuatro");
		A.push("cinco");
		A.push("seis");
		
		System.out.println(A);
		*/
	//==============================================
		Stack<Mueble> m1 = new Stack<Mueble>();
		System.out.print("Cantidad de Muebles: ");
		int n = teclado.nextInt();
		llenarM(m1,n);
		mostrarM(m1);
		
		teclado.nextLine();
	// Levar los muebles de color x al principio
		System.out.println("...................................................................");
		System.out.print("Color de Mueble    : ");
		String x = teclado.nextLine();
		llevar(m1,x);
		mostrarM(m1);

	}
	
	// Procedimiento Llevar
	public static void llevar(Stack<Mueble> M1, String X) {
		Stack<Mueble> aux = new Stack<Mueble>();
		Stack<Mueble> resto = new Stack<Mueble>();
		
		while(!M1.empty()) {
			Mueble w = M1.pop();
			if(w.getColor().equalsIgnoreCase(X)) {
				aux.push(w);
			}
			else {
				resto.push(w);
			}
		}
		//Vaciar aux a ----> M1
		vaciar(aux,M1);
		vaciar(resto,M1);
	}

	// Procedimiento Llenar	
		public static void llenarM(Stack<Mueble> M1, int n) {
			for(int i=1; i<=n;i++) {
				Mueble w = new Mueble();
				w.leerM();
				M1.push(w);
			}	
		}
	// Procedimiento Mostrar
	public static void mostrarM(Stack<Mueble> M1) {
		Stack <Mueble> aux = new Stack <Mueble>();
		while(!M1.empty()) {
			Mueble w = M1.pop();
			w.mostrarM();
			aux.push(w);
		}
		vaciar(aux,M1);
	}

	// Procedimiento Vaciar
	public static void vaciar(Stack<Mueble> M1, Stack<Mueble> aux) {
		while(!M1.empty()) {
			aux.push(M1.pop());
		}	
	}

}
