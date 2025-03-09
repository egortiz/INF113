import java.util.*;
public class pilaMateria {
	private int max;
	private Materia v[]; 
	private int tope;
	private String semestre;  // <--- Adicionando atributo
	
	
	pilaMateria(){
        tope = 0;
        max = 100;
        v = new Materia[max+1];
        semestre = "";   // <--- Inicializar elemento Adicionado
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
    	if (tope == max) {
    		return (true);
    	}
    	else {
    		return (false);
    	}
    }
    
    int nroElem (){
    	return (tope);
    	}
    
    void adicionar (Materia elem){
    	if (!esLlena ()){
    		tope++;     
    		v [tope] = elem;  
    		}
    	else {
	    System.out.println ("Pila llena");
	    }
    }
    	
    Materia eliminar (){
    	Materia elem = new Materia();
    	if (!esVacia ()){
    		elem = v [tope];
    		tope--;
    	}
    	else {
    		System.out.println ("---> Pila vacia <---");
    	}
    	return (elem);
    }
    
    void mostrar (){
    	if (esVacia ()) {
    		System.out.println ("---> Pila vacia <---");
    	}
    	else{
    		System.out.println ("\nMateria de la Pila: "+"["+semestre+"]");
    		
    		System.out.println("********************************************************************************" );
    		pilaMateria aux = new pilaMateria ();
    		while (!esVacia ()){
    			Materia elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrarM();
    		}
    		System.out.println("********************************************************************************" );
    		vaciar(aux);
	    }
    }
    
    void llenar(int n) {
    	for(int i=1; i<=n;i++) {
    		Materia z = new Materia();
			z.leerM();
			adicionar(z);	
		}
    }
    
    void vaciar (pilaMateria a){
    	while (!a.esVacia ()) {
    		adicionar (a.eliminar ());
    	}
    }

    // Adicionar Getters y Setters Semestre
	public String getSemestre() {
		return semestre;
	}


	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}  
    
}
