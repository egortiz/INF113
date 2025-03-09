public class colaSimple {
	private int max=50;
    private String v[]=new String[max+1];
    private int ini;
    private int fin;
    
    colaSimple(){
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
    
    void adicionar (String elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Estudiante llena");
    	}
    }
    
    String eliminar (){
    	String elem = new String();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola Simple vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("---> Datos de la Cola <---");
    		colaSimple aux = new colaSimple();
    		while (!esVacia ()) {
    			String elem = eliminar ();
    			System.out.println("["+elem+"]");
    			//elem.mostrar(); // mostrar del objeto
    			aux.adicionar (elem);
    		}
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (colaSimple a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    /*
    void llenar(String  W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		Estudiante elem = new Estudiante();
    		elem.leerE();
    		adicionar(elem);
    	}
    }
    */
}
	



