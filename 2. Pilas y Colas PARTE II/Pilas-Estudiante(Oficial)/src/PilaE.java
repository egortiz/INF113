import java.util.*;
public class PilaE {
	private int max; 
	private Estudiante v[]; 
	private int tope;
	
	PilaE(){
        tope = 0;
        max = 100;
        v = new Estudiante[max+1];   
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
    
    void adicionar (Estudiante elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Estudiante eliminar (){
    	Estudiante elem = new Estudiante();
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
    		System.out.println ("\nEstudiante(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaE aux = new PilaE ();
    		while (!esVacia ()){
    			Estudiante elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarE();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Estudiante elem = new Estudiante();
			elem.leerE();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaE a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}
