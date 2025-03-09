import java.util.*;
public class PilaD {
	private int max = 100;
	private Distrito v[] = new Distrito[max+1];  
	private int tope;
	
	PilaD(){
        tope = 0;
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
    
    void adicionar (Distrito elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Distrito eliminar (){
    	Distrito elem = new Distrito();
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
    		System.out.println ("\nDistrito(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaD aux = new PilaD ();
    		while (!esVacia ()){
    			Distrito elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarD();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Distrito elem = new Distrito();
			elem.leerD();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaD a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}
