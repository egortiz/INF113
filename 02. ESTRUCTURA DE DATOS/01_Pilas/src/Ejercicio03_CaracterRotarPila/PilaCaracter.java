package Ejercicio03_CaracterRotarPila;
import java.util.*;

public class PilaCaracter {
	private int max; 
	private Caracter v[]; 
	private int tope;
	
	PilaCaracter(){
		tope = 0;
        max = 100;
        v = new Caracter[max+1];   
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
    
    void adicionar (Caracter elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    	}
    	else {
    		System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Caracter eliminar (){
    	Caracter elem = new Caracter();
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
    		System.out.println ("Caracter(s) de la Pila");
    		System.out.println("*************************************************************************************");
    		PilaCaracter aux = new PilaCaracter ();
    		while (!esVacia ()){
    			Caracter elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarCaracter();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Caracter elem = new Caracter();
			elem.leerCaracter();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaCaracter a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}
