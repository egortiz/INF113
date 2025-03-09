import java.util.*;

public class PilaI {
	private int max; 
	private IslaV v[]; 
	private int tope;
	
	PilaI(){
        tope = 0;
        max = 100;
        v = new IslaV[max+1];   
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
    
    void adicionar (IslaV elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    IslaV eliminar (){
    	IslaV elem = new IslaV();
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
    		System.out.println ("\nIslaV (s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaI aux = new PilaI ();
    		while (!esVacia ()){
    			IslaV elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarI();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		IslaV elem = new IslaV();
			elem.leerI();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaI a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}