import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		colaCCombo ccc = new colaCCombo();
		// Llenar Cola Circular de Combos
		llenar(ccc);
		ccc.mostrar();
		
		// Mostrar el Combo con el id = X
		System.out.println("................................................................................" );
		System.out.println("--------------------- SOLUCION A ---------------------");
		System.out.print("Buscar ID            ---> ");
		int x = teclado.nextInt();
		
		buscarId(ccc,x);
		ccc.mostrar();
		
		

	}
	
	//Procedimiento LLenar Cola circular de combo
	public static void llenar(colaCCombo CCC) {
		CCC.adicionar(new Combo(1,25.5,"Dona"));
		CCC.adicionar(new Combo(5,51,"Pollo"));
		CCC.adicionar(new Combo(10,102.5,"Pollo"));
		CCC.adicionar(new Combo(21,25.5,"Hamburgueza"));
		CCC.adicionar(new Combo(15,130.5,"Pollo"));
		CCC.adicionar(new Combo(100,225.5,"Pollo"));
	}
	
	// Solucion A
	public static void buscarId(colaCCombo CCC, int X) {
		int n = CCC.nroElem();
		for(int i=0;i<n;i++) {
			Combo elem = CCC.eliminar();
			if(elem.getNroCombo() == X) {
				elem.mostrarC();
			}
			CCC.adicionar(elem);
		}
	}

}
