public class CSimpleD {
	private int max = 20;;
    private Departamento v[]= new Departamento[max+1];;
    private int ini;
    private int fin;
    
    CSimpleD(){
        ini = 0;
        fin = 0;
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
    
    void adicionar (Departamento elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    	}
    	else {
    		System.out.println ("Cola Estudiante llena");
    	}
    }
    
    Departamento eliminar (){
    	Departamento elem = new Departamento();
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
    		System.out.println("\n---> Datos de la Cola Simple (Departamentos) <---");
    		System.out.println("*****************************************************************************************************");
    		CSimpleD aux = new CSimpleD();
    		while (!esVacia ()) {
    			Departamento elem = eliminar ();
    			elem.mostrarD();
    			aux.adicionar (elem);
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (CSimpleD a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    void llenar(Departamento W, int n) {
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		Departamento elem = new Departamento();
    		elem.leerD();
    		adicionar(elem);
    	}
    }
    
}