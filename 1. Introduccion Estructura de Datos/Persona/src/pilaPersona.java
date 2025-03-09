import java.util.*;
public class pilaPersona {
	private int max = 100;
	private Persona v[] = new Persona[max+1];
	private int tope;
	
	pilaPersona(){
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
    
    void adicionar (Persona elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena");
	    }
    }
    	
    Persona eliminar (){
    	Persona elem = new Persona();
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
    		System.out.println ("\n Persona de la Pila ");
    		pilaPersona aux = new pilaPersona ();
    		while (!esVacia ()){
    			Persona elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarP();
    		}
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Persona z = new Persona();
			z.leerP();
			adicionar(z);	
		}
    }
    
    void vaciar (pilaPersona a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}


