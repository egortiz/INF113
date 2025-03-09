public class PilaA {
	private int max = 100; 
	private Arbol v[] = new Arbol[max+1]; 
	private int tope;
	
	PilaA(){
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
    
    void adicionar (Arbol elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Arbol eliminar (){
    	Arbol elem = new Arbol();
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
    		System.out.println ("\nArbol(s) de la Pila ");
    		System.out.println("*************************************************************************************");
    		PilaA aux = new PilaA ();
    		while (!esVacia ()){
    			Arbol elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarA();
    		}
    		vaciar(aux);
    		System.out.println("*************************************************************************************");
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Arbol elem = new Arbol();
			elem.leerA();
			adicionar(elem);	
			}
    }
    
    void vaciar (PilaA a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
}


