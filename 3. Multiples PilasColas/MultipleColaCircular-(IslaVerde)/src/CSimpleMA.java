import java.util.*;

public class CSimpleMA {
	private int max=100;
    private Macrodistrito v[]= new Macrodistrito[max+1];
    private int ini,fin;
    
    CSimpleMA(){
    	ini = 0;
    	fin = 0;
    }
    
    int nroElem (){
    	return ((max+fin-ini) % max);
    }
    
    boolean esVacia (){
    	if (nroElem () == 0) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    boolean esLlena (){
    	if (nroElem () == max-1) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    void adicionar (Macrodistrito elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Simple llena <--");
    	}
    }
    
    Macrodistrito eliminar (){
    	Macrodistrito elem = new Macrodistrito();
    	if (!esVacia ()){
    		ini = (ini + 1) % max;
    		elem = v [ini];
    		if (nroElem () == 0) {
    		ini = fin = 0;
    		}
    	}
    	else{
    		System.out.println ("--> Cola Simple llena <--");
    	}
    	return (elem);
    }

    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("Cola Simple vacia xxx");
    	}
    	else{
    		System.out.println("\n---> Macrodistrito de la Cola Simple (Macrodistrito) <---");
    		//System.out.println("*****************************************************************************************************");
    		CSimpleMA aux = new CSimpleMA ();
    		while (!esVacia ()){
    			Macrodistrito elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarM();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (CSimpleMA a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	Scanner teclado = new Scanner(System.in);
    	for(int i=1;i<=n;i++) {
    		Macrodistrito elem = new Macrodistrito();
    		elem.leerM();
    		adicionar(elem);
    	}
    }
}
    

