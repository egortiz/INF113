package EstacionExperimental;
import java.util.*;

public class CSimpleEE {
	private int max = 100;
    private EstacionExperimental v[] = new EstacionExperimental[max+1];
    private int ini;
    private int fin;
    
    CSimpleEE(){
        ini=0;
        fin=0;
    }
    
    boolean esVacia (){
    	if (ini == 0 && fin == 0) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    boolean esLlena (){
    	if (fin == max) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    int nroElem (){
    	int w = (fin - ini);
    	return (w);
    }
    
    void adicionar (EstacionExperimental elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola EstacionExperimental llena");
    	}
    }
    
    EstacionExperimental eliminar (){
    	EstacionExperimental elem = new EstacionExperimental();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola EstacionExperimental vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("\n---> Datos de la Cola Simple (EstacionExperimental) <---");
    		System.out.println("*****************************************************************************************************");
    		CSimpleEE aux = new CSimpleEE();
    		while (!esVacia ()) {
    			EstacionExperimental elem = eliminar ();
    			elem.mostrarE();
    			aux.adicionar (elem);
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (CSimpleEE a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    void llenar(EstacionExperimental W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		EstacionExperimental elem = new EstacionExperimental();
    		elem.leerE();
    		adicionar(elem);
    	}
    }
}