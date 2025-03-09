public class colaSimpleCliente {
	private int max=50;
    private Cliente v[]=new Cliente[max+1];
    private int ini;
    private int fin;
    
    colaSimpleCliente(){
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
    
    void adicionar (Cliente elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Cliente llena");
    	}
    }
    
    Cliente eliminar (){
    	Cliente elem = new Cliente();
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
    		colaSimpleCliente aux = new colaSimpleCliente();
    		while (!esVacia ()) {
    			Cliente elem = eliminar ();
    			elem.mostrarC();
    			aux.adicionar (elem);
    		}
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (colaSimpleCliente a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    /*
    void llenar(Cliente W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		Cliente elem = new Cliente();
    		elem.leerC();
    		adicionar(elem);
    	}
    }
    */
}
	


