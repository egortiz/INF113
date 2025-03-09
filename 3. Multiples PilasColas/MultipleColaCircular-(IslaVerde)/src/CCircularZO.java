public class CCircularZO {
	private int max=100;
    private Zona v[] = new Zona[max+1];
    private int ini;
    private int fin;
    
    CCircularZO(){
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
    
    void adicionar (Zona elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Zona eliminar (){
    	Zona elem = new Zona();
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
    		System.out.println("\n---> Datos de la Cola Circular (Zona) <---");
    		//System.out.println("*****************************************************************************************************");
    		CCircularZO aux = new CCircularZO ();
    		while (!esVacia ()){
    			Zona elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarZ();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
	}

    void vaciar (CCircularZO a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    void llenar(int n) {
    	System.out.println("Ingrese Dato(s) de la Cola");
    	for(int i=1;i<=n;i++) {
    		Zona elem = new Zona();
    		elem.leerZ();
    		adicionar(elem);
    	}
    }
}



