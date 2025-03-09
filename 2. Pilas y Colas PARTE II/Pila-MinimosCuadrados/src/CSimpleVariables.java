import java.util.*;

public class CSimpleVariables {
	private int max = 100;
    private PilaVariables v[] = new PilaVariables[max+1];
    private int ini;
    private int fin;
    
    
    CSimpleVariables(){
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
    
    void adicionar (PilaVariables elem){
    	if (!esLlena ()){
    		fin++;       //v[fin+1]=elem;
    		v [fin] = elem;  //fin++;
    		
    	}
    	else {
    		System.out.println ("Cola PilaVariables llena");
    	}
    }
    
    PilaVariables eliminar (){
    	PilaVariables elem = new PilaVariables();
    	if (!esVacia ()){
    		ini++;
    		elem = v [ini];
    		if (ini == fin) {
	    	ini = fin = 0;
	    	}
    	}
    	else {
    		System.out.println ("Cola PilaVariables vacia");
	    }
	    return (elem);
    }
   
    void mostrar (){
    	if(!esVacia()) {
    		System.out.println("\n---> Datos de la Cola Simple (PilaVariables) <---");
    		System.out.println("*****************************************************************************************************");
    		CSimpleVariables aux = new CSimpleVariables();
    		while (!esVacia ()) {
    			PilaVariables elem = eliminar ();
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
    
    void vaciar (CSimpleVariables a){
    	while (!a.esVacia ()) {
    		adicionar(a.eliminar());
    	}
    } 
    
    void llenar(PilaVariables W, int n) {
    	Scanner teclado = new Scanner(System.in);
    	for(int i=1; i<=n; i++) {
    		PilaVariables elem = new PilaVariables();
    		System.out.print("Cant. Repeticiones: ");
    		int x = teclado.nextInt();
    		elem.llenar(x);
    		adicionar(elem);
    	}
    }
}

