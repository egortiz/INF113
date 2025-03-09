public class CSimpleE {
	private int max = 100;
    private Estudiante v[] = new Estudiante[max+1];
    private int ini;
    private int fin;
    
    CSimpleE(){
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
    
    void adicionar (Estudiante elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Estudiante llena");
    	}
    }
    
    Estudiante eliminar (){
    	Estudiante elem = new Estudiante();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola Estudiante vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("\n---> Datos de la Cola Simple (Estudiante) <---");
    		System.out.println("*****************************************************************************************************");
    		CSimpleE aux = new CSimpleE();
    		while (!esVacia ()) {
    			Estudiante elem = eliminar ();
    			elem.mostrarE();
    			aux.adicionar (elem);
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (CSimpleE a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    void llenar(Estudiante W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		Estudiante elem = new Estudiante();
    		elem.leerE();
    		adicionar(elem);
    	}
    }
}
	


