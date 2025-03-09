import java.util.*;
public class municipioLp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		Stack a = new Stack ();
		
		a.push(3);
		a.push(6);
		a.push(5);
		a.push(7);
		
		System.out.println(a+" "+a.peek());
		a.pop();
		System.out.println(a);
		*/
		//======================================================
		System.out.print("Cantidad Elementos-Stack: ");
		int n = teclado.nextInt();
		Stack <Macrodistrito> m1 = new Stack <Macrodistrito>();
		cargar (m1,n);
		organiza(m1); 
		mostrar(m1);
		
		//======================================================
		pilaZ p1 = new pilaZ();
		System.out.print("Cantidad Elementos-Pilas: ");
		p1.llenar(teclado.nextInt());
		p1.mostrar();
		
		// Cargar los Macrodistritos y sus Zonas
		System.out.print("Cantidad Elementos: ");
		int x = teclado.nextInt();
		llenado(m1,p1,x);
		mostrar(m1);
		p1.mostrar();
		
		
	}
	
	//*************************************************************
	// Procedimiento Llenado
	public static void llenado(Stack<Macrodistrito> M1, pilaZ P1, int n) {
		Scanner teclado = new Scanner(System.in);
		
		for(int i=1;i<=n;i++) {
			Macrodistrito m = new Macrodistrito();
			m.leerM();
			M1.push(m);
			System.out.print("Cantidad Zonas       ---> ");
			int nz = teclado.nextInt();
			for(int j=1;j<=nz;j++) {
				Zona zx = new Zona();
				zx.setIdMac(m.getIdMac());
				zx.setNombre(teclado.nextLine());
				teclado.nextLine();
				P1.adicionar(zx);
			}
		}	
	}
	// Procedimiento Organiza
	public static void organiza(Stack<Macrodistrito> M1) {
		
		Stack<Macrodistrito> aux1 = new Stack<Macrodistrito>();
		Stack<Macrodistrito> aux2 = new Stack<Macrodistrito>();

		while (!M1.empty()) {
			Macrodistrito a = M1.pop();
			aux2.push(a);
			while (!M1.empty()) {
				Macrodistrito b = M1.pop();
				if(a.getTipo().equals(b.getTipo())){
					aux2.push(b);
				}
				else {
					aux1.push(b);
				}
			}
			vaciar(M1,aux1);
		}
		vaciar(M1,aux2);
	}
	
	// Procedimiento Mostrar
	public static void mostrar(Stack<Macrodistrito> z) {
		Stack <Macrodistrito> aux = new Stack <Macrodistrito>();
		while(!z.empty()) {
			Macrodistrito m = z.pop();
			m.mostrarM();
			aux.push(m);
		}
		vaciar(aux,z);
	}
	
	// Procedimiento vaciar
	public static void vaciar(Stack<Macrodistrito> A, Stack<Macrodistrito> B) {
		while(!B.empty()) {
			A.push(B.pop());
		}	
	}
	
	// Procedimiento Cargar elementos
	public static void cargar(Stack<Macrodistrito> w, int n) {
		for(int i=1; i<=n;i++) {
			Macrodistrito m = new Macrodistrito();
			m.leerM();
			w.push(m);
		}	
	}

}
