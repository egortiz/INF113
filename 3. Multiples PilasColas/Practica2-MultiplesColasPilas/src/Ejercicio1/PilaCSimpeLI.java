package Ejercicio1;
import java.util.*;

public class PilaCSimpeLI {
	private int max = 100;
	private CSimpleLI v[] = new CSimpleLI[max+1];  
	private int tope;
	
	PilaCSimpeLI(){
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
    
    void adicionar (CSimpleLI elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    CSimpleLI eliminar (){
    	CSimpleLI elem = new CSimpleLI();
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
    		System.out.println ("\n Pila de CSimpleLI de la Pila ");
    		System.out.println("*****************************************************************************************************");
    		PilaCSimpeLI aux = new PilaCSimpeLI ();
    		while (!esVacia ()){
    			CSimpleLI elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrar();
    		}
    		vaciar(aux);
    		System.out.println("*****************************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	Scanner teclado = new Scanner(System.in);
    	for(int i=1;i<=n;i++) {
    		CSimpleLI elemCSI = new CSimpleLI();
    		System.out.print("Cant. de Elementos (Cola): ");
    		int x = teclado.nextInt();
    		for(int j=1;j<=x;j++) {
    			Libro elemLI = new Libro();
    			elemLI.leerL();
    			elemCSI.adicionar(elemLI);	
    		}
    		adicionar(elemCSI);
		}
    }
    
    void vaciar (PilaCSimpeLI a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}


