import java.util.*;
public class pilaL {
	private int max = 100;
	private Libro v[] = new Libro[max+1];
	private int tope;
	
	pilaL(){
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
    		System.out.println ("\n Libro de la Pila ");
    		pilaL aux = new pilaL ();
    		while (!esVacia ()){
    			Libro elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarL();
    		}
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Libro z = new Libro();
			z.leerL();
			adicionar(z);	
			}
    }
    
    void vaciar (pilaL a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}

