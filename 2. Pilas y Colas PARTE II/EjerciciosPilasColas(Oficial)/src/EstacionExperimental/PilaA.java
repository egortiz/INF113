package EstacionExperimental;
import java.util.*;

public class PilaA {
	private int max = 100;
	private Animal v[] = new Animal[max+1];
	private int tope;
	
	PilaA(){
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
    
    void adicionar (Animal elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Animal eliminar (){
    	Animal elem = new Animal();
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
    		System.out.println("\n---> Datos de la Pila (Animal) <---");
    		System.out.println("*****************************************************************************************************");
    		PilaA aux = new PilaA ();
    		while (!esVacia ()){
    			Animal elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarA();
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Animal z = new Animal();
			z.leerA();
			adicionar(z);	
			}
    }
    
    void vaciar (PilaA a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}



