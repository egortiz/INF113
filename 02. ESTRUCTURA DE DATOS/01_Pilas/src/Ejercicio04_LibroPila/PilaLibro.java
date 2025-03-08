package Ejercicio04_LibroPila;
import java.util.*;

public class PilaLibro {
	private int max; 
	private Libro v[]; 
	private int tope;
	
	PilaLibro(){
        tope = 0;
        max = 100;
        v = new Libro[max+1];   
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
    
    void adicionar (Libro elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    	}
    	else {
    		System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Libro eliminar (){
    	Libro elem = new Libro();
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
    		System.out.println ("Libro(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaLibro aux = new PilaLibro ();
    		while (!esVacia ()){
    			Libro elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarLibro();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Libro elem = new Libro();
			elem.leerLibro();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaLibro a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}