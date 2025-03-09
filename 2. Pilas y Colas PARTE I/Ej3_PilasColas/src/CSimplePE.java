import java.util.*;

public class CSimplePE {
	private int max = 100;
    private PilaPE v[] = new PilaPE[max+1];
    private int ini;
    private int fin;
    
    
    CSimplePE(){
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
    
    void adicionar (PilaPE elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    		
    	}
    	else {
    		System.out.println ("Cola PilaPE llena");
    	}
    }
    
    PilaPE eliminar (){
    	PilaPE elem = new PilaPE();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola PilaPE vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("\n---> Datos de la Cola Simple (PilaPE) <---");
    		System.out.println("*****************************************************************************************************");
    		CSimplePE aux = new CSimplePE();
    		while (!esVacia ()) {
    			PilaPE elem = eliminar ();
    			elem.mostrar();
    			aux.adicionar (elem);
    		}
    		System.out.println("*****************************************************************************************************");
    		vaciar(aux);
    	}
    	else {
    		System.out.println("Cola Simple vacia");
    	}
    }
    
    void vaciar (CSimplePE a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    void llenar(PilaPE W, int n) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("");
    	for(int i=1; i<=n; i++) {
    		PilaPE elem = new PilaPE();
    		System.out.print("Cant. Elementos");
    		int x = teclado.nextInt();
    		
    		elem.llenar(x);
    		adicionar(elem);
    	}
    }
}
	





