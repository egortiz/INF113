public class ColaCircularDa {
	private int max=100;
    private Datos v[]= new Datos[max+1];
    private int ini,fin;
    
    ColaCircularDa(){
    	ini = 0;
    	fin = 0;
    }
    
    int nroElem (){
    	return ((max + fin - ini) % max);
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
    
    void adicionar (Datos elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Datos eliminar (){
    	Datos elem = new Datos();
    	if (!esVacia ()){
    		ini = (ini + 1) % max;
    		elem = v [ini];
    		if (nroElem () == 0) {
    		ini = fin = 0;
    		}
    	}
    	else{
    		System.out.println ("--> Cola Circular llena <--");
    	}
    	return (elem);
    }

    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("Cola vacia xxx");
    	}
    	else{
    		System.out.println("\n---> Datos de la Cola Circular (Datos) <---");
    		//System.out.println("*****************************************************************************************************");
    		ColaCircularDa aux = new ColaCircularDa ();
    		while (!esVacia ()){
    			Datos elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarD();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (ColaCircularDa a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	System.out.println("Ingrese Dato(s) de la Cola de: (Datos)");
    	for(int i=0;i<n;i++) {
    		Datos elem = new Datos();
    		elem.leerD();
    		adicionar(elem);
    	}
    } 
}