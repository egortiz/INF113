package Ejercicio2;
import java.util.*;

public class PilaME {
	private int max; 
	private Medicos v[]; 
	private CCircularM cc[]; 
	private int tope;
	
	PilaME(){
        tope = 0;
        max = 100;
        v = new Medicos[max+1];   
    }
   
    boolean esVacia (){
    	if (tope == 0) {
    		return (true);
    	}
    	else {
    		return (false);
    		}
    }
    
    boolean esLlena (){
    	if (tope == (max)) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    int nroElem (){
    	return (tope);
    	}
    
    void adicionar (Medicos elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Medicos eliminar (){
    	Medicos elem = new Medicos();
    	if (!esVacia ()){
    		elem = v [tope];
    		tope--;
    	}
    	else {
    		System.out.println ("Pila vacia");
    	}
    	return (elem);
    }
    
    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("Pila vacia");
    	}
    	else{
    		System.out.println ("\n Medicos (s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaME aux = new PilaME ();
    		while (!esVacia ()){
    			Medicos elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarME();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Medicos elem = new Medicos();
			elem.leerME();
			adicionar(elem);	
		}
    }
    
    void vaciar (PilaME a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}


