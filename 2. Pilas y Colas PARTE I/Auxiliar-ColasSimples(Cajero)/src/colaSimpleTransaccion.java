public class colaSimpleTransaccion {
	private int max=50;
    private Transaccion v[] = new Transaccion[max+1];
    private int ini;
    private int fin;
    
    colaSimpleTransaccion(){
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
    
    void adicionar (Transaccion elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Cliente llena");
    	}
    }
    
    Transaccion eliminar (){
    	Transaccion elem = new Transaccion();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola Cliente vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("---> Datos de la Cola <---");
    		colaSimpleTransaccion aux = new colaSimpleTransaccion();
    		while (!esVacia ()) {
    			Transaccion elem = eliminar ();
    			elem.mostrarT();
    			aux.adicionar (elem);
    		}
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (colaSimpleTransaccion a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    /*
    void llenar(Transaccion W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		Transaccion elem = new Transaccion();
    		elem.leerT();
    		adicionar(elem);
    	}
    }
    */
}
	



