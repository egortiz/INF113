package Ejercicio1;

import java.util.Scanner;

public class CSimpleLI {
	private int max = 100;
    private Libro v[] = new Libro[max+1];
    private int ini;
    private int fin;
    
    CSimpleLI(){
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
    
    void adicionar (Libro elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Libro llena");
    	}
    }
    
    Libro eliminar (){
    	Libro elem = new Libro();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola Libro vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("\n---> Datos de la Cola Simple (Libro) <---");
    		System.out.println("*****************************************************************************************************");
    		CSimpleLI aux = new CSimpleLI();
    		while (!esVacia ()) {
    			Libro elem = eliminar ();
    			elem.mostrarL();
    			aux.adicionar (elem);
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (CSimpleLI a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    void llenar(int n) {
    	Scanner teclado = new Scanner(System.in);
    	for(int i=1;i<=n;i++) {
    		Libro elem = new Libro();
    		elem.leerL();
    		adicionar(elem);
    	}
    }
}
	


	


