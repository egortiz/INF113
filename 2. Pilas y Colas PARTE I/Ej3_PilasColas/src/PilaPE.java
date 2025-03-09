import java.util.*;

public class PilaPE {
	private int max = 100;
	private Pedido v[] = new Pedido[max+1];
	private int tope;
	private String nombre;
	
	PilaPE(){
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
    
    void adicionar (Pedido elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena!!! ");
	    }
    }
    	
    Pedido eliminar (){
    	Pedido elem = new Pedido();
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
    		System.out.println("\n---> Datos de la Pila (Pedido) <---");
    		//System.out.println("*****************************************************************************************************");
    		System.out.println("Nombre Comenzal : "+nombre+"\n");
    		PilaPE aux = new PilaPE ();
    		while (!esVacia ()){
    			Pedido elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarP();
    		}
    		//System.out.println("*****************************************************************************************************");
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.print("Nombre Comenzal: ");
    	this.nombre = teclado.nextLine();
    	for(int i=1; i<=n;i++) {
    		Pedido z = new Pedido();
			z.leerP();
			adicionar(z);	
			}
    }
    
    void vaciar (PilaPE a){
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