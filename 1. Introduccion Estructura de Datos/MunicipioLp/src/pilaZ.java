import java.util.*;
public class pilaZ {
	private int max = 100;
	private Zona v[] = new Zona[max+1];
	private int tope;
	
	pilaZ(){
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
    
    void adicionar (Zona elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena");
	    }
    }
    	
    Zona eliminar (){
    	Zona elem = new Zona();
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
    		System.out.println ("\n Zonas de la Pila ");
    		pilaZ aux = new pilaZ ();
    		while (!esVacia ()){
    			Zona elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarZ();
    		}
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Zona z = new Zona();
			z.leerZ();
			adicionar(z);	
			}
    }
    
    void vaciar (pilaZ a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}


