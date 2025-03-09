package EstacionExperimental;
import java.util.*;

public class CCircularP {
	private int max=100;
    private Producto v[]=new Producto[max+1];
    private int ini,fin;
    
    CCircularP(){
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
    
    void adicionar (Producto elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Producto eliminar (){
    	Producto elem = new Producto();
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
    		System.out.println("\n---> Datos de la Cola Circular (Producto) <---");
    		System.out.println("*****************************************************************************************************");
    		CCircularP aux = new CCircularP ();
    		while (!esVacia ()){
    			Producto elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarP();
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (CCircularP a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar (int n) {
    	System.out.println("Ingrese Dato(s) de la Cola");
    	for(int i=0;i<n;i++) {
    		Producto elem = new Producto();
    		elem.leerP();
    		adicionar(elem);
    	}
    }
}



