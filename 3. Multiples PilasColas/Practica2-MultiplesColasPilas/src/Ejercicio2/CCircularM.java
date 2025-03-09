package Ejercicio2;
import java.util.*;

public class CCircularM {
	private int max=100;
    private Medicamentos v[]= new Medicamentos[max+1];
    private int ini,fin;
    
    CCircularM(){
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
    
    void adicionar (Medicamentos elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Medicamentos eliminar (){
    	Medicamentos elem = new Medicamentos();
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
    		System.out.println("\n---> Medicamentos de la Cola Circular (Medicamentos) <---");
    		//System.out.println("*****************************************************************************************************");
    		CCircularM aux = new CCircularM ();
    		while (!esVacia ()){
    			Medicamentos elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarM();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (CCircularM a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	System.out.println("Ingrese Dato(s) de la Cola de: (Medicamentos)");
    	for(int i=0;i<n;i++) {
    		Medicamentos elem = new Medicamentos();
    		elem.leerM();
    		adicionar(elem);
    	}
    }
}


