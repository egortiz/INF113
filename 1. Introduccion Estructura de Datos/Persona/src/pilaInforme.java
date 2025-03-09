import java.util.*;
public class pilaInforme {
	private int max = 100;
	private Informe v[] = new Informe[max+1];
	private int tope;
	
	pilaInforme(){
        tope=0;
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
    	if (tope == max) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    int nroElem (){
    	return (tope);
    	}
    
    void adicionar (Informe elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena");
	    }
    }
    	
    Informe eliminar (){
    	Informe elem = new Informe();
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
    		System.out.println ("\n Informe de la Pila ");
    		pilaInforme aux = new pilaInforme ();
    		while (!esVacia ()){
    			Informe elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarI();
    		}
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Informe z = new Informe();
			z.leerI();
			adicionar(z);	
		}
    }
    
    void vaciar (pilaInforme a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}
