package Practica02_EnteroPila;
import java.util.*;

public class PilaEntero {
	private int max; 
	private Entero v[]; 
	private int tope;
	
	PilaEntero(){
        tope = 0;
        max = 100;
        v = new Entero[max+1];   
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
    
    void adicionar (Entero elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    	}
    	else {
    		System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Entero eliminar (){
    	Entero elem = new Entero();
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
    		System.out.println ("\nentero(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaEntero aux = new PilaEntero ();
    		while (!esVacia ()){
    			Entero elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarEntero();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Entero elem = new Entero();
			elem.leerEntero();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaEntero a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}

	


