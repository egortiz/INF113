package Ejercicio2;

public class PilaES {
	private int max; 
	private Especialidades e[]; 
	private MultiColaPA m[]; 
	private PilaME p[]; 
	private int tope;
	
	PilaES(){
		super();
        tope = 0;
        max = 100;
        e = new Especialidades[max+1]; 
        m = new MultiColaPA[max+1];;
        p = new PilaME[max+1];
   
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
    
    void adicionar (Especialidades elem){
    	if (!esLlena ()){
    		tope++;     
    		e [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Especialidades eliminar (){
    	Especialidades elem = new Especialidades();
    	if (!esVacia ()){
    		elem = e [tope];
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
    		System.out.println ("\n Especialidad (s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaES aux = new PilaES ();
    		while (!esVacia ()){
    			Especialidades elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarE();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Especialidades elem = new Especialidades();
			elem.leerE();
			adicionar(elem);	
		}
    }
    
    void vaciar (PilaES a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }

}
