import java.util.*;

public class CCircularCO {
	private int max=100;
    private Contenedor v[] = new Contenedor[max+1];
    private int ini;
    private int fin;
    
    CCircularCO(){
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
    
    void adicionar (Contenedor elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Contenedor eliminar (){
    	Contenedor elem = new Contenedor();
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
    		System.out.println("\n---> Datos de la Cola Circular (Contenedor) <---");
    		//System.out.println("*****************************************************************************************************");
    		CCircularCO aux = new CCircularCO ();
    		while (!esVacia ()){
    			Contenedor elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarC();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (CCircularCO a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	System.out.println("Ingrese Dato(s) de la Cola");
    	for(int i=1;i<=n;i++) {
    		Contenedor elem = new Contenedor();
    		elem.leerC();
    		adicionar(elem);
    	}
    }
}


