public class PilaZ {
	private int max = 100;; 
	private Zona v[]= new Zona[max+1];; 
	private int tope;
	
	PilaZ(){
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
    
    void adicionar (Zona elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
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
    		System.out.println ("\nZona(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaZ aux = new PilaZ ();
    		while (!esVacia ()){
    			Zona elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarZ();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Zona elem = new Zona();
			elem.leerZ();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaZ a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}

