import java.util.*;

public class PilaVariables {
	private int max = 100;
	private Variable v[] = new Variable[max+1];
	private int tope;
	private String nombre;
	
	PilaVariables(){
		tope=0;
		nombre = "";  
    }
   
	boolean esVacia (){
    	if (tope == 0) {
    		return (true);
    	}
    	else {
    		return (false);
    		}
    }
    
    boolean esLlena (){
    	if (tope == (max)) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    int nroElem (){
    	return (tope);
    	}
    
    void adicionar (Variable elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Variable eliminar (){
    	Variable elem = new Variable();
    	if (!esVacia ()){
    		elem = v [tope];
    		tope--;
    	}
    	else {
    		System.out.println ("Pila vacia");
    	}
    	return (elem);
    }
    
    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("Pila vacia");
    	}
    	else{
    		System.out.println("\n---> Datos de la Pila (Variable) <---");
    		//System.out.println("*****************************************************************************************************");
    		System.out.println("Nombre Variable : "+nombre+"\n");
    		PilaVariables aux = new PilaVariables ();
    		while (!esVacia ()){
    			Variable elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarV();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("--------------------------------------------");
    	System.out.print("Variable: ");
    	
    	this.nombre = teclado.nextLine();
    	for(int i=1; i<=n;i++) {
    		Variable z = new Variable();
    		System.out.print("--> ");
			z.leerV();
			adicionar(z);	
			}
    }
    
    void vaciar (PilaVariables a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }  
    
    // Getters Setters Nombre
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
