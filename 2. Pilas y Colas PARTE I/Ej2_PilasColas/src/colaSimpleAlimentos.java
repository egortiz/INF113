public class colaSimpleAlimentos {
	private int max=50;
    private Alimentos v[]=new Alimentos[max+1];
    private int ini;
    private int fin;
    
    colaSimpleAlimentos(){
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
    
    void adicionar (Alimentos elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Alimentos llena");
    	}
    }
    
    Alimentos eliminar (){
    	Alimentos elem = new Alimentos();
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
    		System.out.println("\n---> Datos de la Cola Simple (Alimentos) <---");
    		System.out.println("*****************************************************************************************************");
    		colaSimpleAlimentos aux = new colaSimpleAlimentos();
    		while (!esVacia ()) {
    			Alimentos elem = eliminar ();
    			elem.mostrarA();
    			aux.adicionar (elem);
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (colaSimpleAlimentos a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    /*
    void llenar(Estudiante W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		Estudiante elem = new Estudiante();
    		elem.leerE();
    		adicionar(elem);
    	}
    }
    */
}
	


