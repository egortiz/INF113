import java.util.*;

public class ColaCircularNi {
	private int max=100;
    private Ninio v[] = new Ninio[max+1];
    private int ini,fin;
    
    ColaCircularNi(){
    	ini = 0;
    	fin = 0;
    }
    
    int nroElem (){
    	return ((max + fin - ini) % max);
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
    
    void adicionar (Ninio elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Ninio eliminar (){
    	Ninio elem = new Ninio();
    	if (!esVacia ()){
    		ini = (ini + 1) % max;
    		elem = v [ini];
    		if (nroElem () == 0) {
    		ini = fin = 0;
    		}
    	}
    	else{
    		System.out.println ("--> Cola Circular llena <--");
    	}
    	return (elem);
    }

    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("Cola vacia xxx");
    	}
    	else{
    		System.out.println("\n---> Datos de la Cola Circular (Ninio) <---");
    		//System.out.println("*****************************************************************************************************");
    		ColaCircularNi aux = new ColaCircularNi ();
    		while (!esVacia ()){
    			Ninio elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarN();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (ColaCircularNi a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	System.out.println("Ingrese Dato(s) de la Cola");
    	for(int i=0;i<n;i++) {
    		Ninio elem = new Ninio();
    		elem.leerN();
    		adicionar(elem);
    	}
    }

}



