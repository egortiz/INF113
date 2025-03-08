package Ejercicio05_CuadernoPila;
import java.util.*;

public class PilaCuaderno {
	private int max; 
	private Cuaderno v[]; 
	private int tope;
	
	PilaCuaderno(){
        tope = 0;
        max = 100;
        v = new Cuaderno[max+1];   
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
    
    void adicionar (Cuaderno elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    	}
    	else {
    		System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Cuaderno eliminar (){
    	Cuaderno elem = new Cuaderno();
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
    		System.out.println ("Cuaderno(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaCuaderno aux = new PilaCuaderno ();
    		while (!esVacia ()){
    			Cuaderno elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarCuaderno();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Cuaderno elem = new Cuaderno();
			elem.leerCuaderno();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaCuaderno a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}