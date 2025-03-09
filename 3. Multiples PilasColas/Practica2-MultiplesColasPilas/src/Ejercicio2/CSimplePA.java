package Ejercicio2;
import java.util.Scanner;

public class CSimplePA {
	private int max=100;
    private Pacientes v[]= new Pacientes[max+1];
    private int ini,fin;
    
    CSimplePA(){
    	ini = 0;
    	fin = 0;
    }
    
    int nroElem (){
    	return ((max+fin-ini) % max);
    }
    
    boolean esVacia (){
    	if (nroElem () == 0) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    boolean esLlena (){
    	if (nroElem () == max-1) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    void adicionar (Pacientes elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Simple llena <--");
    	}
    }
    
    Pacientes eliminar (){
    	Pacientes elem = new Pacientes();
    	if (!esVacia ()){
    		ini = (ini + 1) % max;
    		elem = v [ini];
    		if (nroElem () == 0) {
    		ini = fin = 0;
    		}
    	}
    	else{
    		System.out.println ("--> Cola Simple llena <--");
    	}
    	return (elem);
    }

    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("Cola Simple vacia xxx");
    	}
    	else{
    		System.out.println("\n---> Pacientes de la Cola Simple (Pacientes) <---");
    		//System.out.println("*****************************************************************************************************");
    		CSimplePA aux = new CSimplePA ();
    		while (!esVacia ()){
    			Pacientes elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarP();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (CSimplePA a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	Scanner teclado = new Scanner(System.in);
    	for(int i=1;i<=n;i++) {
    		Pacientes elem = new Pacientes();
    		elem.leerP();
    		adicionar(elem);
    	}
    }
}
    




