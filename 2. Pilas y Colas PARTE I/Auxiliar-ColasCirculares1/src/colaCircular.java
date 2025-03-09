import java.util.*;
public class colaCircular {
    private int max=100;
    private String v[]=new String[max+1];
    private int ini,fin;
    
    colaCircular(){
    	ini = 0;
    	fin = 0;
    	v = new String[max+1];
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
    	if (nroElem () == max) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    void adicionar (String elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    String eliminar (){
    	String elem = null;
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
    		System.out.println ("\n String de la Cola ");
    		colaCircular aux = new colaCircular ();
    		while (!esVacia ()){
    			String elem = eliminar ();
    			aux.adicionar (elem);
	            //elem.mostrar(); 
    		}
    		vaciar(aux);
    	}
	}

    void vaciar (colaCircular a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    /*
    void llenar (int n) {
    	System.out.println("Ingrese Dato(s) de la Cola");
    	for(int i=0;i<n;i++) {
    		String elem = new String();
    		elem.leerS();
    		adicionar(elem);
    	}
    }
    */
}
