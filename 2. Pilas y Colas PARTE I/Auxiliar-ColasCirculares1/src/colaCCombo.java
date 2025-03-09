public class colaCCombo {
    private int max=100;
    private Combo v[]=new Combo[max+1];
    private int ini,fin;
    
    colaCCombo(){
    	ini = 0;
    	fin = 0;
    	v = new Combo[max+1];
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
    
    void adicionar (Combo elem){
    	if (!esLlena ()){
    		fin = (fin + 1) % max;
    		v [fin] = elem;
    	}
    	else {
    		System.out.println ("--> Cola Circular llena <--");
    	}
    }
    
    Combo eliminar (){
    	Combo elem = new Combo();
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
    		System.out.println ("\n --> Combo de la Cola <--");
    		colaCCombo aux = new colaCCombo ();
    		while (!esVacia ()){
    			Combo elem = eliminar ();
    			aux.adicionar (elem);
	            elem.mostrarC();
    		}
    		vaciar(aux);
    	}
	}

    void vaciar (colaCCombo a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }
    
    /*
    void llenar (int n) {
    	System.out.println("Ingrese Dato(s) de la Cola");
    	for(int i=0;i<n;i++) {
    		Combo elem = new String();
    		elem.leerS();
    		adicionar(elem);
    	}
    }
    */
}
